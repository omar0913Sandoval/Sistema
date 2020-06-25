/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lenovo
 */
public class Cita extends RecursiveTreeObject<Cita>{
	
	private SimpleStringProperty id_Cita;
	private SimpleStringProperty id_Medico;
	private SimpleStringProperty id_Paciente;
	private SimpleStringProperty detalleCita;
	private SimpleStringProperty fechaCitaDate;
	private SimpleStringProperty hora_Cita;
	private SimpleStringProperty costoCita;

	public Cita() {
	}

	
	public Cita(String id_Cita, String id_Medico, String id_Paciente, String detalleCita, String fechaCitaDate, String hora_Cita, String costoCita) {
		this.id_Cita = new SimpleStringProperty(id_Cita);
		this.id_Medico = new SimpleStringProperty(id_Medico);
		this.id_Paciente = new SimpleStringProperty(id_Paciente);
		this.detalleCita = new SimpleStringProperty(detalleCita);
		this.fechaCitaDate = new SimpleStringProperty(fechaCitaDate);
		this.hora_Cita = new SimpleStringProperty(hora_Cita);
		this.costoCita = new SimpleStringProperty(costoCita);
	}
	
	public Cita(String id_Medico, String id_Paciente, String detalleCita, String fechaCitaDate, String hora_Cita, String costoCita) {
		this.id_Medico = new SimpleStringProperty(id_Medico);
		this.id_Paciente = new SimpleStringProperty(id_Paciente);
		this.detalleCita = new SimpleStringProperty(detalleCita);
		this.fechaCitaDate = new SimpleStringProperty(fechaCitaDate);
		this.hora_Cita = new SimpleStringProperty(hora_Cita);
		this.costoCita = new SimpleStringProperty(costoCita);
	}

	public SimpleStringProperty getId_Cita() {
		return id_Cita;
	}

	public void setId_Cita(SimpleStringProperty id_Cita) {
		this.id_Cita = id_Cita;
	}

	public SimpleStringProperty getId_Medico() {
		return id_Medico;
	}

	public void setId_Medico(SimpleStringProperty id_Medico) {
		this.id_Medico = id_Medico;
	}

	public SimpleStringProperty getId_Paciente() {
		return id_Paciente;
	}

	public void setId_Paciente(SimpleStringProperty id_Paciente) {
		this.id_Paciente = id_Paciente;
	}

	public SimpleStringProperty getDetalleCita() {
		return detalleCita;
	}

	public void setDetalleCita(SimpleStringProperty detalleCita) {
		this.detalleCita = detalleCita;
	}

	public SimpleStringProperty getFechaCitaDate() {
		return fechaCitaDate;
	}

	public void setFechaCitaDate(SimpleStringProperty fechaCitaDate) {
		this.fechaCitaDate = fechaCitaDate;
	}

	public SimpleStringProperty getHora_Cita() {
		return hora_Cita;
	}

	public void setHora_Cita(SimpleStringProperty hora_Cita) {
		this.hora_Cita = hora_Cita;
	}

	public SimpleStringProperty getCostoCita() {
		return costoCita;
	}

	public void setCostoCita(SimpleStringProperty costoCita) {
		this.costoCita = costoCita;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 89 * hash + Objects.hashCode(this.id_Cita);
		hash = 89 * hash + Objects.hashCode(this.id_Medico);
		hash = 89 * hash + Objects.hashCode(this.id_Paciente);
		hash = 89 * hash + Objects.hashCode(this.detalleCita);
		hash = 89 * hash + Objects.hashCode(this.fechaCitaDate);
		hash = 89 * hash + Objects.hashCode(this.hora_Cita);
		hash = 89 * hash + Objects.hashCode(this.costoCita);
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
		final Cita other = (Cita) obj;
		if (!Objects.equals(this.id_Cita, other.id_Cita)) {
			return false;
		}
		if (!Objects.equals(this.id_Medico, other.id_Medico)) {
			return false;
		}
		if (!Objects.equals(this.id_Paciente, other.id_Paciente)) {
			return false;
		}
		if (!Objects.equals(this.detalleCita, other.detalleCita)) {
			return false;
		}
		if (!Objects.equals(this.fechaCitaDate, other.fechaCitaDate)) {
			return false;
		}
		if (!Objects.equals(this.hora_Cita, other.hora_Cita)) {
			return false;
		}
		if (!Objects.equals(this.costoCita, other.costoCita)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Cita{" + "id_Cita=" + id_Cita + ", id_Medico=" + id_Medico + ", id_Paciente=" + id_Paciente + ", detalleCita=" + detalleCita + ", fechaCitaDate=" + fechaCitaDate + ", hora_Cita=" + hora_Cita + ", costoCita=" + costoCita + '}';
	}
	
}
