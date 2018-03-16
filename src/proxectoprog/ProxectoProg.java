
package proxectoprog;

import com.fran.xogadores.*;
import javax.swing.JFrame;
import static proxectoprog.InterfazFlota.jPanel1;


/**
 *Fran y Luis
 * 
 */
public class ProxectoProg {
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       jPanel1 h = new jPanel();
        h.setVisible(true);
        Tableiro t1=new Tableiro("pequeno");
        Barco b1=new Barco();
        t1.modoxogo();
        System.out.println(t1.getNumbarcos());
        System.out.println(t1.getTamañotab());
        t1.elixbarcos();
        t1.crearTab();
        t1.montarTab();
        t1.visualizartabH();
        System.out.println();
        t1.visualizartabM();
//        Puntuacion p1=new Puntuacion();
//        Xogadores x1=new Xogadores();
//        PuntuacionFich pf1=new PuntuacionFich();
//        p1.addScore(x1);
//        pf1.guardar(p1);
<<<<<<< HEAD
=======

>>>>>>> 396fec8f1a290942787d906c28c8f802ce088794
    }
    
}
