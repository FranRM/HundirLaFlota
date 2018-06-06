package soundtrack;

import java.applet.AudioClip;
import javax.swing.JOptionPane;


public class Soundtrack {
    AudioClip music;
        String ruta1="/soundtrack/Musica.wav";
        String rutamisil="/soundtrack/Misil.wav";
       
        public void musica(){

               music=java.applet.Applet.newAudioClip(getClass().getResource(ruta1));

        }
        public void comenzar(){
            music.play(); 
        }
        public void misil(){
        music=java.applet.Applet.newAudioClip(getClass().getResource(rutamisil));
       music.play();    
        }
        
        public void parar(){

            music.stop();
        
        }

}