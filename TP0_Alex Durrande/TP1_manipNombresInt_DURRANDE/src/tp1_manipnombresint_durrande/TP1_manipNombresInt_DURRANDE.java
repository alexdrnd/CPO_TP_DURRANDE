/*
Alexandre Durrande
FG2 TDA
Familiarisé avec Netbeans 
18/09/2023
 */
package tp1_manipnombresint_durrande;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TP1_manipNombresInt_DURRANDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// TODO code application logic here
        int nb1;
        int nb2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un premier nombre:");
        nb1 = sc.nextInt();
        
        System.out.println("\n Entrer un second nombre:");
        nb2 = sc.nextInt();

        System.out.println("\n Le resultat de l'addition est égal à " + (nb1+nb2) + "\n Le resultat de la soustraction est égale à "+(nb1-nb2)+ "\n Le resultat de la multiplication est égal à "+ (nb1*nb2) );
        
        System.out.println ( "\n Le resultat du quotient est égal à " + (nb1/nb2) + "\n Le resultat du reste de la division euclidienne"+ (nb1%nb2));
        
    }

}
