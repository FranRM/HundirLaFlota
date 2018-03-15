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
    public String[][] gettableiro(){
        return tableiro;
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
                    if((Math.random())>=0.5){
                        while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1+1,aux2)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        tableiro[aux1][aux2]="d";
                        tableiro[aux1+1][aux2]="d";
                    }else{
                        while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1,aux2+1)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        tableiro[aux1][aux2]="d";
                        tableiro[aux1][aux2+1]="d";
                    }System.out.println("Barco colocado.");
                
                    if((Math.random())>=0.5){
                        while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1+1,aux2)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        tableiro[aux1][aux2]="d";
                        tableiro[aux1+1][aux2]="d";
                    }else{
                        while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1,aux2+1)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        tableiro[aux1][aux2]="d";
                        tableiro[aux1][aux2+1]="d";
                    }System.out.println("Barco colocado.");
                
                if((Math.random())>=0.5){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1+1,aux2)||ocupado(aux1+2,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    tableiro[aux1][aux2]="s";
                    tableiro[aux1+1][aux2]="s";
                    tableiro[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1,aux2+1)||ocupado(aux1,aux2+2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    tableiro[aux1][aux2]="s";
                    tableiro[aux1][aux2+1]="s";
                    tableiro[aux1][aux2+2]="s";
                }System.out.println("Barco colocado.");
                
                if((Math.random())>=0.5){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1+1,aux2)||ocupado(aux1+2,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    tableiro[aux1][aux2]="s";
                    tableiro[aux1+1][aux2]="s";
                    tableiro[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1,aux2+1)||ocupado(aux1,aux2+2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    tableiro[aux1][aux2]="s";
                    tableiro[aux1][aux2+1]="s";
                    tableiro[aux1][aux2+2]="s";
                }System.out.println("Barco colocado.");
                
                
                
            break;
            case"medio":
                
                if((Math.random())>=0.5){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1+1,aux2)||ocupado(aux1+2,aux2)||ocupado(aux1+3,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    tableiro[aux1][aux2]="c";
                    tableiro[aux1+1][aux2]="c";
                    tableiro[aux1+2][aux2]="c";
                    tableiro[aux1+3][aux2]="c";
                }else{
                    while((aux1)>=tamañotab||(aux2+3)>=tamañotab||ocupado(aux1,aux2)||ocupado(aux1,aux2+1)||ocupado(aux1,aux2+2)||ocupado(aux1,aux2+3)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    tableiro[aux1][aux2]="c";
                    tableiro[aux1][aux2+1]="c";
                    tableiro[aux1][aux2+2]="c";
                    tableiro[aux1][aux2+3]="c";
                }System.out.println("Barco 3, colocado.");
            break;
            case"grande":
            break;
        }
    }
    public void montardest(){
        
    }
    public void montarsub(){
        
    }
    public void montarcruz(){
        
    }
    public void montarport(){
        
    }
    
}
