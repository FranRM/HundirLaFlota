package proxectoprog;

import com.fran.xogadores.*;
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

        /**
        * El primero inicializa como GUIUsuario 
        *@param users
        * el segundo la hace visible
         ^**/
        users = new GUIUsuario();
        users.setVisible(true);
    }

    /**
     * Metodo estatico de Generar el mapa y juego como tal.
     * 
     **/
    public static void generarP() {
        Tableiro tableiro = new Tableiro("Pequeno");
        InterfazFlota ventanaXogo = new InterfazFlota(tableiro);
        ventanaXogo.setVisible(true);
        tableiro.visualizartabM();
    }

    /**
     * Metodo que realiza a accion de pechar o interfaz do xogo en si e iniciar
     * o de puntuacion,
     *
     * @param ventanaXogo
     * @param tableiro
     */
    public static void terminarPartida(InterfazFlota ventanaXogo, Tableiro tableiro) {
        ventanaXogo.setVisible(false);
        users.insertar(tableiro);
        GUIPunt poi = new GUIPunt();
        poi.setVisible(true);
        if(Tableiro.getAcertoH()== tableiro.getAcertofin()){
            GUIPunt.imprimirResultadoPartida("Victoria");
        }else{
            GUIPunt.imprimirResultadoPartida("Derrota");
        }
    }

}
