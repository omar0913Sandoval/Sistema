/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLStadistic_SettingController implements Initializable {

	@FXML
	private VBox content_area;
	@FXML
	private ImageView img1;
	@FXML
	private ImageView Image_CambiarImagenUsuario;
	@FXML
	private Text lblNumeroDePacientes;
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
	private Button btn_SaveData;
	@FXML
	private JFXColorPicker choserColor_TablaHome;
	@FXML
	private JFXColorPicker choserColor_PanelesInformativosome;
	@FXML
	private JFXColorPicker choserColor_PanelGeneralHome;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}
	

	@FXML
	private void btnSaveData(ActionEvent event) {
		img1.setImage(new Image("/ni/edu/uni/Clinica/Icons/syn.png"));
		rotateTransition1 = new RotateTransition(Duration.seconds(5), img1);
		RotateTransition transition[] = {rotateTransition1};
		
		for (RotateTransition rTransition : transition) {
		    rTransition.setCycleCount(1);
		    rTransition.setAutoReverse(false);
		    rTransition.setFromAngle(720);
		    rTransition.setToAngle(0);
		}
		rotateTransition1.play();
		rotateTransition1.setOnFinished((e) -> {
			img1.setImage(new Image("/ni/edu/uni/Clinica/Icons/ok.png"));
		});
	}
	
	private RotateTransition rotateTransition1;

}
