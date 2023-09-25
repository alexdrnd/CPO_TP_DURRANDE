 /*
Alexandre Durrande
FG2 TDA
Familiarisé avec Netbeans 
18/09/2023
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Calculator {

    /**
     * @param
     * args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator:\n1)add\n2)Substract\n3)multiply\n4)divide\n5)modulo");
        
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre:");
        operateur = sc.nextInt();
        
        int operande1;
        System.out.println("\n Entrer la première valeur:");
        operande1 = sc.nextInt();
        
        int operande2;
        System.out.println("\n Entrer la première valeur:");
        operande2 = sc.nextInt();
        
       int result;
       switch (operateur) {
               case 1 : result= operande1 + operande2; break;
               case 2 : result = operande1 - operande2 ; break;
               
               case 3 : result = operande1 * operande2; break;
               case 4 : result = operande1 / operande2; break;
               
               case 5 : result = operande1 % operande2; break; 
               default : System.out.println("operateur inconnue"); break;
        }
               
                      
                       
        
    }
    
}
