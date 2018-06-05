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
        System.out.println("Hola");
        //Pasar puntacion a sql.
        Puntuacion punt=new Puntuacion();
//        Entradaspred.pedirString("Benvido a Batalla naval, indique o seu usuario.")
        boolean repetir=true;
        while(repetir){
        punt.nome();
        
        Tableiro tableiro=new Tableiro("Pequeno");
        InterfazFlota ventanaXogo = new InterfazFlota(tableiro);
        ventanaXogo.setVisible(true);
        ventanaXogo.acotarMapa(tableiro);
        tableiro.visualizartabM();
        while (tableiro.xogar(new JOptionPane())){
            ventanaXogo.refrescarTablas(tableiro);
            ventanaXogo.conversor1(tableiro);
            tableiro.visualizartabM();
        }
        
//        JOptionPane.showMessageDialog(null, "Fin do xogo.\nA sua puntuación: "+punt.());
        ventanaXogo.setVisible(false);
        punt.insertar(tableiro);
        GUIPunt poi=new GUIPunt();
        poi.setVisible(true);
        String auxiliar=Entradaspred.pedirString("Desexa volver a xogar?\n      Y/N");
        switch(auxiliar){
            case"Y":
                repetir=true;
                break;
            default:
                poi.setVisible(false);
                repetir=false;
        }
    }
        JOptionPane.showMessageDialog(null, "Ata a proxima.");
    }
    
}

