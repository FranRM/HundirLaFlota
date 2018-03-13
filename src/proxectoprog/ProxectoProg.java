
package proxectoprog;

import com.fran.xogadores.Puntuacion;
import com.fran.xogadores.PuntuacionFich;
import com.fran.xogadores.Xogadores;

/**
 *Fran y Luis
 * 
 */
public class ProxectoProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tableiro t1=new Tableiro("pequeno");
        Barco b1=new Barco();
        t1.modoxogo();
        System.out.println(t1.getNumbarcos());
        System.out.println(t1.getTamañotab());
        t1.elixbarcos();
<<<<<<< HEAD
        t1.crearTab();
        t1.montarTab();
        t1.visualizartab();
=======
//        Puntuacion p1=new Puntuacion();
//        Xogadores x1=new Xogadores();
//        PuntuacionFich pf1=new PuntuacionFich();
//        p1.addScore(x1);
//        pf1.guardar(p1);
>>>>>>> 62acd517b1844c2d19dede4e9bbbdef7b4dbbd62
        
    }
    
}
