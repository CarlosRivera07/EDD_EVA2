
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int iVal = input.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i + " - ");
            
        }
        System.out.println(" ");
        forFalso(iVal);
        
        System.out.println("ingrese otro número");
        int iVal2 = input.nextInt();
        System.out.println("");
        forFalso2(iVal2, 1);
    }
    public static void forFalso(int iVal){
        System.out.print(iVal + " - ");
        if (iVal > 1) {
         forFalso(iVal - 1);
           
        }
        
    }
    public static void forFalso2(int iVal2, int inc){
        System.out.println(inc + " - ");
        if (inc > 1) {
            forFalso2(iVal2, inc + 1);
        }
    }
    
}
