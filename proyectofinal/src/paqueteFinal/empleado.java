/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteFinal;

/**
 *
 * @author LENOVO
 */
public class empleado extends persona{
    
    String departamento;
    String puesto;
    
    public empleado(String nombre_completo, String direccion, String telefono, 
    String departamento, String puesto){
        super(nombre_completo, direccion, telefono);
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }   
    
    
}
