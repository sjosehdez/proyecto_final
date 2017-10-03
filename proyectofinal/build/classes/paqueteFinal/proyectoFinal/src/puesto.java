/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class puesto {
    String clave;
    String puesto;
    
    public puesto(String clave, String puesto){
        this.clave = clave;
        this.puesto = puesto;
    }

    public String getClave() {
        return clave;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}
