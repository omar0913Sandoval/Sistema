/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;
import ni.edu.uni.Clinica.Model.Cita;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLGestionCitasController implements Initializable {

	@FXML
	private JFXDatePicker txt_Fecha;
	@FXML
	private JFXTimePicker txt_Hora;
	@FXML
	private JFXTextField txtNombre;
	@FXML
	private JFXTextField txtDoctor;
	@FXML
	private JFXTextField txtNumeroCita;
	@FXML
	private JFXButton btnAddCita;
	@FXML
	private JFXTextField txtCostoCita;
	@FXML
	private TextArea txtAreaDetallleCita;
	@FXML
	private JFXButton btnUpdate;
	@FXML
	private JFXButton btnDelete;
        @FXML
	private JFXTreeTableView<Cita> Tabla_Citas;

	/**
	 * Initializes the controller class.
	 * @param url
	 * @param rb
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		//Columna de los Codigo de las Citas
		JFXTreeTableColumn<Cita,String> CodigoCita = new JFXTreeTableColumn<>("Codigo");
		CodigoCita.setPrefWidth(180);
		CodigoCita.setResizable(true);
		CodigoCita.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita,String> p) -> p.getValue().getValue().getId_Cita());
		
		//Columna del Nombre de los Doctores
		JFXTreeTableColumn<Cita,String> Doctor = new JFXTreeTableColumn<>("Doctor");
		Doctor.setPrefWidth(180);
		Doctor.setResizable(true);
		Doctor.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita, String> p) -> p.getValue().getValue().getId_Medico());
		
		//Columna de el Nombre de los Pacientes
		JFXTreeTableColumn<Cita,String> Nombre = new JFXTreeTableColumn<>("Paciente");
		Nombre.setPrefWidth(180);
		Nombre.setResizable(true);
		Nombre.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita, String> p) -> p.getValue().getValue().getId_Paciente());
		
		//Columna de la Fecha de la cita
		JFXTreeTableColumn<Cita,String> Fecha = new JFXTreeTableColumn<>("Fecha");
		Fecha.setPrefWidth(180);
		Fecha.setResizable(true);
		Fecha.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita, String> p) -> p.getValue().getValue().getFechaCitaDate());
		
		
		//Columna de Hora de la Cita
		JFXTreeTableColumn<Cita,String> Hora = new JFXTreeTableColumn<>("Hora");
		Hora.setPrefWidth(180);
		Hora.setResizable(true);
		Hora.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita, String> p) -> p.getValue().getValue().getHora_Cita());
		
		//Columna del Costo de la Cita
		JFXTreeTableColumn<Cita,String> CostoCita = new JFXTreeTableColumn<>("Costo");
		CostoCita.setPrefWidth(180);
		CostoCita.setResizable(true);
		CostoCita.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita, String> p) -> p.getValue().getValue().getCostoCita());
		
		//Columa del detalle de la Cita
		JFXTreeTableColumn<Cita,String> DetalleCita = new JFXTreeTableColumn<>("Detalle");
		DetalleCita.setPrefWidth(180);
		DetalleCita.setResizable(true);
		DetalleCita.setCellValueFactory((TreeTableColumn.CellDataFeatures<Cita, String> p) -> p.getValue().getValue().getDetalleCita());
	
		ObservableList<Cita> citas = FXCollections.observableArrayList();
		citas.add(new Cita("00","000","000","0000","000","0000","000"));
		citas.parallelStream();
		citas.size();
		
		//final TreeItem<Cita> root = new RecursiveTreeItem<Cita>(citas, RecursiveTreeObject::getChildren);
		Tabla_Citas.getColumns().setAll(CodigoCita,Doctor,Nombre,DetalleCita,Fecha,Hora,CostoCita);
		Tabla_Citas.tableMenuButtonVisibleProperty();
		//Tabla_Citas.setRoot(root);
	}	
	
	private void AgregarCita(int n){
		Node[] nodes = new Node[n];
		for (int i = 0; i < nodes.length; i++) {
			try {
				final int j = i;
				
				nodes[i] = FXMLLoader.load(getClass().getResource("/ni/edu/uni/Clinica/Vista/Citas.fxml"));
			
				//VBox_Items.getChildren().add(nodes[i]);
			
			} catch (IOException e) {
				System.out.println(e+"Exepcion");
			}
		}
	}//Final del Metodo para Agregar una Cita
	
	@FXML
	private void OnActionEventBtnAddCita(ActionEvent event) {
	
	}

	@FXML
	private void EventActializarCita(ActionEvent event) {
		
	}	

	@FXML
	private void EventDeleteCita(ActionEvent event) {
	}
	
}//final de la clase
