/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import ni.edu.uni.Clinica.Model.Reloj;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLMenuBorderPaneController implements Initializable {

	@FXML
	private BorderPane Border_Pane;
	@FXML
	private HBox HBoxMenu;
	@FXML
	private Button btn_Menu;
	@FXML
	private Label lbl_RelojDate;

	/**
	 * Initializes the controller class.
	 * @param url
	 * @param rb
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		try {
			String addres = "/ni/edu/uni/Clinica/Vista/FXMLHome.fxml";
			
			CambiarScena(addres);
			
		} catch (IOException ex) {
			
			Logger.getLogger(FXMLMenuBorderPaneController.class.getName()).log(Level.SEVERE, null, ex);
		
		}
		
//		Reloj hora = new Reloj(lbl_RelojDate);
//		hora.start();
	}

	@FXML
	private void EventBtnMenu_OpenSidebar(ActionEvent event) throws IOException {
		OpenSideBar(event);
	}
	
	private void OpenSideBar(ActionEvent event) throws IOException{
		BorderPane borderpane = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		
		if(flag == true){
			FXMLLoader loader = new FXMLLoader();
		
			Parent root = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLSider_Bar.fxml"));
			
			borderpane.setLeft(root);
			
			flag = false;
			
		}else{
			borderpane.setLeft(null);
			
			flag = true;
		}
	}
	
	private void CambiarScena(String cadena) throws IOException{
		
		FXMLLoader loader = new FXMLLoader();
		
		Node cambNode = loader.load(getClass().getResource(cadena));
		
		Border_Pane.setCenter(cambNode);
	}
	
	private boolean flag = false;

}


