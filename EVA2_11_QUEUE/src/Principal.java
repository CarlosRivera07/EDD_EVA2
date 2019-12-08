
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * agregar --> al final 
    quitar  --> al inicio
    leer --> al inicio
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Cola miCola = new Cola();
        miCola.agregar(new Nodo(100));
        miCola.agregar(new Nodo(200));
        miCola.agregar(new Nodo(300));
        miCola.agregar(new Nodo(400));
        miCola.agregar(new Nodo(500));
        
        miCola.print();
        
        System.out.println("CIMA DE LA COLA" + miCola.leer());
        try{
            miCola.quitar();
        }catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
