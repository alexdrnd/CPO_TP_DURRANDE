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
import java.util.Vector;


/**
 *
 * @author Alexandre
 */
public class TP3_Heroic_Fantasy_Durrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arme Epee1 = new Epee("Excalibur", 7, 5);
        Arme Epee2 = new Epee("Durandal", 4, 7);
        Arme bat1 = new Baton("Chêne", 4, 5);
        Arme bat2 = new Baton("Charme", 5, 6);

        Vector tabArmes = new Vector();
        tabArmes.add(Epee1);
        tabArmes.add(Epee2);
        tabArmes.add(bat1);
        tabArmes.add(bat2);
        for (int i = 0; i < tabArmes.size(); i++) {
            System.out.println(tabArmes.elementAt(i));
        }

        Personnages Magicien1 = new Magicien("Gandalf", 65, true);
        Personnages Magicien2 = new Magicien("Garcimore", 44, false);
        Personnages Guerrier1 = new Guerrier("Conan", 78, false);
        Personnages Guerrier2 = new Guerrier("Lannister", 45, true);
        Vector tabPerso = new Vector();
        tabPerso.add(Magicien1);
        tabPerso.add(Magicien2);
        tabPerso.add(Guerrier1);
        tabPerso.add(Guerrier2);
        for (int i = 0; i < tabPerso.size(); i++) {
            System.out.println(tabPerso.elementAt(i));
        }

    }

}
