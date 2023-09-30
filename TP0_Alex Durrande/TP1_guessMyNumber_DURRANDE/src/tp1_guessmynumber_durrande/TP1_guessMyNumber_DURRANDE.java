/*
Alexandre Durrande
FG2 TDA
Familiarisé avec Netbeans 
18/09/2023
 */
package tp1_guessmynumber_durrande;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TP1_guessMyNumber_DURRANDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        // for (int i = 0 ; i<5; i++) {
        // int nombreAleatoire = generateurAleat.nextInt(100);
        // System.out.println("Nombre aléatoire #" + (i + 1)+ " est :" + nombreAleatoire);    
        //} 
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile (nombre entre 1 et 10)");
        System.out.println("2. Normal (nombre entre 1 et 100)");
        System.out.println("3. Difficile (nombre entre 1 et 1000)");
        int choixDifficulte = scanner.nextInt();

        int nombreMax = 0;
        switch (choixDifficulte) {
            case 1 ->
                nombreMax = 10;
            case 2 ->
                nombreMax = 100;
            case 3 ->
                nombreMax = 1000;
            default -> {
                System.out.println("Niveau de difficulté inexsistant.");
                return;
            }
        }
        int nombreAleatoire = generateurAleat.nextInt(nombreMax) + 1;
        int nombreTentatives = 0;
        int nombrePropose;

        System.out.println("Devinez le nombre entre 1 et " + nombreMax + ".");

        while (true) {
            nombreTentatives++;
            System.out.print("Votre proposition : ");
            nombrePropose = scanner.nextInt();
            if (nombrePropose < 1 || nombrePropose > nombreMax) {
                System.out.println("Le nombre proposé n'est pas dans l'intervalle. Réessayez.");
            } else if (nombrePropose < nombreAleatoire) {
                System.out.println("Trop petit.");
            } else if (nombrePropose > nombreAleatoire) {
                System.out.println("Trop grand.");
            } else {
                System.out.println("Vous avez trouvé le nombre " + nombreAleatoire + " en " + nombreTentatives + " tentatives.");
                break;
            }
        }

        scanner.close();
    }

}


