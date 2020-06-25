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
public class Cirugias {
	//Primer Bloque
	private SimpleStringProperty id;
	private SimpleStringProperty fecha;
	private SimpleStringProperty Hora;
	//SegindoBloque
	private SimpleStringProperty TipoDeCirugiaMedica;
	private SimpleStringProperty DescripcionCirugia;
	//Tercer bloque
	private SimpleStringProperty NombrePaciente;
	private SimpleStringProperty nombreClinica;
	private SimpleStringProperty nombreDoctor;

	public Cirugias() {
	
	}

	
	public Cirugias(String id, String fecha, String Hora, String TipoDeCirujia, String DescripcionCirugia, String NombrePaciente, String nombreClinica, String nombreDoctor) {
		this.id = new SimpleStringProperty(id);
		this.fecha = new SimpleStringProperty(fecha);
		this.Hora = new SimpleStringProperty(Hora);
		this.TipoDeCirugiaMedica = new SimpleStringProperty(TipoDeCirujia);
		this.DescripcionCirugia = new SimpleStringProperty(DescripcionCirugia);
		this.NombrePaciente = new SimpleStringProperty(NombrePaciente);
		this.nombreClinica = new SimpleStringProperty(nombreClinica);
		this.nombreDoctor = new SimpleStringProperty(nombreDoctor);
	}
	
	
	public Cirugias(String fecha, String Hora, String TipoDeCirujia, String DescripcionCirugia, String NombrePaciente, String nombreClinica, String nombreDoctor) {
		this.fecha = new SimpleStringProperty(fecha);
		this.Hora = new SimpleStringProperty(Hora);
		this.TipoDeCirugiaMedica = new SimpleStringProperty(TipoDeCirujia);
		this.DescripcionCirugia = new SimpleStringProperty(DescripcionCirugia);
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

	public SimpleStringProperty getTipoDeCirugiaMedica() {
		return TipoDeCirugiaMedica;
	}

	public void setTipoDeCirugiaMedica(SimpleStringProperty TipoDeCirugiaMedica) {
		this.TipoDeCirugiaMedica = TipoDeCirugiaMedica;
	}

	public SimpleStringProperty getDescripcionCirugia() {
		return DescripcionCirugia;
	}

	public void setDescripcionCirugia(SimpleStringProperty DescripcionCirugia) {
		this.DescripcionCirugia = DescripcionCirugia;
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
		return "Cirugias{" + "id=" + id + ", fecha=" + fecha + ", Hora=" + Hora + ", TipoDeCirugiaMedica=" + TipoDeCirugiaMedica + ", DescripcionCirugia=" + DescripcionCirugia + ", NombrePaciente=" + NombrePaciente + ", nombreClinica=" + nombreClinica + ", nombreDoctor=" + nombreDoctor + '}';
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 67 * hash + Objects.hashCode(this.id);
		hash = 67 * hash + Objects.hashCode(this.fecha);
		hash = 67 * hash + Objects.hashCode(this.Hora);
		hash = 67 * hash + Objects.hashCode(this.TipoDeCirugiaMedica);
		hash = 67 * hash + Objects.hashCode(this.DescripcionCirugia);
		hash = 67 * hash + Objects.hashCode(this.NombrePaciente);
		hash = 67 * hash + Objects.hashCode(this.nombreClinica);
		hash = 67 * hash + Objects.hashCode(this.nombreDoctor);
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
		final Cirugias other = (Cirugias) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.fecha, other.fecha)) {
			return false;
		}
		if (!Objects.equals(this.Hora, other.Hora)) {
			return false;
		}
		if (!Objects.equals(this.TipoDeCirugiaMedica, other.TipoDeCirugiaMedica)) {
			return false;
		}
		if (!Objects.equals(this.DescripcionCirugia, other.DescripcionCirugia)) {
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
	
}
