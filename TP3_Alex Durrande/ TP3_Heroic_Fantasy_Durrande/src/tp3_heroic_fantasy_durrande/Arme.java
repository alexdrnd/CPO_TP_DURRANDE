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


public abstract class Arme {
    String name;
    int niveauAttaque;
    
    public int connaitreNivAttaque() {
        return niveauAttaque;
    }
    
    public String connaitreNom() {
        return name;
    }
            
            
    @Override
    public String toString () {                            
        return "nom de l'arme: " + name + ", Niveau d'attaque: " + niveauAttaque;
    }
    
}