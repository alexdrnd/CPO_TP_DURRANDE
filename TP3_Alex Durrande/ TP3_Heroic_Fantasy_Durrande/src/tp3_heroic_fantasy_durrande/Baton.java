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
public class Baton extends Arme {
    int âge;
    
    public Baton(String name, int niveauAttaque, int âge) {
        this.name = name;
        this.niveauAttaque = niveauAttaque;
        this.âge = âge;
        
    }
}