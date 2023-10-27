/*
 *  * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

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
        grille = new GrilleDeCellulles(7, 7); 
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
        System.out.println("Bienvenue dans le jeu LightOff !");
        initialiserPartie();
        boolean partieTerminee = false;

        while (!partieTerminee) {
            System.out.println(grille); // Affiche l'?tat de la grille
            System.out.println("Nombre de coups jou?s : " + nbCoups);

            

            nbCoups++;

            if (grille.cellulesToutesEteintes()) {
                partieTerminee = true;
            }
        }

        System.out.println("Bravo ! Vous avez ?teint toutes les cellules en " + nbCoups + " coups.");
    }
    }

  
    
    
    
    
    
    
    

