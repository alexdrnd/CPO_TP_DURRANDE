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
    private int nombreTentatives;

    /**
     *Cr?e un nouvelle grille de cellulles lumineuse pour initialis? le nombre de coup ? 0.
     */
    public Partie() {
        grille = new GrilleDeCellulles(10, 10); 
        nbCoups = 0;
        nombreTentatives = 12; 
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
    System.out.println("Bienvenue dans le jeu LightOff !\nVous avez 12 coups pour remporter la partie");
    initialiserPartie();
    boolean partieTerminee = false;

    while (!partieTerminee) {
        System.out.println(grille); 
        System.out.println("Nombre de coups joues : " + nbCoups);
        System.out.println("Que souhaitez-vous faire ? (1. Activer une ligne, 2. Activer une colonne, 3. Activer une diagonale, 4. Quitter) : ");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Numero de la ligne ? activer : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne);
                break;
            case 2:
                System.out.println("Numero de la colonne ? activer : ");
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

        if (grille.cellulesToutesEteintes() || nbCoups >= nombreTentatives) {
            partieTerminee = true;
        }
    }

    if (grille.cellulesToutesEteintes()) {
        System.out.println("Bravo ! Vous avez eteint toutes les cellules en " + nbCoups + " coups.");
    } else {
        System.out.println("Desole, vous avez epuise vos tentatives. Essayez encore !");
    }

    scanner.close();
}}

    
    
    
    
    
    
    

