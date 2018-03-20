
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
        Puntuacion punt=new Puntuacion();
        boolean repetir=true;
        while(repetir){
        punt.setUsername(Entradaspred.pedirString("Benvido a Batalla naval, indique o seu usuario."));
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
            punt.sumPuntuacion();
        }
        JOptionPane.showMessageDialog(null, "Fin do xogo");
        JOptionPane.showMessageDialog(null,"Puntuacion Final: "+punt.getPuntuacion());
        punt.guardarFichero();
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











    }
    
}
