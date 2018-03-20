
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
    /**
     * Comparator necesario para ordenar o arraylist de puntuacións.
     */
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
/**
 * Getter do nome do xogador.
 * @return String co nome.
 */
    public String getUsername() {
        return username;
    }
/**
 * Setter do nome de xogador.
 * @param username String co nome a sustiruir.
 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Constructor da clase.
     */
    public Puntuacion(){}
    /**
     * Constructor paramétrico para os obxetos.
     * @param nome String.
     * @param puntos Cantidade de puntos a inserir.
     */
    public Puntuacion( String nome, int puntos) {
        username=nome;
        puntuacion=puntos;
    }
    /**
     * Getter de puntuación.
     * @return Retorna un integer coa puntuación.
     */
    public int getPuntuacion() {
        return puntuacion;
    }
/**
 * Setter de puntuación.
 * @param puntuacion Valor para inserir.
 */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    /**
     * Método que calcula a puntuación do xogador, en función dos impactos realizados.
     * @param t Obxeto de tipo tableiro.
     */
    public void sumPuntuacion(Tableiro t){
           puntuacion=t.getAcertoH()*10;
           score.add(new Puntuacion(username,puntuacion));
    }
/**
 * Método que permite escribir a taboa de puntacións de volta ó ficheiro.
 */
public void guardarFichero(){
    archivo = new File("puntuacionFich.txt");
     try{
            pw = new PrintWriter(archivo);
            for (Puntuacion contador:score){
                pw.println(contador.username+","+contador.puntuacion+",");
            }
        }catch (FileNotFoundException fnfe1){
                System.out.println("Error: "+fnfe1.getMessage());
        } finally{
        pw.close();
     }
    }
/**
 * Método que permite leer os datos do ficheiro e importalos a un arrayList.
 */
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
/**
 * Método que permite visualizar a taboa de puntuacións. 
 */
public void vertablascore(){
    String salida="*****Score*****\n";
    for(Puntuacion c:score){
        salida=salida+c.username+"-->"+c.puntuacion+"\n";
    }
    JOptionPane.showMessageDialog(null,salida );
}
/**
 * Método que permite ordear o ArrayList de maior a menor.
 */
    public void ordear(){
        score.sort(c1);
    }
}
