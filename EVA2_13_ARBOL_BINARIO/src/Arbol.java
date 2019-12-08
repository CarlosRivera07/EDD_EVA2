/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Arbol {
    private Nodo root;

    public Arbol() {
        root = null;
    }
    
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    
    public void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){//ARBOL VACÍO
            root = nuevo;
        }else{
            if(nuevo.getiValor() > actual.getiValor()){//MAYOR --> DERECHA
                if(actual.getDer() == null)//ESA VACIO
                    actual.setDer(nuevo);
                
            else//ya hay un nodo
                    agregarNodoRec(actual.getDer(), nuevo);
            }else if(nuevo.getiValor() < actual.getiValor()){//MENOR --> IZQUIERDA
                if(actual.getIzq() == null)//
                    actual.setIzq(nuevo);
                
                        else
                    agregarNodoRec(actual.getIzq(), nuevo);      
                        
                    
                }else{//EL VALOR YA EXISTE
                    System.out.println("UPS! YA EXISTE EL VALOR");
                }
    
            }
        
        }

    
    
    public void impimepostOrder(){
        postOrder(root);
    }
    
    private void postOrder(Nodo actual){
        if(actual != null){
                //LEER IZQUIERDA
                postOrder(actual.getIzq());
                //LEER DERECHA
                postOrder(actual.getDer());
                //IMPRIMIR
                System.out.print(actual.getiValor() + "-");
        }
    }
    
    
    public void impimePreOrder(){
        PreOrder(root);
    }
    
    private void PreOrder(Nodo actual){
        if(actual != null){
                //IMPRIMIR
                System.out.print(actual.getiValor() + "-");
                //LEER IZQUIERDA
                PreOrder(actual.getIzq());
                //LEER DERECHA
                PreOrder(actual.getDer());
                
        }
    }
    
    public void impimeInOrder(){
        InOrder(root);
    }
    
    private void InOrder(Nodo actual){
        if(actual != null){
                //LEER IZQUIERDA
                InOrder(actual.getIzq());
                //IMPRIMIR
                System.out.print(actual.getiValor() + "-");
                //LEER DERECHA
                InOrder(actual.getDer());
                
        }
    }
            
    
}
