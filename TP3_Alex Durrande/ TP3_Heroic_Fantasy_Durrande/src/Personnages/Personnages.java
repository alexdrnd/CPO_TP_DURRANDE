/*
Alexandre Durrande
FG2 TDA
TP3
18/09/2023
 */
package Personnages;

import Armes.Arme;



/**
 *
 * @author Alexandre
 */
   import java.util.ArrayList;
import java.util.Scanner;

public abstract class Personnages {
    String nom; 
    int niveauDeVie; 
    String ArmePortee = null;
    Arme armeEnMain;
    
      public Personnages (String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        armeEnMain = null;
        
    }
    
    
    ArrayList<Arme> armesPossedes = new ArrayList<Arme>();
    
    public boolean ajouterUneArme(Arme armeAjouter) {
        if (this.armesPossedes.size() == 5) {
            return false;
        } else {
            this.armesPossedes.add(armeAjouter);
            return true;
        }
    }
    
    public void armePortee() {
        System.out.println("Voici les armes disponibles, laquelle voulez-vous choisir? \n");
        for (int i = 0; i < this.armesPossedes.size(); i++) {
            System.out.println("(" + i + ") " + this.armesPossedes.get(i).getNom());
        }
        Scanner choix = new Scanner(System.in);
        int armeAjoutee = choix.nextInt();
        Arme arme = this.armesPossedes.get(armeAjoutee);
        ArmePortee = arme.getNom();
    }
     public void seFatiguer() {
        
    }
    public int connaitreVie() {
        return niveauDeVie;
    }   
    public String connaitrePerso() {
        return nom;
    }   
    public boolean estVivant() {
        return niveauDeVie > 0;
    }
    public void estAttaque(int points) {
        
    }
    
    @Override
    public String toString() {   
        String Infoarme = (armeEnMain != null) ? "Arme en main : " + armeEnMain.toString() : "Aucune arme en main";
        return "Nom du personnage : " + nom + ", Niveau de vie : " + niveauDeVie;
    }
       
    }
    
    
    


