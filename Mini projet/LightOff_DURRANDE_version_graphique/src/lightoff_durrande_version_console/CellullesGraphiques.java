/*
 *  * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Alexandre
 */


public class CellullesGraphiques extends JButton {
 int largeur; // largeur en pixel de la cellule
 int hauteur; // hauteur en pixel de la cellule
 Cellulle_Lumineuse celluleLumineuseAssociee; 
 // constructeur (appel? depuis FenetrePrincipale)
 public CellullesGraphiques(Cellulle_Lumineuse celluleLumineuseAssociee, int largeur, 
int hauteur) {
 this.largeur = largeur;
 this.hauteur = hauteur;
 this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }
 // Methode g?rant le dessin de la cellule 
 @Override
 protected void paintComponent(Graphics g) {
 super.paintComponent(g); 
 this.setText(celluleLumineuseAssociee.toString());
 }
}
