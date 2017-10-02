/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteFinal;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class main {
    
    public static void main(String [] args){
        
        FileReader fr = null;
        try {
            
            File fileDatosEmpleado = new File(".\\datos_empleados.csv");
            fr = new FileReader(fileDatosEmpleado);
            BufferedReader br;
            br = new BufferedReader(fr);
            
                        String linealeida = "";
            int c = 0;
            while((linealeida = br.readLine()) != null) {                
                // Ahora se escriben los datos numerados
                //pw.println(c + ": " + linealeida);
                String datosFicha[] = linealeida.split(";");
                
            }
            
            
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
    
}
