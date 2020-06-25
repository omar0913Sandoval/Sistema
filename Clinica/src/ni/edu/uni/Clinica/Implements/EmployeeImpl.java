/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Implements;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import ni.edu.uni.Clinica.Idao.EmployeeIDao;
import ni.edu.uni.Clinica.Model.Employee;
import ni.edu.uni.Clinica.Model.RandomBusqueda;

/**
 *
 * @author Lenovo
 */
public class EmployeeImpl implements EmployeeIDao{

	
	private RandomAccessFile hraf;
	private RandomAccessFile draf;
	private RandomAccessFile hdraf;
	private final int SIZE = 900;
	private final String HEADER_FILE_NAME = "hempleado.dat";
	private final String DATA_FILE_NAME = "dempleado.dat";
	private final String DATA_FILE_HOME = "Home.dat";

	public EmployeeImpl() {
	    RandomBusqueda.SIZE = 4;
	}

	private void open() throws IOException {

	    File hfile = new File(HEADER_FILE_NAME);
	    File dfile = new File(DATA_FILE_NAME);

	    if (!hfile.exists()) {
		hfile.createNewFile();
		hraf = new RandomAccessFile(hfile, "rw");
		draf = new RandomAccessFile(dfile, "rw");
		hraf.seek(0);
		hraf.writeInt(0);
		hraf.writeInt(0);
	    } else {
		hraf = new RandomAccessFile(hfile, "rw");
		draf = new RandomAccessFile(dfile, "rw");
	    }

	}
	
	private void Open() throws IOException
	{
		File hfile = new File(HEADER_FILE_NAME);
		File dfiel = new File(DATA_FILE_HOME);
		
		if(!hfile.exists())
		{
			hfile.createNewFile();
			hraf = new RandomAccessFile(hfile, "rw");
			hraf = new RandomAccessFile(dfiel, "rw");

			hraf.seek(0);
			hraf.writeInt(0);//Valor n
			hraf.writeInt(0);//Valor k
		} else
		{
			hraf = new RandomAccessFile(hfile, "rw");
			hraf = new RandomAccessFile(dfiel, "rw");
		}
	}
	
	private void Close() throws IOException
	{
		if(hraf != null)
		{
			hraf.close();
			hraf = null;
		} 
		if(hdraf != null)
		{
			draf.close();
			draf = null;
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
	
	@Override
	public Employee findByID(int id) throws IOException {
		open();
		hraf.seek(0);
		int n = hraf.readInt();
		int k = hraf.readInt();
		if(n == 0){
		    close();
		    return null;
		}

		RandomBusqueda.hraf = hraf;
		int pos = RandomBusqueda.runBinarySearchRecursively(id, 0, n);
		if (pos < 0) {
		    close();
		    return null;
		}
		long hpos = 8 + 4 * (pos);
		hraf.seek(hpos);
		int index = hraf.readInt();

		long dpos = (index - 1) * SIZE;
		draf.seek(dpos);

		Employee e = new Employee();
		e.setId_Empleado(draf.readUTF());
		e.setPrimerNombre(draf.readUTF());
		e.setPrimerApellido(draf.readUTF());
		e.setTelefono(draf.readUTF());
		e.setSalario(draf.readUTF());
		e.setEspecialidad(draf.readUTF());
		e.setDireccion(draf.readUTF());
		e.setCorreo(draf.readUTF());
		e.setCedula(draf.readUTF());
		e.setUrlImagen(draf.readUTF());

		close();
		return e;
	}//final Busqueda por ID

	@Override
	public Employee find(Comparator<Employee> comparar) throws IOException {
		return null;
	}

	@Override
	public List<Employee> any(Predicate<Employee> fun) throws IOException {
		return null;
	}

	@Override
	public void save(Employee t) throws IOException {
		open();
		hraf.seek(0);
		int n = hraf.readInt();
		int k = hraf.readInt();

		long pos = k * SIZE;

		draf.seek(pos);

		draf.writeInt(++k);
		draf.writeUTF(t.getPrimerNombre());
		draf.writeUTF(t.getPrimerApellido());
		draf.writeUTF(t.getTelefono());
		draf.writeUTF(t.getSalario());
		draf.writeUTF(t.getEspecialidad());
		draf.writeUTF(t.getDireccion());
		draf.writeUTF(t.getCorreo());
		draf.writeUTF(t.getCedula());
		draf.writeUTF(t.getUrlImagen());
		
		hraf.seek(0);
		hraf.writeInt(++n);
		hraf.writeInt(k);

		long hpos = 8 + 4 * (n - 1);
		hraf.seek(hpos);
		hraf.writeInt(k);
		close();
	}

	@Override
	public int update(Employee t) throws IOException {
		open();
		hraf.seek(0);
		RandomBusqueda.hraf = hraf;
		int n = hraf.readInt();
		int pos = RandomBusqueda.runBinarySearchRecursively(Integer.parseInt(t.getId_Empleado()), 0, n);
		if (pos < 0) {
		    close();
		    return pos;
		}
		long hpos = 8 + 4 * (pos);
		hraf.seek(hpos);
		int id = hraf.readInt();

		long dpos = (id - 1) * SIZE;
		draf.seek(dpos);

		draf.writeUTF(t.getId_Empleado());
		draf.writeUTF(t.getPrimerNombre());
		draf.writeUTF(t.getPrimerApellido());
		draf.writeUTF(t.getTelefono());
		draf.writeUTF(t.getSalario());
		draf.writeUTF(t.getEspecialidad());
		draf.writeUTF(t.getDireccion());
		draf.writeUTF(t.getCorreo());
		draf.writeUTF(t.getCedula());
		draf.writeUTF(t.getUrlImagen());

		close();
		return Integer.parseInt(t.getId_Empleado());
	}//final de la Funcion de Actualizar

	@Override
	public boolean delete(Employee t) throws IOException {
		File tmp = new File("tmp.dat");
		try (RandomAccessFile tmpraf = new RandomAccessFile(tmp, "rw")) {
			open();
			hraf.seek(0);
			int n = hraf.readInt();
			int k = hraf.readInt();
			int Id = Integer.parseInt(t.getId_Empleado());
			
			tmpraf.seek(0);
			tmpraf.writeInt(n - 1);
			tmpraf.writeInt(k);
			int j = 0;
			for (int i = 0; i < n; i++) {
				long hpos = 8 + 4 * i;
				hraf.seek(hpos);
				int id = hraf.readInt();
				if (id == Id) {
				    continue;
				}
				long tmpos = 8 + 4 * j++;
				tmpraf.seek(tmpos);
				tmpraf.writeInt(id);
			}
			close();
		}
		close();
		File f = new File(HEADER_FILE_NAME);
		boolean flag = f.delete();
		if (flag) {
		    tmp.renameTo(f);
		} else {
		    Logger.getLogger(EmployeeImpl.class.getName()).log(Level.SEVERE, "ERROR, no se pudo eliminar el archivo!");
		}
		return flag;
	}//final Delete

	@Override
	public List<Employee> findAll() throws IOException {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		open();
		List<Employee> empleados = new ArrayList<>();
		hraf.seek(0);
		int n = hraf.readInt();

		for (int i = 0; i < n; i++) {
		    long hpos = 8 + 4 * i;
		    hraf.seek(hpos);
		    int id = hraf.readInt();

		    long dpos = (id - 1) * SIZE;
		    draf.seek(dpos);

		    Employee e = new Employee();
		    e.setId_Empleado(draf.readUTF());
		    e.setPrimerNombre(draf.readUTF());
		    e.setPrimerApellido(draf.readUTF());
		    e.setTelefono(draf.readUTF());
		    e.setSalario(draf.readUTF());
		    e.setEspecialidad(draf.readUTF());
		    e.setDireccion(draf.readUTF());
		    e.setCorreo(draf.readUTF());
		    e.setCedula(draf.readUTF());
		    e.setUrlImagen(draf.readUTF());
		    empleados.add(e);
		}

		close();
		return empleados;
	}
	
	public List<Employee> findHomeAll() throws IOException{
		open();
		List<Employee> emple = new ArrayList<>();
		hraf.seek(0);
		int n = hraf.readInt();
		
		for(int i = 0; i < n; i++){
			String id = draf.readUTF();
			String primerNombre = draf.readUTF();
			String primerApellido = draf.readUTF();
			String Telefono = draf.readUTF();
			String salario = draf.readUTF();
			String Especialidad = draf.readUTF();
			String direccion = draf.readUTF();
			String Correo = draf.readUTF();
			String cedula = draf.readUTF();
			String urlImage = draf.readUTF();
			Employee e = new Employee(id, primerNombre, Especialidad, Telefono);
			emple.add(e);
		}
		
		return emple;
	}
	
}//final de la clase




















