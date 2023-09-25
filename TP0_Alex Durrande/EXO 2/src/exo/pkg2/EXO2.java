 /*
Alexandre Durrande
FG2 TDA
Familiarisé avec Netbeans 
18/09/2023
*/
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class EXO2 {

    /**
     * @param args the command line arguments
     */public static void main(String[] args) {
        int nb;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre:");
        nb= sc.nextInt();
        
        // TODO code application logic here
       
        int result; 
        int ind;
        //nb=5;
        result=0;
        
        ind = 1;
        while (ind <=nb) {
          result=result+ind;
          ind=1+ind;
        }  
        System.out.println();
        System.out.println("La somme des" + nb+ "entier est: "+ result);
       }
}
        