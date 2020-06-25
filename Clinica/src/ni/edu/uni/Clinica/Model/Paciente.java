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
public class Paciente implements Serializable{
	private SimpleStringProperty idPaciente;
	private SimpleStringProperty cedulaPaciente;
	private SimpleStringProperty primerNombre;
	private SimpleStringProperty segundoNombre;
	private SimpleStringProperty primerApellido;
	private SimpleStringProperty segundoApellido;
	private SimpleStringProperty telefono;
	private SimpleStringProperty direccion;
	private SimpleStringProperty correo;
	private SimpleStringProperty urlimage;

	public Paciente() {
	}

	public Paciente(String idPaciente, String cedulaPaciente, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion,String correo, String urlimage) {
		this.idPaciente =  new SimpleStringProperty(idPaciente);
		this.cedulaPaciente = new SimpleStringProperty(cedulaPaciente);
		this.primerNombre = new SimpleStringProperty(primerNombre);
		this.segundoNombre = new SimpleStringProperty(segundoNombre);
		this.primerApellido = new SimpleStringProperty(primerApellido);
		this.segundoApellido = new SimpleStringProperty(segundoApellido);
		this.telefono = new SimpleStringProperty(telefono);
		this.direccion = new SimpleStringProperty(direccion);
		this.correo = new SimpleStringProperty(correo);
		this.urlimage = new SimpleStringProperty(urlimage);
	}
	
	
	public Paciente( String cedulaPaciente, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion,String correo, String urlimage) {
		this.cedulaPaciente = new SimpleStringProperty(cedulaPaciente);
		this.primerNombre = new SimpleStringProperty(primerNombre);
		this.segundoNombre = new SimpleStringProperty(segundoNombre);
		this.primerApellido = new SimpleStringProperty(primerApellido);
		this.segundoApellido = new SimpleStringProperty(segundoApellido);
		this.telefono = new SimpleStringProperty(telefono);
		this.direccion = new SimpleStringProperty(direccion);
		this.correo = new SimpleStringProperty(correo);
		this.urlimage = new SimpleStringProperty(urlimage);
	}

	public SimpleStringProperty getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(SimpleStringProperty idPaciente) {
		this.idPaciente = idPaciente;
	}

	public SimpleStringProperty getCedulaPaciente() {
		return cedulaPaciente;
	}

	public void setCedulaPaciente(SimpleStringProperty cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
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

	public SimpleStringProperty getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(SimpleStringProperty primerApellido) {
		this.primerApellido = primerApellido;
	}

	public SimpleStringProperty getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(SimpleStringProperty segundoApellido) {
		this.segundoApellido = segundoApellido;
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

	public SimpleStringProperty getUrlimage() {
		return urlimage;
	}

	public void setUrlimage(SimpleStringProperty urlimage) {
		this.urlimage = urlimage;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 97 * hash + Objects.hashCode(this.idPaciente);
		hash = 97 * hash + Objects.hashCode(this.cedulaPaciente);
		hash = 97 * hash + Objects.hashCode(this.primerNombre);
		hash = 97 * hash + Objects.hashCode(this.segundoNombre);
		hash = 97 * hash + Objects.hashCode(this.primerApellido);
		hash = 97 * hash + Objects.hashCode(this.segundoApellido);
		hash = 97 * hash + Objects.hashCode(this.telefono);
		hash = 97 * hash + Objects.hashCode(this.direccion);
		hash = 97 * hash + Objects.hashCode(this.correo);
		hash = 97 * hash + Objects.hashCode(this.urlimage);
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
		final Paciente other = (Paciente) obj;
		if (!Objects.equals(this.idPaciente, other.idPaciente)) {
			return false;
		}
		if (!Objects.equals(this.cedulaPaciente, other.cedulaPaciente)) {
			return false;
		}
		if (!Objects.equals(this.primerNombre, other.primerNombre)) {
			return false;
		}
		if (!Objects.equals(this.segundoNombre, other.segundoNombre)) {
			return false;
		}
		if (!Objects.equals(this.primerApellido, other.primerApellido)) {
			return false;
		}
		if (!Objects.equals(this.segundoApellido, other.segundoApellido)) {
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
		if (!Objects.equals(this.urlimage, other.urlimage)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Paciente{" + "idPaciente=" + idPaciente + ", cedulaPaciente=" + cedulaPaciente + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", urlimage=" + urlimage + '}';
	}
}
