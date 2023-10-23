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
public class Epee extends Arme{
    int finesse;
    public Epee(String name, int niveauAttaque, int finesse) {
        this.name = name;
        this.finesse = finesse;
        this.niveauAttaque = niveauAttaque;
    }
}