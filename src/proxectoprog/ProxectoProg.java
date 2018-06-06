package proxectoprog;

import com.fran.metodos.Entradaspred;
import com.fran.xogadores.*;
import javax.swing.JOptionPane;
import usuario.GUIUsuario;
/**
 *Fran y Luis
 * 
 */
public class ProxectoProg {
 
 
    /**
     * @param args the command line arguments
     */
    static GUIUsuario users=new GUIUsuario();
    static boolean res=true;
    public static void main(String[] args) {
        System.out.println("Hola");
        
        
        
        
        
        while(res){
            
        users.setVisible(true);
        
        }

        
        boolean repetir=true;
        while(repetir){
        
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
        users.insertar(tableiro);
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
    public void cBoolean(){
        res=false;
        users.setVisible(false);
    }
}

