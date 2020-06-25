/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLSideBarController implements Initializable {

	@FXML
	private VBox VBox_SidebarContent;
	@FXML
	private ImageView lbl_ImageSidebarUser;
	@FXML
	private JFXButton btn_ImageUserCambio;
	@FXML
	private Button btn_Home;
	@FXML
	private Button btn_GestionEmployee;
	@FXML
	private Button btn_GestionCitas;
	@FXML
	private Button btn_GestionPaciente;
	@FXML
	private Button btn_Estadisticas;
	@FXML
	private Button btn_Caja;
	@FXML
	private Button btn_Configuracion;

	/**
	 * Initializes the controller class.
	 * @param url
	 * @param rb
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void OnMaouseEventCambiarImage(MouseEvent event) {
			//CambiaLa imagen directamente
	}

	@FXML
	private void OnActionBtnEventCambiarImage(ActionEvent event) throws IOException {//este evento pondra no solo una nueva imagen si que estionara el perfil del usuario
		
	}

	@FXML
	private void OnActionBtnHome(ActionEvent event) throws IOException {	//El codigo siempre es el mismo se que pude hacer un metodo pero me da pereza hace r la validacion para que no se abra otra ventana
		boolean flag = true;
		BorderPane border_pane  = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		if(flag == true){
			FXMLLoader loader = new  FXMLLoader();
			
			Parent node = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLHome.fxml"));
			
			border_pane.setCenter(node);
			
			flag = false;
		} else if(flag == false){
			System.out.println("Ya tiene Abierta Una Pestana");
		}
	}

	@FXML
	private void OnActionEventBtnGestionEmployee(ActionEvent event) throws IOException {
		BorderPane border_pane  = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		boolean flag = true;
		if(flag == true){
			FXMLLoader loader = new  FXMLLoader();
			
			Parent node = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLGestionEmpleado.fxml"));
			
			border_pane.setCenter(node);
			
			flag = false;
		} else if(flag == false){
			System.out.println("Ya tiene Abierta Una Pestana");
		}
	}

	@FXML
	private void OnActionEventBtnGestionCitas(ActionEvent event) throws IOException {
		BorderPane border_pane  = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		boolean flag = true;
		if(flag == true){
			FXMLLoader loader = new  FXMLLoader();
			
			Parent node = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLGestionCitas.fxml"));
			
			border_pane.setCenter(node);
			
			flag = false;
		} else if(flag == false){
			System.out.println("Ya tiene Abierta Una Pestana");
		}
	}

	@FXML
	private void OnActionEventBtnGestionPaciente(ActionEvent event) throws IOException {
		BorderPane border_pane  = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		boolean flag = true;
		if(flag == true){
			FXMLLoader loader = new  FXMLLoader();
			
			Parent node = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLGestionPaciente.fxml"));
			
			border_pane.setCenter(node);
			
			flag = false;
		} else if(flag == false){
			System.out.println("Ya tiene Abierta Una Pestana");
		}
	}

	@FXML
	private void OnActionEventBtnEstadistica(ActionEvent event) throws IOException {
		BorderPane border_pane  = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		boolean flag = true;
		if(flag == true){
			FXMLLoader loader = new  FXMLLoader();
			
			Parent node = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLStadistic.fxml"));
			
			border_pane.setCenter(node);
			
			flag = false;
		} else if(flag == false){
			System.out.println("Ya tiene Abierta Una Pestana");
		}
	}

	@FXML
	private void OnActionEventBtnCaja(ActionEvent event) {
	
	}

	@FXML
	private void OnActionEvnet_Configuracion(ActionEvent event) throws IOException {
		BorderPane border_pane  = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
		boolean flag = true;
		if(flag == true){
			FXMLLoader loader = new  FXMLLoader();
			
			Parent node = loader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/FXMLConfiguraciones.fxml"));
			
			border_pane.setCenter(node);
			
			flag = false;
		} else if(flag == false){
			System.out.println("Ya tiene Abierta Una Pestana");
		}
	}
}
