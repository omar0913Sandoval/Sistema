/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLGestionUsuarioController implements Initializable {

	@FXML
	private VBox content_area;
	@FXML
	private Text lblNumeroDePacientes;
	@FXML
	private TableColumn<?, ?> Column_Nombre;
	@FXML
	private ImageView Image_CambiarImagenUsuario;
	@FXML
	private JFXButton btn_CambiarImagen;
	@FXML
	private Text lbl_NombreDelUsuario;
	@FXML
	private Text lblNumeroDePacientes1;
	@FXML
	private Text lbl_Usuario;
	@FXML
	private Text lbl_ApellidosdelUsuario;
	@FXML
	private Text lblNumeroDePacientes11;
	@FXML
	private Text lbl_ApellidosdelUsuario1;
	@FXML
	private TableView<?> tblData11;
	@FXML
	private TableColumn<?, ?> Column_ID;
	@FXML
	private TableColumn<?, ?> Column_Apellido;
	@FXML
	private TableColumn<?, ?> Column_Usuario;

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
	private void OnActionCambiarImage(ActionEvent event) {
	}
	
}



