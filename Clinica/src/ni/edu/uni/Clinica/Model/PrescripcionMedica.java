/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lenovo
 */
public class PrescripcionMedica {
	
	private SimpleStringProperty id;
	private SimpleStringProperty NombrePaciente;
	private SimpleStringProperty SexoPaciente;
	private SimpleStringProperty FechaConsulta;
	private SimpleStringProperty Sintomas;
	private SimpleStringProperty Diagnosticos;
	private SimpleStringProperty Medicamentos;

	public PrescripcionMedica() {
	}

	public PrescripcionMedica(String id, String NombrePaciente, String SexoPaciente,String FechaConsulta, String Sintomas, String Diagnosticos, String Medicamentos) {
		this.id = new SimpleStringProperty(id);
		this.NombrePaciente = new SimpleStringProperty(NombrePaciente);
		this.SexoPaciente = new SimpleStringProperty(SexoPaciente);
		this.FechaConsulta = new SimpleStringProperty(FechaConsulta);
		this.Sintomas = new SimpleStringProperty(Sintomas);
		this.Diagnosticos = new SimpleStringProperty(Diagnosticos);
		this.Medicamentos = new SimpleStringProperty(Medicamentos);
	}
	
		public PrescripcionMedica( String NombrePaciente, String SexoPaciente,String FechaConsulta, String Sintomas, String Diagnosticos, String Medicamentos) {
		this.NombrePaciente = new SimpleStringProperty(NombrePaciente);
		this.SexoPaciente = new SimpleStringProperty(SexoPaciente);
		this.FechaConsulta = new SimpleStringProperty(FechaConsulta);
		this.Sintomas = new SimpleStringProperty(Sintomas);
		this.Diagnosticos = new SimpleStringProperty(Diagnosticos);
		this.Medicamentos = new SimpleStringProperty(Medicamentos);
	}

	public SimpleStringProperty getId() {
		return id;
	}

	public void setId(SimpleStringProperty id) {
		this.id = id;
	}

	public SimpleStringProperty getNombrePaciente() {
		return NombrePaciente;
	}

	public void setNombrePaciente(SimpleStringProperty NombrePaciente) {
		this.NombrePaciente = NombrePaciente;
	}

	public SimpleStringProperty getSexoPaciente() {
		return SexoPaciente;
	}

	public void setSexoPaciente(SimpleStringProperty SexoPaciente) {
		this.SexoPaciente = SexoPaciente;
	}

	public SimpleStringProperty getFechaConsulta() {
		return FechaConsulta;
	}

	public void setFechaConsulta(SimpleStringProperty FechaConsulta) {
		this.FechaConsulta = FechaConsulta;
	}

	public SimpleStringProperty getSintomas() {
		return Sintomas;
	}

	public void setSintomas(SimpleStringProperty Sintomas) {
		this.Sintomas = Sintomas;
	}

	public SimpleStringProperty getDiagnosticos() {
		return Diagnosticos;
	}

	public void setDiagnosticos(SimpleStringProperty Diagnosticos) {
		this.Diagnosticos = Diagnosticos;
	}

	public SimpleStringProperty getMedicamentos() {
		return Medicamentos;
	}

	public void setMedicamentos(SimpleStringProperty Medicamentos) {
		this.Medicamentos = Medicamentos;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 97 * hash + Objects.hashCode(this.id);
		hash = 97 * hash + Objects.hashCode(this.NombrePaciente);
		hash = 97 * hash + Objects.hashCode(this.SexoPaciente);
		hash = 97 * hash + Objects.hashCode(this.FechaConsulta);
		hash = 97 * hash + Objects.hashCode(this.Sintomas);
		hash = 97 * hash + Objects.hashCode(this.Diagnosticos);
		hash = 97 * hash + Objects.hashCode(this.Medicamentos);
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
		final PrescripcionMedica other = (PrescripcionMedica) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.NombrePaciente, other.NombrePaciente)) {
			return false;
		}
		if (!Objects.equals(this.SexoPaciente, other.SexoPaciente)) {
			return false;
		}
		if (!Objects.equals(this.FechaConsulta, other.FechaConsulta)) {
			return false;
		}
		if (!Objects.equals(this.Sintomas, other.Sintomas)) {
			return false;
		}
		if (!Objects.equals(this.Diagnosticos, other.Diagnosticos)) {
			return false;
		}
		if (!Objects.equals(this.Medicamentos, other.Medicamentos)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PrescripcionMedica{" + "id=" + id + ", NombrePaciente=" + NombrePaciente + ", SexoPaciente=" + SexoPaciente + ", FechaConsulta=" + FechaConsulta + ", Sintomas=" + Sintomas + ", Diagnosticos=" + Diagnosticos + ", Medicamentos=" + Medicamentos + '}';
	}
	
}
