/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class main {
    
    public static void main(String[] args) {
        
        File datosEmpleado;
        
        try {

            datosEmpleado = new File(".\\datosEmpleado.csv");
            FileReader fr;
            fr = new FileReader(datosEmpleado);
            BufferedReader br;
            br = new BufferedReader(fr);            
         
            //Etapa de procesamiento            
            String linealeida = "";
            int c = 0;
            while((linealeida = br.readLine()) != null) {
                
                String datosFicha[] = linealeida.split(";");
                
                   
                    File file = new File(".\\LOCALIDAD\\"+datosFicha[0]);
                    if(!file.exists()){
                        file.mkdir();
                    }
                
                    
                    File fout;
                    fout = new File(".\\LOCALIDAD\\"+datosFicha[0]+"\\"+datosFicha[1]+".txt");
                    FileWriter fw;
                    fw = new FileWriter(fout);
                    PrintWriter pw;
                    pw = new PrintWriter(fw);
                    
                    trabajador t = new trabajador(
                            datosFicha[0], datosFicha[1], datosFicha[2], datosFicha[3], datosFicha[4], datosFicha[5], 
                            datosFicha[6], datosFicha[7], datosFicha[8], datosFicha[9], datosFicha[10], datosFicha[11]
                    );

                    pw.println(t.toString());
                    pw.close();
                    fw.close();
                                
                c++;
            }
            
            // Se cierran los flujos de lectura
            br.close();
            fr.close();               
        
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
    }
    
}
