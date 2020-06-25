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
public class VisitasMedicas {
	//Primer Bloque
	private SimpleStringProperty id;
	private SimpleStringProperty fecha;
	private SimpleStringProperty Hora;
	//SegindoBloque
	private SimpleStringProperty TipoDeVisitaMedica;
	private SimpleStringProperty DescripcionVicita;
	//Tercer bloque
	private SimpleStringProperty NombrePaciente;
	private SimpleStringProperty nombreClinica;
	private SimpleStringProperty nombreDoctor;

	public VisitasMedicas() {
		
	}

	public VisitasMedicas(String id, String fecha, String Hora, String TipoDeVisitaMedica, String DescripcionVicita, String NombrePaciente, String nombreClinica, String nombreDoctor) {
		this.id = new SimpleStringProperty(id);
		this.fecha = new SimpleStringProperty(fecha);
		this.Hora = new SimpleStringProperty(Hora);
		this.TipoDeVisitaMedica = new SimpleStringProperty(TipoDeVisitaMedica);
		this.DescripcionVicita = new SimpleStringProperty(DescripcionVicita);
		this.NombrePaciente = new SimpleStringProperty(NombrePaciente);
		this.nombreClinica = new SimpleStringProperty(nombreClinica);
		this.nombreDoctor = new SimpleStringProperty(nombreDoctor);
	}
	

	public VisitasMedicas(String fecha, String Hora, String TipoDeVisitaMedica, String DescripcionVicita, String NombrePaciente, String nombreClinica, String nombreDoctor) {
		this.fecha = new SimpleStringProperty(fecha);
		this.Hora = new SimpleStringProperty(Hora);
		this.TipoDeVisitaMedica = new SimpleStringProperty(TipoDeVisitaMedica);
		this.DescripcionVicita = new SimpleStringProperty(DescripcionVicita);
		this.NombrePaciente = new SimpleStringProperty(NombrePaciente);
		this.nombreClinica = new SimpleStringProperty(nombreClinica);
		this.nombreDoctor = new SimpleStringProperty(nombreDoctor);
	}

	public SimpleStringProperty getId() {
		return id;
	}

	public void setId(SimpleStringProperty id) {
		this.id = id;
	}

	public SimpleStringProperty getFecha() {
		return fecha;
	}

	public void setFecha(SimpleStringProperty fecha) {
		this.fecha = fecha;
	}

	public SimpleStringProperty getHora() {
		return Hora;
	}

	public void setHora(SimpleStringProperty Hora) {
		this.Hora = Hora;
	}

	public SimpleStringProperty getTipoDeVisitaMedica() {
		return TipoDeVisitaMedica;
	}

	public void setTipoDeVisitaMedica(SimpleStringProperty TipoDeVisitaMedica) {
		this.TipoDeVisitaMedica = TipoDeVisitaMedica;
	}

	public SimpleStringProperty getDescripcionVicita() {
		return DescripcionVicita;
	}

	public void setDescripcionVicita(SimpleStringProperty DescripcionVicita) {
		this.DescripcionVicita = DescripcionVicita;
	}

	public SimpleStringProperty getNombrePaciente() {
		return NombrePaciente;
	}

	public void setNombrePaciente(SimpleStringProperty NombrePaciente) {
		this.NombrePaciente = NombrePaciente;
	}

	public SimpleStringProperty getNombreClinica() {
		return nombreClinica;
	}

	public void setNombreClinica(SimpleStringProperty nombreClinica) {
		this.nombreClinica = nombreClinica;
	}

	public SimpleStringProperty getNombreDoctor() {
		return nombreDoctor;
	}

	public void setNombreDoctor(SimpleStringProperty nombreDoctor) {
		this.nombreDoctor = nombreDoctor;
	}

	@Override
	public String toString() {
		return "VisitasMedicas{" + "id=" + id + ", fecha=" + fecha + ", Hora=" + Hora + ", TipoDeVisitaMedica=" + TipoDeVisitaMedica + ", DescripcionVicita=" + DescripcionVicita + ", NombrePaciente=" + NombrePaciente + ", nombreClinica=" + nombreClinica + ", nombreDoctor=" + nombreDoctor + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 19 * hash + Objects.hashCode(this.id);
		hash = 19 * hash + Objects.hashCode(this.fecha);
		hash = 19 * hash + Objects.hashCode(this.Hora);
		hash = 19 * hash + Objects.hashCode(this.TipoDeVisitaMedica);
		hash = 19 * hash + Objects.hashCode(this.DescripcionVicita);
		hash = 19 * hash + Objects.hashCode(this.NombrePaciente);
		hash = 19 * hash + Objects.hashCode(this.nombreClinica);
		hash = 19 * hash + Objects.hashCode(this.nombreDoctor);
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
		final VisitasMedicas other = (VisitasMedicas) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.fecha, other.fecha)) {
			return false;
		}
		if (!Objects.equals(this.Hora, other.Hora)) {
			return false;
		}
		if (!Objects.equals(this.TipoDeVisitaMedica, other.TipoDeVisitaMedica)) {
			return false;
		}
		if (!Objects.equals(this.DescripcionVicita, other.DescripcionVicita)) {
			return false;
		}
		if (!Objects.equals(this.NombrePaciente, other.NombrePaciente)) {
			return false;
		}
		if (!Objects.equals(this.nombreClinica, other.nombreClinica)) {
			return false;
		}
		if (!Objects.equals(this.nombreDoctor, other.nombreDoctor)) {
			return false;
		}
		return true;
	}
	
}//final de la clase





