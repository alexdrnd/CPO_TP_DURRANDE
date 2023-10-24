/*
Alexandre Durrande
FG2 TDA
TP3
18/09/2023
 */
package Personnages;
import Personnages.*;
/**
 *
 * @author Alexandre
 */

public class Magicien extends Personnages {
    boolean confirmer;    
    
    public Magicien (String nom, int pdv, boolean a){
        super(nom , pdv);
        confirmer=a;
        
    }
 @Override
public String toString() {
String chaine_a_retourner;
if (confirmer == true){
chaine_a_retourner = ("Le magicien "+nom+niveauDeVie+ "vie confirmé");
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le magicien "+nom+niveauDeVie+ "vie débutant");

   return chaine_a_retourner; 
}
}
}