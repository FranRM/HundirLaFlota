
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
        String auxiliarTamaño;
        do{
        auxiliarTamaño=JOptionPane.showInputDialog("Elixa o tamaño do mapa.\n-Pequeno\n-Medio\n-Grande");
        }
        while(!auxiliarTamaño.equals("Pequeno")||!auxiliarTamaño.equals("Medio")||!auxiliarTamaño.equals("Grande"));
        Tableiro tableiro=new Tableiro(auxiliarTamaño);
        //tableiro.visualizartabH();
        //tableiro.visualizartabM();
        InterfazFlota ventanaXogo = new InterfazFlota(tableiro);
        ventanaXogo.setVisible(true);
        while (tableiro.xogar(new JOptionPane())){
            ventanaXogo.refrescarTablas(tableiro);

        }
        //finalizamos



        
//        Puntuacion p1=new Puntuacion();
//        Xogadores x1=new Xogadores();
//        PuntuacionFich pf1=new PuntuacionFich();
//        p1.addScore(x1);
//        pf1.guardar(p1);










    }
    
}
