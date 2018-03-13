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
    String[][]tableiro;

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
            flota.add(new Barco("destructor",2));
            flota.add(new Barco("submarino",3));
            flota.add(new Barco("cruceiro",4));
            flota.add(new Barco("portaavions",5));
            
        }else{
            flota.add(new Barco("destructor",2));
            flota.add(new Barco("destructor",2));
            flota.add(new Barco("destructor",2));
            flota.add(new Barco("destructor",2));
            flota.add(new Barco("submarino",3));
            flota.add(new Barco("submarino",3));
            flota.add(new Barco("submarino",3));
            flota.add(new Barco("cruceiro",4));
            flota.add(new Barco("cruceiro",4));
            flota.add(new Barco("portaavions",5));
        }
    }
    public void display(){
        for(Barco f1:flota){
            System.out.println(f1.getTipo()+"="+f1.getTamaño());
        }
        System.out.println("fin");
    }
    public void crearTab(){
        
        tableiro=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                tableiro[i][j]=" ";
            }
        }
//        switch(tamaño){
//            case"pequeno":
//                tableiro[0][0]="s";
//                tableiro[0][1]="s";
//                tableiro[0][2]="s";
//                tableiro[3][3]="d";
//                tableiro[4][3]="d";
//                tableiro[1][5]="p";
//                tableiro[2][5]="p";
//                tableiro[3][5]="p";
//                tableiro[4][5]="p";
//                tableiro[5][5]="p";
//            break;
//            case"medio":
//                tableiro[0][0]="s";
//                tableiro[0][1]="s";
//                tableiro[0][2]="s";
//                tableiro[6][6]="d";
//                tableiro[7][6]="d";
//                tableiro[5][9]="p";
//                tableiro[6][9]="p";
//                tableiro[7][9]="p";
//                tableiro[8][9]="p";
//                tableiro[9][9]="p";
//            break;
//            case"grande":
//                tableiro[0][0]="s";
//                tableiro[0][1]="s";
//                tableiro[0][2]="s";
//                tableiro[6][6]="d";
//                tableiro[7][6]="d";
//                tableiro[5][12]="p";
//                tableiro[6][12]="p";
//                tableiro[7][12]="p";
//                tableiro[8][12]="p";
//                tableiro[9][12]="p";
//            break;
//        }
        
        
        
        
    }
    public void visualizartab(){
        switch(tamaño){
            case"pequeno":
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(tableiro[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"medio":
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(tableiro[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"grande":
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|k|l|m|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(tableiro[i][j]+"|");
                    }
                    System.out.println();
                }
                break;
        }
    }
    public boolean ocupado(int a, int b){
        if(tableiro[a][b].equals(" ")){
            return false;
        }else{
        return true;
        }
    }
    public void montarTab(){
        int aux1=15,aux2=15;
        switch(tamaño){
            case"pequeno":
                while((aux1+1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1+1,aux2+1)){
                aux1=(int)(Math.random()*4+1);
                aux2=(int)(Math.random()*4+1);
                }
                if((Math.random())>=0.5){
                tableiro[aux1][aux2]="d";
                tableiro[aux1+1][aux2]="d";
                }else{
                    tableiro[aux1][aux2]="d";
                    tableiro[aux1][aux2+1]="d";
                }
                
            break;
            case"medio":
            break;
            case"grande":
            break;
        }
    }
    
}
