/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lenovo
 */
public class Medicamento implements Serializable{
	
	private SimpleStringProperty id_Medicamento;
	private SimpleStringProperty id_Categoria;
	private SimpleStringProperty detalle;
	private SimpleStringProperty costoMedicamento;

	public Medicamento() {
	}

	
}

