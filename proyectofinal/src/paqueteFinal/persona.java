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
public class persona {
    String nombre_completo;
    String direccion;
    String telefono;
    
    /**
     *
     * @param nombre_completo
     * @param direccion
     * @param telefono
     */
    public persona(String nombre_completo, String direccion, String telefono){
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;        
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
    
}
