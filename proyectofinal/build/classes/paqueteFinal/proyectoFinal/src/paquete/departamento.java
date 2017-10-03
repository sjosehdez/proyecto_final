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
public class departamento {
    private String clave_departamento;
    private String departamento;
    
    public departamento(String clave_departamento, String departamento){
        this.clave_departamento = clave_departamento;
        this.departamento = departamento;
    }

    public String getClave_departamento() {
        return clave_departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setClave_departamento(String clave_departamento) {
        this.clave_departamento = clave_departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
