/*
 *  * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Alexandre
 */


public class CellullesGraphiques extends JButton {

    Cellulle_Lumineuse celluleAssociee;

    public CellullesGraphiques(Cellulle_Lumineuse uneCellule) {
        this.celluleAssociee = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setContentAreaFilled(false);
        setBorderPainted(false);

        //on attribut l'image 
        if (celluleAssociee.GetEtat()) {
            G.setColor(Color.yellow); //on attribut la couleur du bouton
        } else {
            G.setColor(Color.red);
        }
        G.fillOval(0, 0, 50, 50);
        //G.draw3DRect(0, 0, 20, 20, true);
    }

}