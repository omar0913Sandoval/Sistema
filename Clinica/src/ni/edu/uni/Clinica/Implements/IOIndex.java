/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Implements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import ni.edu.uni.Clinica.Model.RandomBusqueda;

/**
 *
 * @author Lenovo
 */
public class IOIndex {
    private RandomAccessFile rafIndex;
    private File fIndex;
    private final int SIZE = 43;

    public IOIndex() {
    }

    private void open() throws FileNotFoundException, IOException {
        if (rafIndex != null) {
            return;
        }
        fIndex = new File("index.head");
        rafIndex = new RandomAccessFile(fIndex, "rw");
        if (rafIndex.length() <= 0) {
            rafIndex.seek(0);
            rafIndex.writeInt(0);
        }
    }

    private void close() throws IOException {
        if (rafIndex != null) {
            rafIndex.close();
        }
    }

    public void createIndex(Field fieldName) throws FileNotFoundException, IOException {
        open();
        rafIndex.seek(0);
        int n = rafIndex.readInt();

        if (n == 0) {
            rafIndex.seek(4);
            rafIndex.writeUTF(fieldName.getName());
        } else {
            
            int index =  RandomBusqueda.binarySearchIOIndex(rafIndex, fieldName.getName(), 0, n - 1);
            
            if (index >= 0) {
                throw new IllegalArgumentException("Index repetido");
            }
            index *= -1; 
            List<String> indexes = getKeys(index, n);
            
            int pos = 4 + index * SIZE;
            rafIndex.seek(pos);
            rafIndex.writeUTF(fieldName.getName());
            
            for (String key : indexes) {
                int posKey = 4 + SIZE * (++index);
                rafIndex.seek(posKey);
                rafIndex.writeUTF(key);
            }

        }

        rafIndex.seek(0);
        rafIndex.writeInt(++n);

        try (RandomAccessFile rafField = new RandomAccessFile(fieldName.getName() + ".index", "rw")) {
            if (rafField.length() <= 0) {
                rafField.seek(0);
                rafField.writeInt(0);
            }
        }
        close();
    }

    public RandomAccessFile getIndex(Field fieldName) throws IOException {
        RandomAccessFile raf = null;
        open();
        rafIndex.seek(0);
        int n = rafIndex.readInt();
        
        int index = RandomBusqueda.binarySearchIOIndex(rafIndex, fieldName.getName(), 0, n-1);
        if(index < 0){
            return raf;
        }
        
        int pos = 4 + index*SIZE;
        rafIndex.seek(pos);
        String key = rafIndex.readUTF();
        
        raf = new RandomAccessFile(key+".index", "rw");
        close();
        return raf;
    }

    private List<String> getKeys(int start, int n) throws IOException {
        List<String> indexes = new ArrayList<>();

        for (int i = start; i < n; i++) {
            long pos = 4 + i * SIZE;
            rafIndex.seek(pos);

            String key = rafIndex.readUTF();
            indexes.add(key);
        }

        return indexes;
    }
}

