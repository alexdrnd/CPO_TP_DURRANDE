/*
Alexandre Durrande
FG2 TDA
TP3
18/09/2023
 */
package Armes;
import Armes.*;


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

    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}