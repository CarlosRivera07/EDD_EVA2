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
        
        ListaDoble miLista = new ListaDoble();
        
        //Añadir nodos a la lista
        miLista.add(new Nodo (100));
        miLista.add(new Nodo (200));
        miLista.add(new Nodo (300));
        miLista.add(new Nodo (400));
        
        //Imprimir la lista 
        miLista.print();
        
        
        //Comprobar si la lista esta vacia
        boolean vacia = miLista.isEmpty();
        
        if (vacia) {
            System.out.println("LISTA VACIA");
        }else{
            System.out.println("LISTA CON NODOS");
            miLista.print();
        
    }
        
        //imprimir la lista al reves
        miLista.printBack();
        
        //Tamaño de la lista
        System.out.println("La lista tiene " + miLista.size() + " nodos.");
        
        
        //Vaciar la Lista
        miLista.clear();
        miLista.print();
    }
    
}
