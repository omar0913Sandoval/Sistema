/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class CitasController implements Initializable {

	@FXML
	private Label lblFecha;
	@FXML
	private ImageView ImagePacienteCita;
	@FXML
	private Label lblHora;
	@FXML
	private Label lblCostoCita;
	@FXML
	private Label lbl_Paciente;
	@FXML
	private Label lbl_DoctorName;
	@FXML
	private Text txtDetalleCita;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
}//final de la clase


