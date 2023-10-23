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
public class Personne {

    @Override

    public String toString() {

    String chaine;

    chaine= Nom+""+Prenom;

    return chaine;

    }

    String Nom;

    String Prenom;

    int nbVoitures=0 ;

    Voiture [] liste_voitures ;

   

    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {

        if(voiture_a_ajouter.Proprietaire != null){

            System.out.println("Cette voiture appartient déjà à quelqu'un");

            return false;

        }

        if (nbVoitures>=3){

            System.out.println("Vous possedez deja 3 voitures ");

            return false;

        }

        liste_voitures[nbVoitures]= voiture_a_ajouter;

        nbVoitures++;

        voiture_a_ajouter.Proprietaire=this;

        System.out.println(voiture_a_ajouter.Marque+""+voiture_a_ajouter.Modele+"a ete ajoute a la liste de"+Nom+""+Prenom+".");

        return true;

    }

 

   

    public Personne(String nom, String prenom) {

        Nom=nom;

        Prenom=prenom;

        liste_voitures = new Voiture [3] ;

    }

   

}