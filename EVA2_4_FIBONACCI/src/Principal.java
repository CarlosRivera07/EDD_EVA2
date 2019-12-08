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
        System.out.println(fibonacci(9));
    }
    public static int fibonacci(int iVal){
        
        if (iVal == 0) {
            return 0;
        }else{
            if (iVal == 1) {
                return 1;
            }else{
              return fibonacci(iVal - 1) + fibonacci(iVal - 2);  
            }
        }
    }
    
}
