package proxectoprog;

import com.fran.metodos.Entradaspred;
import com.fran.xogadores.*;
import javax.swing.JOptionPane;
import soundtrack.Soundtrack;
import usuario.GUIUsuario;

/**
 * Fran y Luis
 *
 */
public class ProxectoProg {

    /**
     * @param args the command line arguments
     */
    
    /*
    *Atributo de GUIUsuario para hacerlo luego visible dentro del Main, donde se inicia todo
    */
    
    static GUIUsuario users = null;

    public static void main(String[] args) {

        /*
        * El primero inicializa como GUIUsuario, y el segundo la hace visible
        */
        users = new GUIUsuario();
        users.setVisible(true);
    }
    /*  
    *Metodo estatico de Generar el mapa y juego como tal.
    */
    public static void generarP() {
        Tableiro tableiro = new Tableiro("Pequeno");
        InterfazFlota ventanaXogo = new InterfazFlota(tableiro);
        ventanaXogo.setVisible(true);

        tableiro.visualizartabM();


//        JOptionPane.showMessageDialog(null, "Fin do xogo.\nA sua puntuación: "+punt.());

    }
    /*
    *Metodo estatico terminar partida donde hace la llamada para guardar en la base
    */
    public static void terminarPartida(InterfazFlota ventanaXogo, Tableiro tableiro) {
        ventanaXogo.setVisible(false);
        users.insertar(tableiro);
        GUIPunt poi = new GUIPunt();
        poi.setVisible(true);

        String auxiliar = Entradaspred.pedirString("Desexa volver a xogar?\n      Y/N");
        switch (auxiliar) {
            case "Y":
                tableiro.resetearAcertos();
                generarP();
                break;
            default:
                poi.setVisible(false);
                JOptionPane.showMessageDialog(null, "Ata a proxima.");
        }
    }

}
