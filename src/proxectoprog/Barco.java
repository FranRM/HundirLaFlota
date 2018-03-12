/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoprog;

/**
 *
 * @author femio23
 */
public class Barco {
    private String tipo;
    private int tamaño;

    public Barco() {
    }

    public Barco(String tipo) {
        this.tipo = tipo;
        asigtam();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Barco{" + "tipo=" + tipo + ", tama\u00f1o=" + tamaño + '}';
    }
    public void asigtam(){
        switch(tipo){
            case"desctructor":tamaño=2;
            case"submarino":tamaño=3;
            case"cruceiro":tamaño=4;
            case"portaavions":tamaño=5;
            default:;
        }
    }
}
