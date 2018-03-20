
package com.fran.xogadores;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

import proxectoprog.Tableiro;

public class Puntuacion {
    File archivo=null;
    PrintWriter pw = null;
    private String username;
    private int puntuacion=0;
    ArrayList <Puntuacion>score=new ArrayList();
    Comparator c1=new Comparator<Puntuacion>() {
        @Override
        public int compare(Puntuacion p, Puntuacion p2) {
            if(p.puntuacion>p2.puntuacion){//ordenamos de mayor a menor
         return -1;
      }else if(p.puntuacion<p2.puntuacion){
         return 1;
      }else{
         return 0;
      }
   }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public Puntuacion(){}
    public Puntuacion( String nome, int puntos) {
        username=nome;
        puntuacion=puntos;
    }
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public void sumPuntuacion(){
           puntuacion=Tableiro.acertoH*10;
           score.add(new Puntuacion(username,puntuacion));
    }

public void guardarFichero(){
     try{
            archivo = new File("puntuacionFich.txt");
            pw = new PrintWriter(archivo);

            for (Puntuacion contador:score){
                pw.println(contador.username+","+contador.puntuacion);
            }

        }catch (FileNotFoundException fnfe1){
                pw.close();
        } 
    }

public void leerFicheiro(){
        Scanner sc=null;
    try{
        archivo = new File ("puntuacionFich.txt");
         sc= new Scanner(archivo).useDelimiter(",\\s*");   
         while(sc.hasNext()){
           score.add(new Puntuacion(sc.next(),Integer.parseInt(sc.next())));
         }
      }catch(FileNotFoundException fnfe1){
         System.out.println("Error:"+fnfe1.getMessage());
      }finally{
       sc.close();
      }
   }
public String vertablascore(){
    String salida="*****Score*****";
    for(Puntuacion c:score){
        salida="\n"+salida+c.username+"-->"+c.puntuacion;
    }
    return salida;
}
    public void ordear(){
        score.sort(c1);
    }
}
