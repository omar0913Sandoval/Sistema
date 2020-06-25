/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLGestionPacienteController implements Initializable {

	@FXML
	private VBox content_area;
	@FXML
	private JFXComboBox<String> cmb_TipoDeCirugia;
	@FXML
	private JFXButton btn_GuardarCirugias;
	@FXML
	private JFXComboBox<String> cmb_MedicoVisitaMedica;
	@FXML
	private JFXComboBox<String> cmb_TipoDeExamen_ExamenesDeLaboratorio;
	@FXML
	private JFXComboBox<String> cmb_MedicoExamenesDeLaboratotrio;
	@FXML
	private JFXComboBox<String> cmb_Medico_Cirugias;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		CargaCmbTipoDeCirugia();
		Cargamedico();
		TiposDeExamenesMedicos();
	}	//final del metodo inicializar
	private void CargaCmbTipoDeCirugia(){
		cmb_TipoDeCirugia.getItems().addAll(//Agregro nuevos items para el combobox para la seleccion de las cosas del usuari
			"Cirugias Internas",
			"Cirugias Externas",
			"Cirugias Mayores",
			"Cirugias Menores",
			"Cirugias Cosmeticas",
			"Cirugias Reconstructiva"
		);//final del metodo para agregar los items
		
	}//fianl del metodo 
	
	private void Cargamedico(){
		cmb_MedicoVisitaMedica.getItems().addAll(
			"Cardeologo Numero 1",
			"Neurologo Numero 2",
			"Urologo Numero 3",
			"Poveda Membreno",
			"Yasser Aguilera",
			"Mario  Caldera"
		);
		
		cmb_Medico_Cirugias.getItems().addAll(				//Se que pude hacer todo en un solo metodo y solo mandar un texto y pasarselo con un for pre que weba
			"Cardeologo Numero 1",					//Ya de porsi soy malo programando y lo voy ha hacer en serio con pruebas 
			"Neurologo Numero 2",					//Me avisas si te sirve esto o si quieres que lo programe enserio
			"Urologo Numero 3",
			"Poveda Membreno",
			"Yasser Aguilera",
			"Mario  Caldera"
		);
		cmb_MedicoExamenesDeLaboratotrio.getItems().addAll("Cardeologo Numero 1",
			"Neurologo Numero 2",
			"Urologo Numero 3",
			"Poveda Membreno",
			"Yasser Aguilera",
			"Mario  Caldera"
		);
	}//final del metodo para Cargar Medicos
	
	private void TiposDeExamenesMedicos(){
		cmb_TipoDeExamen_ExamenesDeLaboratorio.getItems().addAll(
			"Examenes del Corazon",
			"Examen de la Vista",
			"Examen del Oido",
			"Examen de Alergias",
			"Examenes de Presion Coorporal",
			"Eres Tu Mario Caldera pues no carnal no supe que poner aqui da igual de todos modos solo los estou rellenando un poco"
		);
	
	}

	@FXML
	private void EventGuardarDatosCirugia(ActionEvent event) {
		System.out.println(cmb_TipoDeCirugia.getValue()+ 
			cmb_MedicoExamenesDeLaboratotrio.getValue()+
			cmb_MedicoVisitaMedica.getValue()+
			cmb_Medico_Cirugias.getValue()+
			cmb_TipoDeExamen_ExamenesDeLaboratorio.getValue());
	}
}//final de la clase
