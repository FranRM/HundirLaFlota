
package com.fran.xogadores;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

import proxectoprog.Tableiro;

public class Puntuacion {
    File archivo=null;
    FileWriter fichero = null;
    PrintWriter pw = null;
    FileReader fr = null;
    BufferedReader br = null;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private int puntuacion=0;

    public Puntuacion() {
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
public void sumPuntuacion(){
   if(Tableiro.acertoH>0){
       puntuacion=Tableiro.acertoH*10;
   }
}

public void guardarFichero(){
     try
        {
            fichero = new FileWriter("puntuacionFich.txt",true);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 1; i++)
                pw.println(username+": "+puntuacion+" Puntos");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
        }
    }
public void leerFicheiro(){
    try{
        
        Scanner sc;
    archivo = new File ("puntuacionFich.txt");
         sc= new Scanner(archivo);   
         
         while(sc.hasNext()){
           JOptionPane.showMessageDialog(null,sc.nextLine());
         }
    
      }catch(Exception e){
         e.printStackTrace();
      }finally{
        
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
            e2.printStackTrace();
         }
      }
   }

}

