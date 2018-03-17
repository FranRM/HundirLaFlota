
package proxectoprog;

import com.fran.xogadores.*;
import javax.swing.JOptionPane;


/**
 *Fran y Luis
 * 
 */
public class ProxectoProg {
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tableiro tableiro=new Tableiro("pequeno");
        //tableiro.visualizartabH();
        //tableiro.visualizartabM();
        InterfazFlota ventanaXogo = new InterfazFlota(tableiro);
        ventanaXogo.setVisible(true);
        while (tableiro.xogar(new JOptionPane())){
            ventanaXogo.refrescarTablas(tableiro);
            //actualizamos vista
        }
        //finalizamos



        
//        Puntuacion p1=new Puntuacion();
//        Xogadores x1=new Xogadores();
//        PuntuacionFich pf1=new PuntuacionFich();
//        p1.addScore(x1);
//        pf1.guardar(p1);










    }
    
}
