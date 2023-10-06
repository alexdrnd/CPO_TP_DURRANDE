/*
Alexandre Durrande
FG2 TDA
TP2 
18/09/2023
 */
package tp2_bieres_durrande;

/**
 *
 * @author Alexandre
 */
public class BouteilleBiere {
     
String nom;
double degreAlcool;
String brasserie;
boolean ouverte;



public void lireEtiquette(){

    System.out.println("Bouteille de "+nom+ "("+ degreAlcool + " degres) \nBrasserie : "+ brasserie );


}

public BouteilleBiere(String unNom, double unDegre, String 
uneBrasserie, boolean estOuverte ) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = estOuverte;
}




public boolean Décapsuler() {
    if (!ouverte) {
        ouverte = true;
        System.out.println("La biere est maintenant ouverte.");
        return true; // La bière a été ouverte avec succès
    } else {
        System.out.println("Erreur : biere déjà ouverte.");
        return false; // La bière était déjà ouverte
    }
}


    

}

