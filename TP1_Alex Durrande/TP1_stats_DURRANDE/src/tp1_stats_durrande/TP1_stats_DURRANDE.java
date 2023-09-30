/*
Alexandre Durrande
FG2 TDA
Familiarisé avec Netbeans 
18/09/2023
 */
package tp1_stats_durrande;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TP1_stats_DURRANDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] tableauDes = new int[6];

        for (int i = 0; i < 6; i++) {
            tableauDes[i] = 0;
        }

        System.out.print("Saisissez le nombre de lancers de dés : ");
        int nombreLancers = scanner.nextInt();

        for (int i = 0; i < nombreLancers; i++) {
            int resultatLancer = generateurAleat.nextInt(6); // Génère un nombre entre 0 et 5 inclus
            tableauDes[resultatLancer]++; // Incrémente le compteur de la face du dé correspondante
        }
        System.out.println("Résultat des lancers de dés :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double)tableauDes[i] / nombreLancers*100.0;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
        }

        scanner.close();

    }

}
