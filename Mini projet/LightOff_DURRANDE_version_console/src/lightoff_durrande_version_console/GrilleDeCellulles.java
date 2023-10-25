/*
 * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

/**
 *
 * @author Alexandre
 */
public class GrilleDeCellulles {
    
public Cellulle_Lumineuse[][] matriceCellules;
public int nbLignes;
public int nbColonnes;   
 

    public GrilleDeCellulles(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;

        
        matriceCellules = new Cellulle_Lumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new Cellulle_Lumineuse();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
