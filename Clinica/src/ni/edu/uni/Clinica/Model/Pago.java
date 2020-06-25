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
public class Pago implements Serializable{
	
	private SimpleStringProperty id_Pago;
	private SimpleStringProperty detalleCita;
	private SimpleStringProperty pago;
	private SimpleStringProperty estado;

	public Pago() {
	}

	public Pago(String id_Pago, String detalleCita, String pago, String estado) {
		this.id_Pago = new SimpleStringProperty(id_Pago);
		this.detalleCita = new SimpleStringProperty(detalleCita);
		this.pago = new SimpleStringProperty(pago);
		this.estado = new SimpleStringProperty(estado);
	}
	
	
	
	public Pago(String detalleCita, String pago, String estado) {
		this.detalleCita = new SimpleStringProperty(detalleCita);
		this.pago = new SimpleStringProperty(pago);
		this.estado = new SimpleStringProperty(estado);
	}

	public SimpleStringProperty getId_Pago() {
		return id_Pago;
	}

	public void setId_Pago(SimpleStringProperty id_Pago) {
		this.id_Pago = id_Pago;
	}

	public SimpleStringProperty getDetalleCita() {
		return detalleCita;
	}

	public void setDetalleCita(SimpleStringProperty detalleCita) {
		this.detalleCita = detalleCita;
	}

	public SimpleStringProperty getPago() {
		return pago;
	}

	public void setPago(SimpleStringProperty pago) {
		this.pago = pago;
	}

	public SimpleStringProperty getEstado() {
		return estado;
	}

	public void setEstado(SimpleStringProperty estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pago{" + "id_Pago=" + id_Pago + ", detalleCita=" + detalleCita + ", pago=" + pago + ", estado=" + estado + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + Objects.hashCode(this.id_Pago);
		hash = 17 * hash + Objects.hashCode(this.detalleCita);
		hash = 17 * hash + Objects.hashCode(this.pago);
		hash = 17 * hash + Objects.hashCode(this.estado);
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
		final Pago other = (Pago) obj;
		if (!Objects.equals(this.id_Pago, other.id_Pago)) {
			return false;
		}
		if (!Objects.equals(this.detalleCita, other.detalleCita)) {
			return false;
		}
		if (!Objects.equals(this.pago, other.pago)) {
			return false;
		}
		if (!Objects.equals(this.estado, other.estado)) {
			return false;
		}
		return true;
	}
	
}//final de la clase

