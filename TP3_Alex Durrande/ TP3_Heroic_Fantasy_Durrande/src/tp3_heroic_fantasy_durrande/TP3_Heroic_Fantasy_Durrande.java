/*
Alexandre Durrande
FG2 TDA
TP3 
18/09/2023
 */
package tp3_heroic_fantasy_durrande;

import Armes.Baton;
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnages;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class TP3_Heroic_Fantasy_Durrande {

    /**
     * 
     */
    public static void main(String[] args) {

        Arme Epee1 = new Epee("Excalibur", 7, 5);
        Arme Epee2 = new Epee("Durandal", 4, 7);
        Arme bat1 = new Baton("Chêne", 4, 5);
        Arme bat2 = new Baton("Charme", 5, 6);


// ...

ArrayList<Arme> tabArmes = new ArrayList<Arme>();
tabArmes.add(Epee1);
tabArmes.add(Epee2);
tabArmes.add(bat1);
tabArmes.add(bat2);

for (int i = 0; i < tabArmes.size(); i++) {
    System.out.println(tabArmes.get(i));
}

        Personnages Magicien1 = new Magicien("Gandalf", 65, true);
        Personnages Magicien2 = new Magicien("Garcimore", 44, false);
        Personnages Guerrier1 = new Guerrier("Conan", 78, false);
        Personnages Guerrier2 = new Guerrier("Lannister", 45, true);

ArrayList<Personnages> tabPerso = new ArrayList<Personnages>();
tabPerso.add(Magicien1);
tabPerso.add(Magicien2);
tabPerso.add(Guerrier1);
tabPerso.add(Guerrier2);

for (int i = 0; i < tabPerso.size(); i++) {
    System.out.println(tabPerso.get(i));
}

        Guerrier Guerrier3 = new Guerrier("Batman", 2, false);
        Magicien Magicien3 = new Magicien ("Spiderman", 8, false);
        
        Baton bat3 = new Baton ("z", 5 , 5);
        Baton bat4 = new Baton ("y", 5 , 5);
        Baton bat5 = new Baton ("x", 5 , 5);
        
        Epee Epee4 = new Epee ("a", 5, 6);
        Epee Epee5 = new Epee ("b", 5, 6);
        Epee Epee6 = new Epee ("c", 5, 6);
        
        Guerrier3.ajouterUneArme(Epee4);
        Guerrier3.ajouterUneArme(Epee5);
        Guerrier3.ajouterUneArme(Epee6);
        
        Magicien3.ajouterUneArme(bat3);
        Magicien3.ajouterUneArme(bat4);
        Magicien3.ajouterUneArme(bat5);
        

        Guerrier1.armePortee();
                       
        
    }


    }


