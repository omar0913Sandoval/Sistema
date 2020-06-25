/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Model;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Lenovo
 */
public class Medico implements Serializable{
	
	private StringProperty id_Medico;
	private StringProperty cedula;
	private StringProperty primerNombre;
	private StringProperty segundoNombre;
	private StringProperty PrimeApellido;
	private StringProperty SegundoApellido;
	private StringProperty telefono;
	private StringProperty direccion;
	private StringProperty correo;
	private StringProperty imageURL;
        private StringProperty estado;
        
        
        public Medico(String cedula, String primerNombre, String segundoNombre, String PrimeApellido, String SegundoApellido, String telefono, String direccion, String correo, String imageURL, String estado) {
	this.cedula = new SimpleStringProperty(cedula);
	this.primerNombre = new SimpleStringProperty(primerNombre);
	this.segundoNombre = new SimpleStringProperty(segundoNombre);
	this.PrimeApellido = new SimpleStringProperty(PrimeApellido);
	this.SegundoApellido = new SimpleStringProperty(SegundoApellido);
	this.telefono = new SimpleStringProperty(telefono);
	this.direccion = new SimpleStringProperty(direccion);
        this.correo = new SimpleStringProperty(correo);
	this.imageURL = new SimpleStringProperty(imageURL);
        
        }
 
	public Medico(String cedula, String primerNombre, String segundoNombre, String PrimeApellido, String SegundoApellido, String telefono, String direccion, String correo, String imageURL) {
	this.cedula = new SimpleStringProperty(cedula);
	this.primerNombre = new SimpleStringProperty(primerNombre);
	this.segundoNombre = new SimpleStringProperty(segundoNombre);
	this.PrimeApellido = new SimpleStringProperty(PrimeApellido);
	this.SegundoApellido = new SimpleStringProperty(SegundoApellido);
	this.telefono = new SimpleStringProperty(telefono);
	this.direccion = new SimpleStringProperty(direccion);
	this.correo = new SimpleStringProperty(correo);
	this.imageURL = new SimpleStringProperty(imageURL);
        }
                     
        /*Get y set con property*/        

        public StringProperty Id_MedicoProperty() {
            return id_Medico;
        }

        public void setId_Medico(StringProperty id_Medico) {
            this.id_Medico = id_Medico;
        }

        public StringProperty CedulaProperty() {
            return cedula;
        }

        public void setCedula(StringProperty cedula) {
            this.cedula = cedula;
        }

        public StringProperty PrimerNombreProperty() {
            return primerNombre;
        }

        public void setPrimerNombre(StringProperty primerNombre) {
            this.primerNombre = primerNombre;
        }

        public StringProperty SegundoNombreProperty() {
            return segundoNombre;
        }

        public void setSegundoNombre(StringProperty segundoNombre) {
            this.segundoNombre = segundoNombre;
        }

        public StringProperty PrimeApellidoProperty() {
            return PrimeApellido;
        }

        public void setPrimeApellido(StringProperty PrimeApellido) {
            this.PrimeApellido = PrimeApellido;
        }

        public StringProperty SegundoApellidoProperty() {
            return SegundoApellido;
        }

        public void setSegundoApellido(StringProperty SegundoApellido) {
            this.SegundoApellido = SegundoApellido;
        }

        public StringProperty TelefonoProperty() {
            return telefono;
        }

        public void setTelefono(StringProperty telefono) {
            this.telefono = telefono;
        }

        public StringProperty DireccionProperty() {
            return direccion;
        }

        public void setDireccion(StringProperty direccion) {
            this.direccion = direccion;
        }

        public StringProperty CorreoProperty() {
            return correo;
        }

        public void setCorreo(StringProperty correo) {
            this.correo = correo;
        }

        public StringProperty ImageURLProperty() {
            return imageURL;
        }

        public void setImageURL(StringProperty imageURL) {
            this.imageURL = imageURL;
        }

        public StringProperty EstadoProperty() {
            return estado;
        }

        public void setEstado(StringProperty estado) {
            this.estado = estado;
        }

        /*Get normales*/

        public String getId_Medico() {
            return id_Medico.get();
        }

        public String getCedula() {
            return cedula.get();
        }

        public String getPrimerNombre() {
            return primerNombre.get();
        }

        public String getSegundoNombre() {
            return segundoNombre.get();
        }

        public String getPrimeApellido() {
            return PrimeApellido.get();
        }

        public String getSegundoApellido() {
            return SegundoApellido.get();
        }

        public String getTelefono() {
            return telefono.get();
        }

        public String getDireccion() {
            return direccion.get();
        }

        public String getCorreo() {
            return correo.get();
        }

        public String getImageURL() {
            return imageURL.get();
        }

        public String getEstado() {
            return estado.get();
        }
        
        

            //Metodo para ingresar cliente a la base de datos
        public void IngresarCliente(Medico m) throws  Exception
        {
            Conexion c = new Conexion();
            
            try (Connection conn = c.getConnection()) {
                CallableStatement cs=conn.prepareCall("{call add_Paciente_Doctor(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                cs.setString(1, "medico");
                cs.setString(2,m.getCedula());
                cs.setString(3,m.getPrimerNombre());
                cs.setString(4,m.getSegundoNombre());
                cs.setString(5,m.getPrimeApellido());
                cs.setString(6,m.getSegundoApellido());
                cs.setString(7,m.getDireccion());
                cs.setString(8,m.getTelefono());
                cs.setString(9,m.getCorreo());
                cs.setString(10,m.getImageURL()); 
                cs.execute();
                
                c.cerrarConexion();
            }catch(Exception e){System.out.println(e);}
        }
}
