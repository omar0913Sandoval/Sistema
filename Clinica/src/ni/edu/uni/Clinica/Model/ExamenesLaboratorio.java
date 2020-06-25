
package ni.edu.uni.Clinica.Model;

import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;

public class ExamenesLaboratorio {
		
	private SimpleStringProperty id;
	private SimpleStringProperty fecha;
	private SimpleStringProperty Hora;
	//Segundo Bloque
	private SimpleStringProperty Temperatura;
	private SimpleStringProperty peso;
	private SimpleStringProperty Altura;
	private SimpleStringProperty TipodeExamen;
	//Tercer Bloque
	private SimpleStringProperty Sintomas;
	private SimpleStringProperty dagnosticos;
	private SimpleStringProperty resultados;
	//Cuarto Bloque
	private SimpleStringProperty nombrePaciente;
	private SimpleStringProperty nombreClinica;
	private SimpleStringProperty nombreDoctor;

	public ExamenesLaboratorio() {
	}

	
	public ExamenesLaboratorio(String id, String fecha, String Hora, String Temperatura, String peso, String Altura, String TipodeExamen, String Sintomas, String dagnosticos, String resultados, String nombrePaciente, String nombreClinica, String nombreDoctor) {
		this.id = new SimpleStringProperty(id);
		this.fecha = new SimpleStringProperty(fecha);
		this.Hora = new SimpleStringProperty(Hora);
		this.Temperatura = new SimpleStringProperty(Temperatura);
		this.peso = new SimpleStringProperty(peso);
		this.Altura = new SimpleStringProperty(Altura);
		this.TipodeExamen = new SimpleStringProperty(TipodeExamen);
		this.Sintomas = new SimpleStringProperty(Sintomas);
		this.dagnosticos = new SimpleStringProperty(dagnosticos);
		this.resultados = new SimpleStringProperty(resultados);
		this.nombrePaciente = new SimpleStringProperty(nombrePaciente);
		this.nombreClinica = new SimpleStringProperty(nombreClinica);
		this.nombreDoctor = new SimpleStringProperty(nombreDoctor);
	}

		public ExamenesLaboratorio(String fecha, String Hora, String Temperatura, String peso, String Altura, String TipodeExamen, String Sintomas, String dagnosticos, String resultados, String nombrePaciente, String nombreClinica, String nombreDoctor) {
		this.fecha = new SimpleStringProperty(fecha);
		this.Hora = new SimpleStringProperty(Hora);
		this.Temperatura = new SimpleStringProperty(Temperatura);
		this.peso = new SimpleStringProperty(peso);
		this.Altura = new SimpleStringProperty(Altura);
		this.TipodeExamen = new SimpleStringProperty(TipodeExamen);
		this.Sintomas = new SimpleStringProperty(Sintomas);
		this.dagnosticos = new SimpleStringProperty(dagnosticos);
		this.resultados = new SimpleStringProperty(resultados);
		this.nombrePaciente = new SimpleStringProperty(nombrePaciente);
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

	public SimpleStringProperty getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(SimpleStringProperty Temperatura) {
		this.Temperatura = Temperatura;
	}

	public SimpleStringProperty getPeso() {
		return peso;
	}

	public void setPeso(SimpleStringProperty peso) {
		this.peso = peso;
	}

	public SimpleStringProperty getAltura() {
		return Altura;
	}

	public void setAltura(SimpleStringProperty Altura) {
		this.Altura = Altura;
	}

	public SimpleStringProperty getTipodeExamen() {
		return TipodeExamen;
	}

	public void setTipodeExamen(SimpleStringProperty TipodeExamen) {
		this.TipodeExamen = TipodeExamen;
	}

	public SimpleStringProperty getSintomas() {
		return Sintomas;
	}

	public void setSintomas(SimpleStringProperty Sintomas) {
		this.Sintomas = Sintomas;
	}

	public SimpleStringProperty getDagnosticos() {
		return dagnosticos;
	}

	public void setDagnosticos(SimpleStringProperty dagnosticos) {
		this.dagnosticos = dagnosticos;
	}

	public SimpleStringProperty getResultados() {
		return resultados;
	}

	public void setResultados(SimpleStringProperty resultados) {
		this.resultados = resultados;
	}

	public SimpleStringProperty getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(SimpleStringProperty nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
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
		return "Cirugias{" + "id=" + id + ", fecha=" + fecha + ", Hora=" + Hora + ", Temperatura=" + Temperatura + ", peso=" + peso + ", Altura=" + Altura + ", TipodeExamen=" + TipodeExamen + ", Sintomas=" + Sintomas + ", dagnosticos=" + dagnosticos + ", resultados=" + resultados + ", nombrePaciente=" + nombrePaciente + ", nombreClinica=" + nombreClinica + ", nombreDoctor=" + nombreDoctor + '}';
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 11 * hash + Objects.hashCode(this.id);
		hash = 11 * hash + Objects.hashCode(this.fecha);
		hash = 11 * hash + Objects.hashCode(this.Hora);
		hash = 11 * hash + Objects.hashCode(this.Temperatura);
		hash = 11 * hash + Objects.hashCode(this.peso);
		hash = 11 * hash + Objects.hashCode(this.Altura);
		hash = 11 * hash + Objects.hashCode(this.TipodeExamen);
		hash = 11 * hash + Objects.hashCode(this.Sintomas);
		hash = 11 * hash + Objects.hashCode(this.dagnosticos);
		hash = 11 * hash + Objects.hashCode(this.resultados);
		hash = 11 * hash + Objects.hashCode(this.nombrePaciente);
		hash = 11 * hash + Objects.hashCode(this.nombreClinica);
		hash = 11 * hash + Objects.hashCode(this.nombreDoctor);
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
		final ExamenesLaboratorio other = (ExamenesLaboratorio) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.fecha, other.fecha)) {
			return false;
		}
		if (!Objects.equals(this.Hora, other.Hora)) {
			return false;
		}
		if (!Objects.equals(this.Temperatura, other.Temperatura)) {
			return false;
		}
		if (!Objects.equals(this.peso, other.peso)) {
			return false;
		}
		if (!Objects.equals(this.Altura, other.Altura)) {
			return false;
		}
		if (!Objects.equals(this.TipodeExamen, other.TipodeExamen)) {
			return false;
		}
		if (!Objects.equals(this.Sintomas, other.Sintomas)) {
			return false;
		}
		if (!Objects.equals(this.dagnosticos, other.dagnosticos)) {
			return false;
		}
		if (!Objects.equals(this.resultados, other.resultados)) {
			return false;
		}
		if (!Objects.equals(this.nombrePaciente, other.nombrePaciente)) {
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

