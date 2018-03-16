/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoprog;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author femio23
 */
public class Tableiro {
    int aux1=15,aux2=15;
    private ArrayList<Barco> flota=new ArrayList();
    Barco b1=new Barco();
    private String tamaño;
    private int numbarcos,tamañotab;
    String[][]taH,taM,tiroH,tiroM;
    int direccion;

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
    public String[][] gettableiroH(){
        return taH;
    }
    public String[][] gettableiroM(){
        return taM;
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
        
        taH=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                taH[i][j]=" ";
            }
        }
        taM=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                taM[i][j]=" ";
            }
        }
        tiroH=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                tiroH[i][j]=" ";
            }
        }
        tiroM=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                tiroM[i][j]=" ";
            }
        }
        
    }
    public void visualizartabH(){
        switch(tamaño){
            case"pequeno":
                System.out.println("Tableiro do xogador");
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taH[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"medio":
                System.out.println("Tableiro do xogador");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taH[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"grande":
                System.out.println("Tableiro do xogador");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|k|l|m|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taH[i][j]+"|");
                    }
                    System.out.println();
                }
                break;
        }
    }
    public void visualizartabM(){
        switch(tamaño){
            case"pequeno":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"medio":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"grande":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|k|l|m|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
                break;
        }
    }
    public boolean ocupado(String[][] tab,int a, int b){
        if(tab[a][b].equals(" ")){
            return false;
        }else{
        return true;
        }
    }
    public void montarTab(){
        
        switch(tamaño){
            case"pequeno":
                
                colocardesth();
                colocarsubh();
                colocardesth();
                colocarsubh();
                colocardestm();
                colocarsubm();
                

            break;
            case"medio":
                colocardestm();
                colocardestm();
                colocarsubm();
                colocarsubm();
                colocarcruzm();
                colocarportm();
                
                
            break;
            case"grande":
                colocardestm();
                colocardestm();
                colocarsubm();
                colocarsubm();
                colocarcruzm();
                colocarcruzm();
                colocarportm();
            break;
        }
    }
    public void colocardestm(){
        if((Math.random())>=0.5){
                        while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        taM[aux1][aux2]="d";
                        taM[aux1+1][aux2]="d";
                    }else{
                        while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        taM[aux1][aux2]="d";
                        taM[aux1][aux2+1]="d";
                    }System.out.println("Barco colocado.");
                    aux1=15;
                    aux2=15;
    }
    public void colocarsubm(){
        if((Math.random())>=0.5){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)||ocupado(taM,aux1+2,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="s";
                    taM[aux1+1][aux2]="s";
                    taM[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)||ocupado(taM,aux1,aux2+2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="s";
                    taM[aux1][aux2+1]="s";
                    taM[aux1][aux2+2]="s";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
                
    }
    public void colocarcruzm(){
        if((Math.random())>=0.5){
                    while((aux1+3)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)||ocupado(taM,aux1+2,aux2)||ocupado(taM,aux1+3,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="c";
                    taM[aux1+1][aux2]="c";
                    taM[aux1+2][aux2]="c";
                    taM[aux1+3][aux2]="c";
                }else{
                    while((aux1)>=tamañotab||(aux2+3)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)||ocupado(taM,aux1,aux2+2)||ocupado(taM,aux1,aux2+3)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="c";
                    taM[aux1][aux2+1]="c";
                    taM[aux1][aux2+2]="c";
                    taM[aux1][aux2+3]="c";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
    }
    public void colocarportm(){
        if((Math.random())>=0.5){
                    while((aux1+4)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)||ocupado(taM,aux1+2,aux2)||ocupado(taM,aux1+3,aux2)||ocupado(taM,aux1+4,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="p";
                    taM[aux1+1][aux2]="p";
                    taM[aux1+2][aux2]="p";
                    taM[aux1+3][aux2]="p";
                    taM[aux1+4][aux2]="p";
                }else{
                    while((aux1)>=tamañotab||(aux2+4)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)||ocupado(taM,aux1,aux2+2)||ocupado(taM,aux1,aux2+3)||ocupado(taM,aux1,aux2+4)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="p";
                    taM[aux1][aux2+1]="p";
                    taM[aux1][aux2+2]="p";
                    taM[aux1][aux2+3]="p";
                    taM[aux1][aux2+4]="p";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
    }
    public void colocardesth(){
        while(direccion!=1&&direccion!=2){
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                        while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)){
                            aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                            aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                        }
                        taH[aux1][aux2]="d";
                        taH[aux1+1][aux2]="d";
                    }else{
                        while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)){
                            aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                            aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                        }
                        taH[aux1][aux2]="d";
                        taH[aux1][aux2+1]="d";
                    }System.out.println("Barco colocado.");
                    aux1=15;
                    aux2=15;
                }
        direccion=3;
    }
    public void colocarsubh(){
        while(direccion!=1&&direccion!=2){
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="s";
                    taH[aux1+1][aux2]="s";
                    taH[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="s";
                    taH[aux1][aux2+1]="s";
                    taH[aux1][aux2+2]="s";
                }System.out.println("Barco colocado.");
                aux1=15;
                    aux2=15;
        
        }
        direccion=3;  
    }
    public void colocarcruzh(){
        while(direccion!=1&&direccion!=2){
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                    while((aux1+3)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)||ocupado(taH,aux1+3,aux2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="c";
                    taH[aux1+1][aux2]="c";
                    taH[aux1+2][aux2]="c";
                    taH[aux1+3][aux2]="c";
                }else{
                    while((aux1)>=tamañotab||(aux2+3)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)||ocupado(taH,aux1,aux2+3)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="c";
                    taH[aux1][aux2+1]="c";
                    taH[aux1][aux2+2]="c";
                    taH[aux1][aux2+3]="c";
                }System.out.println("Barco colocado.");
                aux1=15;
                    aux2=15;
               
        }
        direccion=3;  
    }
    public void colocarporth(){
        while(direccion!=1&&direccion!=2){
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                    while((aux1+4)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)||ocupado(taH,aux1+3,aux2)||ocupado(taH,aux1+4,aux2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="p";
                    taH[aux1+1][aux2]="p";
                    taH[aux1+2][aux2]="p";
                    taH[aux1+3][aux2]="p";
                    taH[aux1+4][aux2]="p";
                }else{
                    while((aux1)>=tamañotab||(aux2+4)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)||ocupado(taH,aux1,aux2+3)||ocupado(taH,aux1,aux2+4)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="p";
                    taH[aux1][aux2+1]="p";
                    taH[aux1][aux2+2]="p";
                    taH[aux1][aux2+3]="p";
                    taH[aux1][aux2+4]="p";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
        }
        direccion=3;  
    }
    public int puntuacion(){
        int puntos=0;
        for(int i=0;i<getTamañotab();i++){
           for(int j=0;j<getTamañotab();j++){
               if(tiroH[i][j].equals("X")){
               puntos=puntos+10;
               }
           } 
        }
        return puntos;
}
    public void xogar(){
        
    }
}
