/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;


/**
 *
 * @author Lenovo
 */
public class Usuario {
	private int id;//4Bytes
	private String nombre;
	private String Usuario;
	private String password;

	public Usuario() {
	}
	
	public Usuario(int id, String nombre, String Usuario, String password) {
		this.id = id;
		this.nombre = nombre;
		this.Usuario = Usuario;
		this.password = password;
	}

	public Usuario(String nombre, String Usuario, String password) {
		this.nombre = nombre;
		this.Usuario = Usuario;
		this.password = password;
	}

	public Usuario(String Usuario, String password) {
		this.Usuario = Usuario;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String Usuario) {
		this.Usuario = Usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", Usuario=" + Usuario + ", password=" + password + '}';
	}
}//final de la clase




