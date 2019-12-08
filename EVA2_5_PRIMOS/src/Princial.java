
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Princial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO: ");
        int iVal = input.nextInt();
        if (esPrimoIneficiente(iVal)) {
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
        
    }
    public static boolean esPrimoIneficiente(int n){
        boolean resu= true;
        for (int i = 2; i < n; i++) {
            if ((n%i) == 0) {
                resu = false;
                break;
            }
        }
        return resu;
    }
    
}
