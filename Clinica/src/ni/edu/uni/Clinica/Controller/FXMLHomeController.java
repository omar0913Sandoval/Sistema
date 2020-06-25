/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLHomeController implements Initializable {

	@FXML
	private VBox content_area;
	@FXML
	private BarChart<?, ?> BBarchart;
	@FXML
	private Text lblNumeroDePacientes1;
	@FXML
	private Text lblNumeroPacientesAtendidos1;
	@FXML
	private Text lblNumeroPacientesAtendidos21;
	@FXML
	private Text lblNumeroPacientesAtendidos11;
	@FXML
	private TableView<?> Tbl_UltimosRegistros;
	@FXML
	private TableColumn<?, ?> Column_Identificador;
	@FXML
	private TableColumn<?, ?> Column_Nombre;
	@FXML
	private TableColumn<?, ?> Column_Telefono;
	@FXML
	private ListView<?> list_ListaDeCitas;
	@FXML
	private NumberAxis Ingresos;
	@FXML
	private CategoryAxis Meses;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		XYChart.Series series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data<>("Enero", 50));
		series.getData().add(new XYChart.Data<>("Febrero",20));
		series.getData().add(new XYChart.Data<>("Marzo",20));
		series.getData().add(new XYChart.Data<>("Abril",25));
		series.getData().add(new XYChart.Data<>("Mayo",24));
		series.getData().add(new XYChart.Data<>("Junio",28));
		series.getData().add(new XYChart.Data<>("julio",70));
		series.getData().add(new XYChart.Data<>("Agosto",85));
		series.getData().add(new XYChart.Data<>("Septiembre",45));
		series.getData().add(new XYChart.Data<>("Octubre",78));
		series.getData().add(new XYChart.Data<>("Noviembre",45));
		series.getData().add(new XYChart.Data<>("Diciembre",10));
		
		BBarchart.getData().add(series);	
	}	
	
}






