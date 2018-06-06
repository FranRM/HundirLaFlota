package soundtrack;

import java.applet.AudioClip;
import javax.swing.JOptionPane;


public class Soundtrack {
    /**
    *Clase con atributos estaticos para acceder dende os diferentes paquetes e interfaces
    * @param music
    * @param ruta1
    * @param rutamisil
    **/
        static  AudioClip  music;
        static String ruta1="/soundtrack/Musica.wav";
        static String rutamisil="/soundtrack/Misil.wav";
    /*
    *Metodo para iniciar la musica, se elige la ruta pero no inicia    
    */   
        public  void musica(){

               music=java.applet.Applet.newAudioClip(getClass().getResource(ruta1));

        }
        /*
        *Metodo estatico que inicia la musica
        */
        public static void comenzar(){
            music.play(); 
        }
        /*
        *Metodo aun inactiva para el sonido de misiles, para un futuro
        */
        public void misil(){
        music=java.applet.Applet.newAudioClip(getClass().getResource(rutamisil));
       music.play();    
        }
        /*
        *Metodo estatico que para la musica
        */
        public static void parar(){

            music.stop();
        
        }

}