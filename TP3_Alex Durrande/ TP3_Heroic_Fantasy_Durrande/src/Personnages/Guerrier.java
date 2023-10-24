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
public class Guerrier extends Personnages{
    
    boolean cheval;    
    
    public Guerrier (String n, int pv, boolean a){
        super(n , pv);
        cheval=a;
        
    }
     @Override
public String toString() {
String chaine_a_retourner;
if (cheval == true){
chaine_a_retourner = ("Le Guerrier "+nom+ " a "+niveauDeVie+ "point de vie et est à cheval et mani "+armeEnMain);
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le Guerrier "+nom+ " a "+niveauDeVie+ "point de vie et est à pieds et mani "+armeEnMain);

   return chaine_a_retourner; 
}
}



    
    

}