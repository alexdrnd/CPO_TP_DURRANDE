/*
 * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

/**
 *
 * @author Alexandre
 */
public class LightOff_DURRANDE_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    Cellulle_Lumineuse Case1 = new Cellulle_Lumineuse();
    Cellulle_Lumineuse Case2 = new Cellulle_Lumineuse();
    
    Case1.GetEtat();
    Case2.GetEtat();
    System.out.println (Case1.GetEtat());
    System.out.println (Case2.GetEtat());
    
    Case1.ActiverCellule();
    
    Case1.toString();
    Case2.toString();
    
System.out.println (Case1.toString());
System.out.println (Case2.toString());
        
    



GrilleDeCellulles Partie1 = new GrilleDeCellulles (5, 5);
System.out.println (Partie1);







    }
    
}
