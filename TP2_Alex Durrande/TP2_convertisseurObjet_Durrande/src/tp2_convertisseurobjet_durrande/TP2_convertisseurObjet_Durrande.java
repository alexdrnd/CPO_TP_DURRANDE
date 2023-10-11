/*
Alexandre Durrande
FG2 TDA
TP2 
18/09/2023
 */
package tp2_convertisseurobjet_durrande;

/**
 *
 * @author Alexandre
 */
public class TP2_convertisseurObjet_Durrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Convertisseur convertisseur = new Convertisseur ();    
    convertisseur.CelciusVersKelvin(3.0); 
    convertisseur.CelciusVersKelvin(55.0); 
    
    Convertisseur convertisseur1 = new Convertisseur ();
    convertisseur1.FarenheitVersKelvin(12);
    convertisseur1.FarenheitVersCelcius(1.2);
    
        
    System.out.println("Convertisseur 1 : " + convertisseur);
    System.out.println("Convertisseur 2 : " + convertisseur1);
        
        // TODO code application logic here
    }
    
}
