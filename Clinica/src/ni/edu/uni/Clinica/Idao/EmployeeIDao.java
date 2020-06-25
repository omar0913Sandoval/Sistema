/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Idao;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import ni.edu.uni.Clinica.Model.Employee;

/**
 *
 * @author Lenovo
 */
public interface EmployeeIDao extends Idao<Employee>{
	Employee findByID(int id) throws IOException;
	Employee find(Comparator<Employee> comparar) throws IOException;
	List<Employee> any(Predicate<Employee> fun)throws IOException;
}

