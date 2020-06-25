/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Idao;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface Idao<T> {
    void save(T t) throws IOException;
    int update(T t) throws IOException;
    boolean delete(T t)throws IOException;
    List<T> findAll()throws IOException;
}



