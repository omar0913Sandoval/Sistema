/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLStadisticController implements Initializable {

	@FXML
	private VBox content_area;
	@FXML
	private Text lblNumeroDePacientes1;
	@FXML
	private Text lblNumeroPacientesAtendidos1;
	@FXML
	private Text lblNumeroPacientesAtendidos21;
	@FXML
	private Text lblNumeroPacientesAtendidos11;
	@FXML
	private PieChart GraficoDePastel;
	@FXML
	private StackedBarChart<?, ?> BarChart;
	@FXML
	private NumberAxis yBarchart;
	@FXML
	private CategoryAxis XBarchart;
	@FXML
	private LineChart<?, ?> LineChart;
	@FXML
	private NumberAxis yLineChart;
	@FXML
	private CategoryAxis XLineChart;
	@FXML
	private AreaChart<?, ?> AreaChart;
	@FXML
	private NumberAxis yAreaChart;
	@FXML
	private CategoryAxis xAreaChart;

	/**
	 * Initializes the controller class.
	 * @param url
	 * @param rb
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
		
		BarChart.getData().add(series);
		
		
		ObservableList<PieChart.Data> pieChartCollection = FXCollections.observableArrayList(
			new PieChart.Data("Omar",40),
			new PieChart.Data("Fran",30),
			new PieChart.Data("Kevin",40));
		
		GraficoDePastel.setData(pieChartCollection);
		GraficoDePastel.setStartAngle(40);
		
		
		XYChart.Series Line = new XYChart.Series<>();
		Line.getData().add(new XYChart.Data<>("James", 50000));
		Line.getData().add(new XYChart.Data<>("Omar",200000));
		Line.getData().add(new XYChart.Data<>("Jouse",20000));
		Line.getData().add(new XYChart.Data<>("Sandoval",205000));
		Line.getData().add(new XYChart.Data<>("Maldonado",240000));
		Line.getData().add(new XYChart.Data<>("Kevin",2005000));
		Line.getData().add(new XYChart.Data<>("Fran",20000));
		LineChart.getData().add(Line);
		
		
		XYChart.Series Line1 = new XYChart.Series<>();
		Line1.getData().add(new XYChart.Data<>("James", 50000));
		Line1.getData().add(new XYChart.Data<>("Omar",200000));
		Line1.getData().add(new XYChart.Data<>("Jouse",20000));
		Line1.getData().add(new XYChart.Data<>("Sandoval",205000));
		Line1.getData().add(new XYChart.Data<>("Maldonado",240000));
		Line1.getData().add(new XYChart.Data<>("Kevin",2005000));
		Line1.getData().add(new XYChart.Data<>("Fran",20000));
		
		AreaChart.getData().add(Line1);
	}	
	
}



