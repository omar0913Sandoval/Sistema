/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
/**
 *
 * @author Lenovo
 */
public class Reloj extends Thread{
	
	public Label reloj;
	
	public Reloj(Label label) {
		this.reloj = label;
	}

	@Override
	public void run() {
		while(true){
			Date hora = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");//horas minutos segundos
			
			reloj.setText(sdf.format(hora));
			
			try{
				Thread.sleep(1000);
			} catch(InterruptedException ex){
				Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
				System.out.println("Error"+ex);
			}
		}
	}
}
