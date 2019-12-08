/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble(){
        this.inicio = null;
        this.fin = null;
      
    }
    
    
            
    //DEVUELVE TRUE SI LA LISTA ESTA VACIA        
    public  boolean isEmpty(){
        if(inicio == null) {
            return true;
            
        }else{
            return false;
            
        }
    }
    
    //AAL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //LISTA VACIA
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
            
        }else{
            fin.setSiguiente(nuevo);//HACIA ADELANTE
            nuevo.setPrevio(fin); //HACIA ATRAS
            fin = nuevo;
        }
    }
    
    //IMPRIMIR LISTA
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    //IMPRIMIR LISTA DE FIN A INICIO
    public void printBack(){
        Nodo temp = fin;
        while(temp != null){
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }
    
    //TAMAÑO DE LA LISTA
    public int size(){
        int iCont = 0;
        Nodo temp = inicio;
        while(temp != null){
        iCont++;
        temp = temp.getSiguiente();
    }
    return iCont;
    }
    
    
    //VACIAR LA LISTA
            public void clear(){
                inicio = null;
                fin = null;
            }
            
    public int getAt(int pos){
    //VERIFICAR
        int iCont = 0;
        Nodo temp = inicio;
        while(iCont < pos){
            temp = temp.getSiguiente();
            iCont++;
        }
            return temp.getiValor();
    }

}
