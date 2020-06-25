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
public class CategoriaMedicamento implements Serializable{
	
	private SimpleStringProperty id_CategoriaMedicamento;
	private SimpleStringProperty tipo;

	public CategoriaMedicamento() {
	}

	public CategoriaMedicamento(String id, String tipo) {
		this.id_CategoriaMedicamento = new SimpleStringProperty(id);
		this.tipo = new SimpleStringProperty(tipo);
	}
	
	public CategoriaMedicamento(String tipo) {
		this.tipo = new SimpleStringProperty(tipo);
	}

	public SimpleStringProperty getId_CategoriaMedicamento() {
		return id_CategoriaMedicamento;
	}

	public void setId_CategoriaMedicamento(SimpleStringProperty id_CategoriaMedicamento) {
		this.id_CategoriaMedicamento = id_CategoriaMedicamento;
	}

	public SimpleStringProperty getTipo() {
		return tipo;
	}

	public void setTipo(SimpleStringProperty tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "CategoriaMedicamento{" + "id_CategoriaMedicamento=" + id_CategoriaMedicamento + ", tipo=" + tipo + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + Objects.hashCode(this.id_CategoriaMedicamento);
		hash = 17 * hash + Objects.hashCode(this.tipo);
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
		final CategoriaMedicamento other = (CategoriaMedicamento) obj;
		if (!Objects.equals(this.id_CategoriaMedicamento, other.id_CategoriaMedicamento)) {
			return false;
		}
		if (!Objects.equals(this.tipo, other.tipo)) {
			return false;
		}
		return true;
	}	
}//final de la clase

