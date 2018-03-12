/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoprog;

import java.util.ArrayList;

/**
 *
 * @author femio23
 */
public class Tableiro {
    private ArrayList<Barco> flota=new ArrayList();
    Barco b1=new Barco();
    private String tamaño;
    private int numbarcos,tamañotab;

    public Tableiro(String tamaño) {
        this.tamaño = tamaño;
    }

    public Tableiro() {
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumbarcos() {
        return numbarcos;
    }

    public void setNumbarcos(int numbarcos) {
        this.numbarcos = numbarcos;
    }

    public int getTamañotab() {
        return tamañotab;
    }

    public void setTamañotab(int tamañotab) {
        this.tamañotab = tamañotab;
        
    }
    

    @Override
    public String toString() {
        return "Xogadores{" + "tama\u00f1o=" + tamaño + ", numbarcos=" + numbarcos + '}';
    }
    public void modoxogo(){
        switch(tamaño){
            case "pequeno":setNumbarcos(4);
            setTamañotab(6);
            break;
            case "medio":setNumbarcos(10);
            setTamañotab(10);
            break;
            case "grande":setNumbarcos(10);
            setTamañotab(13);
            break;
            default:;
        }
    }
    public void elixbarcos(){
        if(getNumbarcos()==4){
            flota.add(new Barco("destructor"));
            flota.add(new Barco("submmarino"));
            flota.add(new Barco("cruceiro"));
            flota.add(new Barco("portaavions"));
            
        }else{
            flota.add(new Barco("destructor"));
            flota.add(new Barco("destructor"));
            flota.add(new Barco("destructor"));
            flota.add(new Barco("destructor"));
            flota.add(new Barco("submmarino"));
            flota.add(new Barco("submmarino"));
            flota.add(new Barco("submmarino"));
            flota.add(new Barco("cruceiro"));
            flota.add(new Barco("cruceiro"));
            flota.add(new Barco("portaavions"));
        }
    }
    public void display(){
        for(Barco f1:flota){
            System.out.println(f1.toString());
        }
    }
    
}
