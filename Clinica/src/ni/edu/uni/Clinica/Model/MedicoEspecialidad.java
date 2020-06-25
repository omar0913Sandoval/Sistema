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
public class MedicoEspecialidad implements Serializable{
	private SimpleStringProperty id_Me;
	private SimpleStringProperty id_Medico;
	private SimpleStringProperty id_Especialidad;

	public MedicoEspecialidad() {
	}

	public MedicoEspecialidad(String id_Me, String id_Medico, String id_Especialidad) {
		this.id_Me = new SimpleStringProperty(id_Me);
		this.id_Medico = new SimpleStringProperty(id_Medico);
		this.id_Especialidad = new SimpleStringProperty(id_Especialidad);
	}

	public MedicoEspecialidad(String id_Medico, String id_Especialidad) {
		this.id_Medico = new SimpleStringProperty(id_Medico);
		this.id_Especialidad = new SimpleStringProperty(id_Especialidad);
	}

	public SimpleStringProperty getId_Me() {
		return id_Me;
	}

	public void setId_Me(SimpleStringProperty id_Me) {
		this.id_Me = id_Me;
	}

	public SimpleStringProperty getId_Medico() {
		return id_Medico;
	}

	public void setId_Medico(SimpleStringProperty id_Medico) {
		this.id_Medico = id_Medico;
	}

	public SimpleStringProperty getId_Especialidad() {
		return id_Especialidad;
	}

	public void setId_Especialidad(SimpleStringProperty id_Especialidad) {
		this.id_Especialidad = id_Especialidad;
	}

	@Override
	public String toString() {
		return "MedicoEspecialidad{" + "id_Me=" + id_Me + ", id_Medico=" + id_Medico + ", id_Especialidad=" + id_Especialidad + '}';
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 61 * hash + Objects.hashCode(this.id_Me);
		hash = 61 * hash + Objects.hashCode(this.id_Medico);
		hash = 61 * hash + Objects.hashCode(this.id_Especialidad);
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
		final MedicoEspecialidad other = (MedicoEspecialidad) obj;
		if (!Objects.equals(this.id_Me, other.id_Me)) {
			return false;
		}
		if (!Objects.equals(this.id_Medico, other.id_Medico)) {
			return false;
		}
		if (!Objects.equals(this.id_Especialidad, other.id_Especialidad)) {
			return false;
		}
		return true;
	}
	
}//final de la clase

