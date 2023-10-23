/*
Alexandre Durrande
FG2 TDA
TP2 
18/09/2023
 */
package tp2_relation_1_durrande;

/**
 *
 * @author Alexandre
 */
public class Voiture {

    String Modele;

    String Marque;

    int Puissance;

    Personne Proprietaire ;

   

    @Override

    public String toString() {

        String chaine;

        chaine=Modele+""+Marque+""+Puissance;

        return chaine;

    }

 

    public Voiture(String modele, String marque,int puissance) {

        Modele=modele;

        Marque=marque;

        Puissance=puissance;

        Proprietaire=null;

       

    }

   

    

}