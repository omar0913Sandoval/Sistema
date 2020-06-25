/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;

/**
 *
 * @author Lenovo
 */
public class RandomBusqueda {
	public static RandomAccessFile hraf;
	public static int SIZE;
    
	public static int runBinarySearchRecursively(int key, int low, int high) throws IOException {
	    if(hraf == null){
		return -1;
	    }
	    int middle = (low + high) / 2;

	    if (high < low) {
		return -1;
	    }
	    long pos = 8 + SIZE * middle;
	    hraf.seek(pos);
	    int id = hraf.readInt();
	    if (key == id) {
		return middle;
	    } else if (key < id) {
		return runBinarySearchRecursively(key, low, middle - 1);
	    } else {
		return runBinarySearchRecursively(key, middle + 1, high);
	    }
	}
	
	
	public static int binarySearchString(RandomAccessFile draf, String key, int low, int high) throws IOException {
		int index = -high;

		while (low <= high) {
		    int mid = (low + high) / 2;
		    long pos = 8 + 4 * mid;
		    draf.seek(pos);
		    String User = draf.readUTF();
		    if (User.compareTo(key) < 0) {
			low = mid + 1;
		    } else if (User.compareTo(key) > 0) {
			index = -mid;
			high = mid - 1;                
		    } else if (User.compareTo(key) == 0) {
			index = mid;
			break;
		    }
		}
		return index;
	}
    
	public static int buscarRegistro(RandomAccessFile draf, String key, int low, int high) throws IOException { //key es el buscado
		int index = -high;
		Usuario user = null;
		while(low <= high){
			int mid = (low+high)/2;
			long posData = 8 + 4 *mid;
			draf.seek(posData);
			
			if(key == null){
				return -1;
			}
			
			String usuario = draf.readUTF(); // obtnemos el nombre
			
			if(user.getUsuario().equals(usuario)){
				return 1;
			} else {
			}
		}
		return -1;
	}
	public static <T> int binarySearch(RandomAccessFile raf,T key, Comparator<T> c, int low, int high) throws IOException {
		int index = -high;

		while (low <= high) {
		int mid = (low + high) / 2;
		long pos = 8 + 4 * mid;
		raf.seek(pos);
		T id = (T) raf.readUTF();
		if (c.compare(id,key) < 0) {
		    low = mid + 1;
		} else if (c.compare(id,key) > 0) {
		    index = -mid;
		    high = mid - 1;                
		} else if (c.compare(id,key) == 0) {
		    index = mid;
		    break;
		}
	    }
	    return index;
	}
	public static int binarySearchIOIndex(RandomAccessFile raf, String key, int low, int high) throws IOException {
		 int index = -high;

		while (low <= high) {
		    int mid = (low + high) / 2;
		    long pos = 8 + 4 * mid;
		    raf.seek(pos);
		    String id = raf.readUTF();
		    if (id.compareTo(key) < 0) {
			low = mid + 1;
		    } else if (id.compareTo(key) > 0) {
			index = -mid;
			high = mid - 1;                
		    } else if (id.compareTo(key) == 0) {
			index = mid;
			break;
		    }
		}
		return index;
	}
	
	
	public static int binarySearchCliente(RandomAccessFile raf, int key, int low, int high) throws IOException{
	    int index = -1;

	    while (low <= high) {
		int mid = (low + high) / 2;
		long pos = 8 + 4 * mid;
		raf.seek(pos);
		int id = raf.readInt();
		if (id < key) {
		    low = mid + 1;
		} else if (id > key) {
		    high = mid - 1;
		} else if (id == key) {
		    index = mid;
		    break;
		}
	    }
	    return index;
	}
}
