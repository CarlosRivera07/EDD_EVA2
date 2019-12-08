/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Nodo {
    private int iValor;
    private Nodo Izq;
    private Nodo Der;

    public Nodo() {
        
        this.Izq = null;
        this.Der = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.Izq = null;
        this.Der = null;
    }
    
    

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getIzq() {
        return Izq;
    }

    public void setIzq(Nodo siguiente) {
        this.Izq = siguiente;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setDer(Nodo previo) {
        this.Der = previo;
    }
    
    
}
