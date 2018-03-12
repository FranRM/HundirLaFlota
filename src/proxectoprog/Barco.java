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

    public Barco(String tipo, int tamaño) {
        this.tipo = tipo;
        this.tamaño= tamaño;
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
}
