/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Lenovo
 */
public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Button btn_Add;
	@FXML
	private Button btn_Edit;
	@FXML
	private Button btn_DeleteEmpleado1;
	@FXML
	private Button btn_ClearTxt1;
	@FXML
	private TableView<?> tbl_DataEmpleados;
	@FXML
	private TableColumn<?, ?> Column_ID;
	@FXML
	private TableColumn<?, ?> Column_Nombres;
	@FXML
	private TableColumn<?, ?> Column_Apellidos;
	@FXML
	private TableColumn<?, ?> Column_Telefono;
	@FXML
	private TableColumn<?, ?> Column_Salario;
	@FXML
	private TableColumn<?, ?> Column_Direccion;
	@FXML
	private TableColumn<?, ?> Column_Especialidad;
	@FXML
	private TableColumn<?, ?> Column_Correo;
	@FXML
	private TableColumn<?, ?> Column_Cedula;
	@FXML
	private TableColumn<?, ?> Column_Foto;
	@FXML
	private VBox VboxDataGestionEmpleado;
	@FXML
	private ImageView img_ImageUsuario;
	@FXML
	private JFXButton btn_AddImageEmpleado;
	@FXML
	private JFXTextField txt_Especialidad;
	@FXML
	private JFXTextField txt_Correo;
	@FXML
	private JFXTextField txt_Cedula;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void OnActionBtnAdd(ActionEvent event) {
	}

	@FXML
	private void OnActionBtnEdit(ActionEvent event) {
	}

	@FXML
	private void OnActionBtnDelete(ActionEvent event) {
	}

	@FXML
	private void OnActionBtnClear(ActionEvent event) {
	}

	@FXML
	private void AgregarFoto_btnAddImageEmpleado(ActionEvent event) {
	}
	
}

