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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import ni.edu.uni.Clinica.Application.AppClinica;
import ni.edu.uni.Clinica.Implements.UsersIMP;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLSingInController implements Initializable {

	@FXML
	private JFXTextField txtUsuario;
	@FXML
	private JFXPasswordField txtPassword;
	@FXML
	private JFXButton btnSingIn;

	@FXML
	private Circle btnExit;
	
	//Metodos de las variables
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}//final del Meotodo de Inicializar	

	@FXML
	private void EventBtnIniciarSecion(ActionEvent event) throws IOException {
		UsersIMP usuario = new UsersIMP();
		usuario.busqueda(txtUsuario, txtPassword);
	}//Final de IniciarSecion

	@FXML
	private void CerrarVentana(MouseEvent event) {
		System.exit(0);
	}
	
}//final de la clase

