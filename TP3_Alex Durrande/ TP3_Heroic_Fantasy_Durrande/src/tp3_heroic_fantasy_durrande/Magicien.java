/*
Alexandre Durrande
FG2 TDA
TP3
18/09/2023
 */
package tp3_heroic_fantasy_durrande;

/**
 *
 * @author Alexandre
 */

    public class Magicien extends Personnages {
    private boolean confirmé;
    
    public Magicien(String nom, int niveauDeVie, boolean confirmé){
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.confirmé = confirmé;
    }
    
    public void setCheval(boolean confirmé){
        this.confirmé = confirmé;
    }
    
}
