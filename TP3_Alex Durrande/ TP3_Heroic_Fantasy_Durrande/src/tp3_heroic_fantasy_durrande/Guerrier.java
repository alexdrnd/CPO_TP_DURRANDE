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
public class Guerrier extends Personnages {
    private boolean cheval;
    
    public Guerrier(String nom, int niveauDeVie, boolean cheval) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.cheval = cheval;
    }
    
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    // Ajoutez des getters si nécessaire pour accéder à l'attribut cheval.
}
