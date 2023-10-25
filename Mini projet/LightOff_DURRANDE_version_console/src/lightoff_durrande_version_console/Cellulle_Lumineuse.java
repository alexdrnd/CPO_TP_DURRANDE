/*
 *Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

/**
 *
 * @author Alexandre
 */
public class Cellulle_Lumineuse {
    
    
 private boolean etat ;
 
    /**
     *Initialisons de la cellule la mettant ?teinte.
     */
    public Cellulle_Lumineuse (){
    this.etat = false;     
}

    /**
     *Cet m?thode permet d'inverser l'?tat de la cellule c'est ? dire quand elle est eteinte -> allum? et inverssement allum? -> eteinte.
     */
    public void ActiverCellule(){
   this.etat = !this.etat;
    }

    /**
     *Cet m?thode ?teint la cellule, ne fais rien si la cellule est d?j? eteinte.
     */
    public void EteindreCellule(){
    this.etat = false;   
}

    /**
     *Cet methode verifie si la cellule est eteinte 
     * @return true si la cellule est eteinte et false si elle est allum?.
     */
    public boolean EstEteint() {
    return !this.etat; 
}

    /**
     *Cet m?thode renvoie l'?tat de la cellule.
     * @return true si la cellule est allum? et false si elle est eteinte.
     */
    public boolean GetEtat (){
    return this.etat;
}

    /**
     *Elle renvoie l'etat de la cellule de mani?re lisible sur la console
     * @return X -> ?teinte et O-> allum?
     */
    @Override
public String toString() {
    return this.etat ? "X" : "O";
}
}
  








