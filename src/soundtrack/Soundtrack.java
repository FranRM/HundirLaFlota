package soundtrack;

import java.applet.AudioClip;
import javax.swing.JOptionPane;


public class Soundtrack {
   static  AudioClip  music;
        static String ruta1="/soundtrack/Musica.wav";
        static String rutamisil="/soundtrack/Misil.wav";
       
        public  void musica(){

               music=java.applet.Applet.newAudioClip(getClass().getResource(ruta1));

        }
        public static void comenzar(){
            music.play(); 
        }
        
        public void misil(){
        music=java.applet.Applet.newAudioClip(getClass().getResource(rutamisil));
       music.play();    
        }
        
        public static void parar(){

            music.stop();
        
        }

}