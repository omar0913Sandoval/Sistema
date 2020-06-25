/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class Conexion {
    

    private Connection conneccion;
    private final String url = "jdbc:mysql://127.0.0.1/'sistema_clinico'";
    private final String usuario = "root";
    private final String contasena = "1320022077";


    public Connection getConnection()
    {
            return conneccion;
    }

    public void setConnection(Connection connection)
    {
            this.conneccion = connection;
    }

    public  void establecerConexion() throws SQLException
    {
        try {	
            Class.forName("com.mysql.jdbc.Driver");
            conneccion= DriverManager.getConnection(url,usuario, contasena);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarConexion() throws SQLException
    {
            conneccion.close();
    }
}
