/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.io.Serializable;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lenovo
 */
public class Medico implements Serializable{
	
	private SimpleStringProperty id_Medico;
	private SimpleStringProperty cedula;
	private SimpleStringProperty primerNombre;
	private SimpleStringProperty segundoNombre;
	private SimpleStringProperty PrimeApellido;
	private SimpleStringProperty SegundoApellido;
	private SimpleStringProperty telefono;
	private SimpleStringProperty direccion;
	private SimpleStringProperty correo;
	private SimpleStringProperty imageURL;

	public Medico() {
	
	}

	public Medico(String id_Medico, String cedula, String primerNombre, String segundoNombre, String PrimeApellido, String SegundoApellido, String telefono, String direccion, String correo, String imageURL) {
		this.id_Medico = new SimpleStringProperty(id_Medico);
		this.cedula = new SimpleStringProperty(cedula);
		this.primerNombre = new SimpleStringProperty(primerNombre);
		this.segundoNombre = new SimpleStringProperty(segundoNombre);
		this.PrimeApellido = new SimpleStringProperty(PrimeApellido);
		this.SegundoApellido = new SimpleStringProperty(SegundoApellido);
		this.telefono = new SimpleStringProperty(telefono);
		this.direccion = new SimpleStringProperty(direccion);
		this.correo = new SimpleStringProperty(correo);
		this.imageURL = new SimpleStringProperty(imageURL);
	}
	
		public Medico(String cedula, String primerNombre, String segundoNombre, String PrimeApellido, String SegundoApellido, String telefono, String direccion, String correo, String imageURL) {
		this.cedula = new SimpleStringProperty(cedula);
		this.primerNombre = new SimpleStringProperty(primerNombre);
		this.segundoNombre = new SimpleStringProperty(segundoNombre);
		this.PrimeApellido = new SimpleStringProperty(PrimeApellido);
		this.SegundoApellido = new SimpleStringProperty(SegundoApellido);
		this.telefono = new SimpleStringProperty(telefono);
		this.direccion = new SimpleStringProperty(direccion);
		this.correo = new SimpleStringProperty(correo);
		this.imageURL = new SimpleStringProperty(imageURL);
	}

	public SimpleStringProperty getId_Medico() {
		return id_Medico;
	}

	public void setId_Medico(SimpleStringProperty id_Medico) {
		this.id_Medico = id_Medico;
	}

	public SimpleStringProperty getCedula() {
		return cedula;
	}

	public void setCedula(SimpleStringProperty cedula) {
		this.cedula = cedula;
	}

	public SimpleStringProperty getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(SimpleStringProperty primerNombre) {
		this.primerNombre = primerNombre;
	}

	public SimpleStringProperty getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(SimpleStringProperty segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public SimpleStringProperty getPrimeApellido() {
		return PrimeApellido;
	}

	public void setPrimeApellido(SimpleStringProperty PrimeApellido) {
		this.PrimeApellido = PrimeApellido;
	}

	public SimpleStringProperty getSegundoApellido() {
		return SegundoApellido;
	}

	public void setSegundoApellido(SimpleStringProperty SegundoApellido) {
		this.SegundoApellido = SegundoApellido;
	}

	public SimpleStringProperty getTelefono() {
		return telefono;
	}

	public void setTelefono(SimpleStringProperty telefono) {
		this.telefono = telefono;
	}

	public SimpleStringProperty getDireccion() {
		return direccion;
	}

	public void setDireccion(SimpleStringProperty direccion) {
		this.direccion = direccion;
	}

	public SimpleStringProperty getCorreo() {
		return correo;
	}

	public void setCorreo(SimpleStringProperty correo) {
		this.correo = correo;
	}

	public SimpleStringProperty getImageURL() {
		return imageURL;
	}

	public void setImageURL(SimpleStringProperty imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 97 * hash + Objects.hashCode(this.id_Medico);
		hash = 97 * hash + Objects.hashCode(this.cedula);
		hash = 97 * hash + Objects.hashCode(this.primerNombre);
		hash = 97 * hash + Objects.hashCode(this.segundoNombre);
		hash = 97 * hash + Objects.hashCode(this.PrimeApellido);
		hash = 97 * hash + Objects.hashCode(this.SegundoApellido);
		hash = 97 * hash + Objects.hashCode(this.telefono);
		hash = 97 * hash + Objects.hashCode(this.direccion);
		hash = 97 * hash + Objects.hashCode(this.correo);
		hash = 97 * hash + Objects.hashCode(this.imageURL);
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
		final Medico other = (Medico) obj;
		if (!Objects.equals(this.id_Medico, other.id_Medico)) {
			return false;
		}
		if (!Objects.equals(this.cedula, other.cedula)) {
			return false;
		}
		if (!Objects.equals(this.primerNombre, other.primerNombre)) {
			return false;
		}
		if (!Objects.equals(this.segundoNombre, other.segundoNombre)) {
			return false;
		}
		if (!Objects.equals(this.PrimeApellido, other.PrimeApellido)) {
			return false;
		}
		if (!Objects.equals(this.SegundoApellido, other.SegundoApellido)) {
			return false;
		}
		if (!Objects.equals(this.telefono, other.telefono)) {
			return false;
		}
		if (!Objects.equals(this.direccion, other.direccion)) {
			return false;
		}
		if (!Objects.equals(this.correo, other.correo)) {
			return false;
		}
		if (!Objects.equals(this.imageURL, other.imageURL)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Medico{" + "id_Medico=" + id_Medico + ", cedula=" + cedula + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", PrimeApellido=" + PrimeApellido + ", SegundoApellido=" + SegundoApellido + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", imageURL=" + imageURL + '}';
	}
}
