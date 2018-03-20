
package com.fran.xogadores;
import java.io.*;

import proxectoprog.Tableiro;

public class Puntuacion {
     FileWriter fichero = null;
        PrintWriter pw = null;
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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
