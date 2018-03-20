
package proxectoprog;

import com.fran.metodos.Entradaspred;
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
        boolean repetir=true;
        while(repetir){
        String username=Entradaspred.pedirString("Benvido a Batalla naval, indique o seu usuario.");
        String auxiliarTamaño;
        do{
        auxiliarTamaño=Entradaspred.pedirString("Elixa o tamaño do mapa.\n-Pequeno\n-Medio\n-Grande");
        }while(!auxiliarTamaño.equalsIgnoreCase("Pequeno")&&!auxiliarTamaño.equalsIgnoreCase("Medio")&&!auxiliarTamaño.equalsIgnoreCase("Grande"));
        Tableiro tableiro=new Tableiro(auxiliarTamaño);
        InterfazFlota ventanaXogo = new InterfazFlota(tableiro);
        ventanaXogo.setVisible(true);
        ventanaXogo.acotarMapa(tableiro);
        while (tableiro.xogar(new JOptionPane())){
            ventanaXogo.refrescarTablas(tableiro);
        }
        JOptionPane.showMessageDialog(null, "Fin do xogo");
        ventanaXogo.setVisible(false);
        String auxiliar=Entradaspred.pedirString("Desexa volver a xogar?\n      Y/N");
        switch(auxiliar){
            case"Y":
                repetir=true;
                break;
            default:
                repetir=false;
        }
        
    }
        JOptionPane.showMessageDialog(null, "Ata a proxima.");
//Hola
        
//        Puntuacion p1=new Puntuacion();
//        Xogadores x1=new Xogadores();
//        PuntuacionFich pf1=new PuntuacionFich();
//        p1.addScore(x1);
//        pf1.guardar(p1);










    }
    
}
