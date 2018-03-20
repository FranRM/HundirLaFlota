
package com.fran.xogadores;
import proxectoprog.Tableiro;

public class Puntuacion {
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
       puntuacion=puntuacion+10;
   }
}
}