
package com.fran.xogadores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PuntuacionFich {
    private final File puntuacionFich;
    
    public PuntuacionFich(){
        puntuacionFich=new File("puntuacionFich.txt");
    }
    
    public void cargarFich(Puntuacion scores){
        FileInputStream fich=null;
    
        try{
        fich=new FileInputStream(puntuacionFich);
        ObjectInputStream ois = new ObjectInputStream(fich);
        scores.setScoresList((ArrayList<Xogadores>)ois.readObject());
        }catch (FileNotFoundException ex) {
         }catch (IOException | ClassNotFoundException ex) {
             Logger.getLogger(PuntuacionFich.class.getName()).log(Level.SEVERE, null, ex);
         }finally {
            try {
                if(fich != null) {
                   fich.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(PuntuacionFich.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void guardar(Puntuacion scores){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(puntuacionFich);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject((ArrayList<Xogadores>)scores.getScoresList());
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(PuntuacionFich.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fos != null) {
                   fos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(PuntuacionFich.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }        
                
    }
    

