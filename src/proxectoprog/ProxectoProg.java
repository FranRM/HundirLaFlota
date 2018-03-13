
package proxectoprog;

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
        t1.crearTab();
        t1.montarTab();
        t1.visualizartab();
        
    }
    
}
