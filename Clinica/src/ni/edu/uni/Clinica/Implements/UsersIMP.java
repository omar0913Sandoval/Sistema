/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Implements;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ni.edu.uni.Clinica.Model.RandomBusqueda;
import ni.edu.uni.Clinica.Model.Usuario;
import ni.edu.uni.Clinica.Idao.Idao;
import ds.desktop.notify.DesktopNotify;
import javafx.scene.control.Label;

/**
 *
 * @author Lenovo
 */
public class UsersIMP implements Idao<Usuario>{
	
	private RandomAccessFile hraf;
	private RandomAccessFile draf;
	private final int SIZE = 80;
	private final String HEADER_FILE_NAME = "hUsuarios.txt";
	private final String DATA_FILE_NAME = "dUsuarios.txt";
	private final String lectura = "rw";
	
	
	public UsersIMP(){
	   RandomBusqueda.SIZE = 4;
	}

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
	
	@Override
	public void save(Usuario t) throws IOException {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		open();
		hraf.seek(0);
		int n = hraf.readInt();
		int k = hraf.readInt();

		long pos = k * SIZE;

		draf.seek(pos);

		draf.writeInt(++k);
		draf.writeUTF(t.getNombre());
		draf.writeUTF(t.getUsuario());
		draf.writeUTF(t.getPassword());

		hraf.seek(0);
		hraf.writeInt(++n);
		hraf.writeInt(k);

		long hpos = 8 + 4 * (n - 1);
		hraf.seek(hpos);
		hraf.writeInt(k);
		close();
	}

	@Override
	public int update(Usuario t) throws IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean delete(Usuario t) throws IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<Usuario> findAll() throws IOException {
		open();
		List<Usuario> listaUsuario = new ArrayList<>();
		hraf.seek(0);
		
		int n = hraf.readInt();
		
		for(int i =0; i < n; i++){
			long posHead = 8 + i * 4;
			hraf.seek(posHead);
			int id = hraf.readInt();
			
			long dataPos = (id -1)*SIZE;
			draf.seek(dataPos);
			
			Usuario u = new Usuario();
			
			u.setId(draf.readInt());
			u.setNombre(draf.readUTF());
			u.setUsuario(draf.readUTF());
			u.setPassword(draf.readUTF());
			
			listaUsuario.add(u);
		}//final del for
		close();
		return  listaUsuario;
	}
	
	
	public void busqueda(JFXTextField txtUsuario, JFXPasswordField txtContrasena) throws IOException{
		ArrayList<Usuario> users = (ArrayList<Usuario>) findAll();
		String usuario = txtUsuario.getText();
		String contrasena = txtContrasena.getText();
		
		Usuario user = new Usuario(usuario, contrasena);
		
		boolean encontrado = false;
	
		for(int i = 0; i<users.size(); i++){
			
			Usuario e = users.get(i);
			
			if(e.getUsuario().equals(user.getUsuario())){
				encontrado = true;
				break;
			}
		}
		
		if(encontrado == false){
			DesktopNotify.showDesktopMessage("Error!!!", "Losentimos no se encuentra el usuario o contrasena en nuestros registros, intentelo nuevamente", DesktopNotify.ERROR);
		} else{
			FXMLLoader loader = new FXMLLoader();
			
			Parent root = FXMLLoader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLMenuBorderPane.fxml"));
			
			Scene scena = new Scene(root);
		
			Stage stage = new Stage();
			stage.setScene(scena);
			stage.show();
			
			DesktopNotify.showDesktopMessage("Bienvenido "+"\n"+usuario+"\n"+"A su Sistema de clinica profesional",null, DesktopNotify.INFORMATION);
			encontrado = false;
		}
	}//final del metodo Busqueda
}//final de la clase
