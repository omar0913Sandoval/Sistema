/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class App extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		Parent root = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLGestionCitas.fxml"));
		Scene scena = new Scene(root);
		stage.setScene(scena);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}









