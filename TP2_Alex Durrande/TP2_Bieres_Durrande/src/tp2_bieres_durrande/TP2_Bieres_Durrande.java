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
public class TP2_Bieres_Durrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson", false) ;

        
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
                
     BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6 
,"Abbaye de Leffe", true) ;
        
        deuxBiere.lireEtiquette();
        deuxBiere.Décapsuler();
        
       BouteilleBiere troisBiere = new BouteilleBiere("8.6", 8.6 
,"haaha", false) ;
        
        troisBiere.lireEtiquette(); 
        troisBiere.Décapsuler();
        
        BouteilleBiere quatreBiere = new BouteilleBiere("ahhaha", 4.0 
,"jszdnjzaefnaezf", true) ;
        
        quatreBiere.lireEtiquette(); 
        quatreBiere.Décapsuler();
        
        BouteilleBiere cinqBiere = new BouteilleBiere("eheheeh", 9.0 
,"azerty", true ) ;
        
        cinqBiere.lireEtiquette(); 
        cinqBiere.Décapsuler();
        
        System.out.println(uneBiere) ;
        // TODO code application logic here
    }
    
}
