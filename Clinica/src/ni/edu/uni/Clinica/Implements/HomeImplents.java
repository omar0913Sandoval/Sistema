/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Implements;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.RandomAccess;
import ni.edu.uni.Clinica.Idao.HomeImpl;
import ni.edu.uni.Clinica.Model.Employee;
import ni.edu.uni.Clinica.Model.RandomBusqueda;

/**
 *
 * @author Lenovo
 */
public class HomeImplents implements HomeImpl{

	private RandomAccessFile hraf;
	private RandomAccessFile draf;
	private final int SIZE = 120;
	private final String HEADER_FILE_NAME = "hUsuarios.txt";
	private final String DATA_FILE_NAME = "dUsuarios.txt";
	private final String lectura = "rw";
	
	private void open() throws IOException {

	    File hfile = new File(HEADER_FILE_NAME);
	    File dfile = new File(DATA_FILE_NAME);

	    if (!hfile.exists()) {
		hfile.createNewFile();
		hraf = new RandomAccessFile(hfile, lectura);
		draf = new RandomAccessFile(dfile, lectura);
		hraf.seek(0);
		hraf.writeInt(0);
		hraf.writeInt(0);
	    } else {
		hraf = new RandomAccessFile(hfile, lectura);
		draf = new RandomAccessFile(dfile, lectura);
	    }

	}

	private void close() throws IOException {
	    if (hraf != null) {
		hraf.close();
		hraf = null;
	    }

	    if (draf != null) {
		draf.close();
		draf = null;
	    }
	}
	
	public HomeImplents() {
		RandomBusqueda.SIZE = 4;
	}
	
	
	@Override
	public void save(Employee t) throws IOException {
	}

	@Override
	public int update(Employee t) throws IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean delete(Employee t) throws IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Employee> findAll() throws IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	public List<Employee> UltimosRegistros() throws IOException{
		EmployeeImpl e = new EmployeeImpl();
		e.findAll();
		return (List<Employee>) e;
	}
}//Final de la clase
