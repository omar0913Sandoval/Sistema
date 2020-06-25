/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import ni.edu.uni.Clinica.Implements.UsersIMP;
import ni.edu.uni.Clinica.Model.Usuario;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLSingUpController implements Initializable {

	@FXML
	private Circle btnExit;
	@FXML
	private JFXTextField txtNombreCompleto;
	@FXML
	private JFXTextField txtUsuario;
	@FXML
	private JFXPasswordField txtPassword;
	@FXML
	private JFXButton btnSingUp;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		System.out.println("Correcto");
	}	

	@FXML
	private void CerrarVentana(MouseEvent event) {
		System.exit(0);
	}

	@FXML
	private void EnventRegistrer(ActionEvent event) throws IOException {
		Usuario u = new Usuario(txtNombreCompleto.getText(),txtUsuario.getText(),txtPassword.getText());
		UsersIMP usuario = new UsersIMP();
		usuario.save(u);//Escribimos U
	}//Metodo para Agregar Un Usuario	
}
