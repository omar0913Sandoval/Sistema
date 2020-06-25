/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLDlgLoginController implements Initializable {

	@FXML
	private VBox vbox;

	private Parent fxml;
	/**
	 * Initializes the controller class.
	 * @param url
	 * @param rb
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		TranslateTransition t = new TranslateTransition(Duration.seconds(1), vbox);
		t.setToX(vbox.getLayoutX() * 32);
		t.play();
		t.setOnFinished((ActionEvent e) -> {
			try {
				fxml = FXMLLoader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLSingIn.fxml"));
				vbox.getChildren().removeAll();
				vbox.getChildren().setAll(fxml);
			} catch (IOException ex) {    
			}
		});
	}	//final del metodo de initialize

	@FXML
	private void open_signup(ActionEvent event) {
		TranslateTransition t = new TranslateTransition(Duration.seconds(1), vbox);
		t.setToX(14);
		t.play();
		t.setOnFinished((ActionEvent e) -> {
			try {
				fxml = FXMLLoader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLSingUp.fxml"));
				vbox.getChildren().removeAll();
				vbox.getChildren().setAll(fxml);
			} catch (IOException ex) {
			}

		});
	}

	@FXML
	private void open_signin(ActionEvent event) {
		TranslateTransition t = new TranslateTransition(Duration.seconds(1), vbox);
		t.setToX(vbox.getLayoutX() * 32);
		t.play();
		t.setOnFinished((ActionEvent e) -> {
		    try {
				fxml = FXMLLoader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLSingIn.fxml"));
				vbox.getChildren().removeAll();
				vbox.getChildren().setAll(fxml);
			} catch (IOException ex) {}
		});
	}
}
