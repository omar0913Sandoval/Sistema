/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import ds.desktop.notify.DesktopNotify;
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
 * FXML Controller class
 *
 * @author Lenovo
 */
public class GestionEmpleadoController implements Initializable {

	//labal que va a contener el numero total del total de registros echos
	@FXML
	private Label lbl_NumeroTotalDeEmpleadosRegistrados;
	@FXML
	private TableColumn<?, ?> Column_ID;
	@FXML
	private TableColumn<?, ?> Column_Telefono;
	@FXML
	private TableColumn<?, ?> Column_Especialidad;
	@FXML
	private TableColumn<?, ?> Column_Salario;
	@FXML
	private VBox VboxDataGestionEmpleado;
	@FXML
	private ImageView Image_ImageUsuario;
	@FXML
	private JFXButton btn_AddImageUser;
	@FXML
	private JFXTextField txt_Nombre;
	@FXML
	private JFXTextField txt_Apellido;
	@FXML
	private JFXTextField txt_Telefono;
	@FXML
	private JFXTextField txt_Salario;
	@FXML
	private JFXTextField txt_Especialidad;
	@FXML
	private JFXTextField txt_Correo;
	@FXML
	private Button btn_DeleteEmpleado1;
	@FXML
	private Button btn_ClearTxt1;
	@FXML
	private TableColumn<?, ?> Column_Nombres;
	@FXML
	private TableColumn<?, ?> Column_Apellidos;
	@FXML
	private TableColumn<?, ?> Column_Direccion;
	@FXML
	private TableColumn<?, ?> Column_Correo;
	@FXML
	private TableColumn<?, ?> Column_Cedula;
	@FXML
	private JFXTextField txt_Busqueda;
	@FXML
	private Button btn_Add;
	@FXML
	private Button btn_Edit;
	@FXML
	private TableView<?> tbl_DataEmpleados;
	@FXML
	private TableColumn<?, ?> Column_Foto;
	@FXML
	private JFXTextField txt_ID;
	@FXML
	private JFXTextField txt_Direccion;
	@FXML
	private JFXTextField txt_Cedula;
	@FXML
	private JFXComboBox<?> cmb_Cargo;

	/**
	 * Initializes the controller class.
	 * @param url
	 * @param rb
	 */
	//Obtenemos los Datos de Manera General
	//final de Obtener Datos
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		System.out.println("eRROR");
	}
	
	@FXML
	private void OnActionBtnAdd(ActionEvent event){
		System.out.println("=");
	}//Final del metodo para agregar un nuevo empleado

	@FXML
	private void OnActionBtnEdit(ActionEvent event) {
		System.out.println("=");
	}//Final del metodo para Editar un Empleado

	@FXML
	private void OnActionBtnDelete(ActionEvent event) {
		System.out.println("=");
	}//Final del metodo para eliminar un empleado

	@FXML
	private void OnActionBtnClear(ActionEvent event) {
	}//Metodo para Borrar todos los datos de los campos de texto

	@FXML
	private void OnActionBtnAddImageUser(ActionEvent event) {
		System.out.println("=");                                       
	}//Ingresar una imagen 
	
//	private void ValidarEmpy(){
//		if(id.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		} 
//		if(nombre.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(apellido.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(telofono.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(salario.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(especialidad.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(direccion.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(correo.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
//		if(cedula.isEmpty()){
//			DesktopNotify.showDesktopMessage("Error", "Debe de Ingresar datos a todos los datos"+DesktopNotify.INFORMATION);
//			return;
//		}
	}//final del Metodo ValidarEmpy

