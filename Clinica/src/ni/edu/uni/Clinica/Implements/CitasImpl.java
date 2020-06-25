/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Implements;

import java.io.IOException;
import java.util.List;
import ni.edu.uni.Clinica.Idao.CitasIDao;
import ni.edu.uni.Clinica.Model.Cita;

/**
 *
 * @author Lenovo
 */
public class CitasImpl implements CitasIDao{

	@Override
	public Cita findByID(int id) throws IOException {
		return null;
	}

	@Override
	public void save(Cita t) throws IOException {
	
	}

	@Override
	public int update(Cita t) throws IOException {
		return 0;
	}

	@Override
	public boolean delete(Cita t) throws IOException {
		return false;
	}

	@Override
	public List<Cita> findAll() throws IOException {
		return null;
	}
	
}//final de la clase

