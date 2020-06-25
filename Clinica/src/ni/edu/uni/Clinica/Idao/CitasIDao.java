/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Idao;

import java.io.IOException;
import ni.edu.uni.Clinica.Model.Cita;

/**
 *
 * @author Lenovo
 */
public interface CitasIDao extends Idao<Cita> {
	Cita findByID(int  id) throws IOException;
}
