/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.io.Serializable;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;

/**
 *
 * @author Lenovo
 */
public class Employee implements Serializable{
		
	private String id_Empleado;
	private String primerNombre;
	private String primerApellido;
	private String telefono;
	private String salario;
	private String especialidad;
	private String direccion;
	private String correo;
	private String cedula;
	private String urlImagen;

	public Employee() {
	}

	public Employee(String id_Empleado, String primerNombre, String primerApellido, String telefono, String salario, String especialidad, String direccion, String correo,  String cedula, String urlImagen) {
		this.id_Empleado = id_Empleado;
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.telefono = telefono;
		this.salario = salario;
		this.especialidad = especialidad;
		this.direccion = direccion;
		this.correo = correo;
		this.cedula = cedula;
		this.urlImagen = urlImagen;
	}

	public Employee(String primerNombre, String primerApellido, String telefono, String salario, String especialidad, String direccion, String correo, String cedula, String urlImagen) {
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.telefono = telefono;
		this.salario = salario;
		this.especialidad = especialidad;
		this.direccion = direccion;
		this.correo = correo;
		this.cedula = cedula;
		this.urlImagen = urlImagen;
	}

	public Employee(String id_Empleado, String primerNombre, String telefono, String especialidad) {
		this.id_Empleado = id_Empleado;
		this.primerNombre = primerNombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	
	public String getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(String id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	@Override
	public String toString() {
		return "Employee{" + "id_Empleado=" + id_Empleado + ", primerNombre=" + primerNombre + ", primerApellido=" + primerApellido + ", telefono=" + telefono + ", salario=" + salario + ", especialidad=" + especialidad + ", direccion=" + direccion + ", correo=" + correo + ", cedula=" + cedula + ", urlImagen=" + urlImagen + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.id_Empleado);
		hash = 79 * hash + Objects.hashCode(this.primerNombre);
		hash = 79 * hash + Objects.hashCode(this.primerApellido);
		hash = 79 * hash + Objects.hashCode(this.telefono);
		hash = 79 * hash + Objects.hashCode(this.salario);
		hash = 79 * hash + Objects.hashCode(this.especialidad);
		hash = 79 * hash + Objects.hashCode(this.direccion);
		hash = 79 * hash + Objects.hashCode(this.correo);
		hash = 79 * hash + Objects.hashCode(this.cedula);
		hash = 79 * hash + Objects.hashCode(this.urlImagen);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Employee other = (Employee) obj;
		if (!Objects.equals(this.id_Empleado, other.id_Empleado)) {
			return false;
		}
		if (!Objects.equals(this.primerNombre, other.primerNombre)) {
			return false;
		}
		if (!Objects.equals(this.primerApellido, other.primerApellido)) {
			return false;
		}
		if (!Objects.equals(this.telefono, other.telefono)) {
			return false;
		}
		if (!Objects.equals(this.salario, other.salario)) {
			return false;
		}
		if (!Objects.equals(this.especialidad, other.especialidad)) {
			return false;
		}
		if (!Objects.equals(this.direccion, other.direccion)) {
			return false;
		}
		if (!Objects.equals(this.correo, other.correo)) {
			return false;
		}
		if (!Objects.equals(this.cedula, other.cedula)) {
			return false;
		}
		if (!Objects.equals(this.urlImagen, other.urlImagen)) {
			return false;
		}
		return true;
	}

	
}//final de la clase
