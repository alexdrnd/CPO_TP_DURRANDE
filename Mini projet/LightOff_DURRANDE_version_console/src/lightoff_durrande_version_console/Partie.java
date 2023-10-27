/*
 *  * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */

    public class Partie {
    private GrilleDeCellulles grille;
    private int nbCoups;

    /**
     *Cr?e un nouvelle grille de cellulles lumineuse pour initialis? le nombre de coup ? 0.
     */
    public Partie() {
        grille = new GrilleDeCellulles(10, 10); 
        nbCoups = 0;
    }

    /**
     *POur s'asssurer que la grille soit bien m?lang?.
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); 
    }

    /**
     *boucle permettant de jouer au jeu 
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Bienvenue dans le jeu LightOff !");
    initialiserPartie();
    boolean partieTerminee = false;

    while (!partieTerminee) {
        System.out.println(grille); // Affiche l'?tat de la grille
        System.out.println("Nombre de coups jou?s : " + nbCoups);
        System.out.println("Que souhaitez-vous faire ? (1. Activer une ligne, 2. Activer une colonne, 3. Activer une diagonale, 4. Quitter) : ");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Num?ro de la ligne ? activer : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne);
                break;
            case 2:
                System.out.println("Num?ro de la colonne ? activer : ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne);
                break;
            case 3:
                System.out.println("1. Activer diagonale descendante, 2. Activer diagonale montante : ");
                int diagonale = scanner.nextInt();
                if (diagonale == 1) {
                    grille.activerDiagonaleDescendante();
                } else {
                    grille.activerDiagonaleMontante();
                }
                break;
            case 4:
                partieTerminee = true;
                break;
        }

        nbCoups++;

        if (grille.cellulesToutesEteintes()) {
            partieTerminee = true;
        }
    }

    System.out.println("Bravo ! Vous avez ?teint toutes les cellules en " + nbCoups + " coups.");
    scanner.close();
    }
    }
  
    
    
    
    
    
    
    

