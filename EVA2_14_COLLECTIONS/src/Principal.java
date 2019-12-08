
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> lListaEnla = new LinkedList<String>();
        lListaEnla.add("Hola ");
        lListaEnla.add("");
        lListaEnla.add("mundo");
        lListaEnla.add("");
        lListaEnla.add("cruel");
        lListaEnla.add("!!!");
        lListaEnla.addFirst("XXXX");
        
        System.out.println(lListaEnla);
        
        for (String string : lListaEnla) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        System.out.println("Cantidad de elementos" + lListaEnla.size());
        lListaEnla.remove(3);
        System.out.println(lListaEnla);
    }
    
    
    
}
