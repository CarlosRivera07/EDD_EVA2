


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    //DEVUELVE TRUE SI LA LISRA ESTA VACÍA
    public  boolean isEmpty(){
        if (inicio == null) {
            return true;
            
        }else{
            return false;
            
        }
    }
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add (Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        }else{
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
    }
    }
        public void addBegin(Nodo nuevo){
            //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        }else{
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        }
        }
        
        public void insertAt(int pos, Nodo nuevo) throws Exception{
            int iTama = size();
            if ((pos < 0) || (pos >= iTama)) {
                throw new Exception ("La posicion es invalida");
            }else{
                if (pos == 0) {
                    addBegin(nuevo);
                }else{
                    
                int iCont = 0;
                        Nodo temp = inicio;
            while(iCont < (pos - 1)){
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
        }
        }
        
        //VACIAR LA LISTA
            public void clear(){
                inicio = null;
                fin = null;
            }
            
           
            
            //ELIMINAR UN NODO
            public void deleteAt(int pos) throws Exception{
                //OMITIMOS LA VERIFICACION
                //BORRAR LA PRIMERA
                if (isEmpty()) 
                    
                        throw new Exception("La lista está vacia");
            
        int iTama = size();
            if ((pos < 0) || (pos >= iTama)) 
                throw new Exception ("La posicion es invalida");
            
            
            if(iTama == 1){//SOLO HAY UN NODO
                clear();
            }else{//MUCHOS NODOS
                if(pos == 0){
                    inicio = inicio.getSiguiente();
                }else{
                    int iCont = 0;
                        Nodo temp = inicio;
                        while(iCont < (pos - 1)){
                            temp = temp.getSiguiente();
                            iCont++;
            }
                        temp.setSiguiente(temp.getSiguiente().getSiguiente());
                        if(pos == (iTama -1))
                            fin = temp;
                }
            }
        
                
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
        
        //IMPRIMIR LISTA
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getSiguiente();
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
}
