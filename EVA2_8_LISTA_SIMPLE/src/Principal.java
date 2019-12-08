
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));//1
        miLista.add(new Nodo(100));//2
        miLista.add(new Nodo(15));//3
        miLista.add(new Nodo(32));//4
        miLista.add(new Nodo(48));//5
        miLista.add(new Nodo(50));//6
        miLista.add(new Nodo(7));//7
        miLista.addBegin(new Nodo (99999));//0
        
        boolean vacia = miLista.isEmpty();
        
        if (vacia) {
            System.out.println("LISTA VACIA");
        }else{
            System.out.println("LISTA CON NODOS");
            miLista.print();
        
    }
        System.out.println(" ");
        try {
            miLista.insertAt(2, new Nodo(1500));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        
        
            /*int [] millon = new int [1000000];
            for (int i = 0; i < millon.length; i++) {
            millon[i] = (int)(Math.random()* 1000);
            }*/
            /*for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo((int)(Math.random()* 1000)));
            }*/
        try {

            miLista.deleteAt(0);
            miLista.print();
            miLista.add(new Nodo(200));
            miLista.print();
            miLista.deleteAt(6);
            miLista.print();
            miLista.add(new Nodo(150));
            miLista.print();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" ");
        System.out.println("Numero de nodos: " + miLista.size());
        
        System.out.println("El valor #3 es: " + miLista.getAt(3));
    }
    
}
