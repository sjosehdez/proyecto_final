/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Administrador
 */
public class trabajador extends persona{
    String clave;
    String departamento;
    String puesto;
    
    public trabajador(  
    String nombre, String apellidoPaterno, String apellidoMaterno, String calle,
    String colonia, String ciudad, String estado, String codigoPostal, String sexo,
    String clave, String departamento, String puesto){
        
        super(nombre,apellidoPaterno,apellidoMaterno,calle,colonia,ciudad,estado,codigoPostal,sexo);
        this.clave = clave;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public String getClave() {
        return clave;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }   
    
    
}