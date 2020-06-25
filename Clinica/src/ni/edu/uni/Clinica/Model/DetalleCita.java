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
public class DetalleCita implements Serializable{
	
	private SimpleStringProperty id_DetalleCita;
	private SimpleStringProperty id_Cita;
	private SimpleStringProperty id_Medicamento;
	private SimpleStringProperty cantidadMedicamento;

	public DetalleCita() {
	
	}

	public DetalleCita(String id_DetalleCita, String id_Cita, String id_Medicamento, String cantidadMedicamento) {
		this.id_DetalleCita = new SimpleStringProperty(id_DetalleCita);
		this.id_Cita = new SimpleStringProperty(id_Cita);
		this.id_Medicamento = new SimpleStringProperty(id_Medicamento);
		this.cantidadMedicamento = new SimpleStringProperty(cantidadMedicamento);
	}

	
	public DetalleCita(String id_Cita, String id_Medicamento, String cantidadMedicamento) {
		this.id_Cita = new SimpleStringProperty(id_Cita);
		this.id_Medicamento = new SimpleStringProperty(id_Medicamento);
		this.cantidadMedicamento = new SimpleStringProperty(cantidadMedicamento);
	}

	public SimpleStringProperty getId_DetalleCita() {
		return id_DetalleCita;
	}

	public void setId_DetalleCita(SimpleStringProperty id_DetalleCita) {
		this.id_DetalleCita = id_DetalleCita;
	}

	public SimpleStringProperty getId_Cita() {
		return id_Cita;
	}

	public void setId_Cita(SimpleStringProperty id_Cita) {
		this.id_Cita = id_Cita;
	}

	public SimpleStringProperty getId_Medicamento() {
		return id_Medicamento;
	}

	public void setId_Medicamento(SimpleStringProperty id_Medicamento) {
		this.id_Medicamento = id_Medicamento;
	}

	public SimpleStringProperty getCantidadMedicamento() {
		return cantidadMedicamento;
	}

	public void setCantidadMedicamento(SimpleStringProperty cantidadMedicamento) {
		this.cantidadMedicamento = cantidadMedicamento;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.id_DetalleCita);
		hash = 79 * hash + Objects.hashCode(this.id_Cita);
		hash = 79 * hash + Objects.hashCode(this.id_Medicamento);
		hash = 79 * hash + Objects.hashCode(this.cantidadMedicamento);
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
		final DetalleCita other = (DetalleCita) obj;
		if (!Objects.equals(this.id_DetalleCita, other.id_DetalleCita)) {
			return false;
		}
		if (!Objects.equals(this.id_Cita, other.id_Cita)) {
			return false;
		}
		if (!Objects.equals(this.id_Medicamento, other.id_Medicamento)) {
			return false;
		}
		if (!Objects.equals(this.cantidadMedicamento, other.cantidadMedicamento)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DetalleCita{" + "id_DetalleCita=" + id_DetalleCita + ", id_Cita=" + id_Cita + ", id_Medicamento=" + id_Medicamento + ", cantidadMedicamento=" + cantidadMedicamento + '}';
	}
	
	
}//final de la clase


