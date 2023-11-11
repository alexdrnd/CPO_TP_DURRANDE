package lightoff_durrande_version_console;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class FenetreVictoire extends JFrame {
 private int nbCoups;
     
    public FenetreVictoire(boolean victoire, int nbCoups) {
        this.nbCoups = nbCoups;
        initCustomComponents(victoire);
    }

    private void initCustomComponents(boolean victoire) {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel labelVictoire = new JLabel();
        labelVictoire.setFont(new Font("Segoe UI", Font.BOLD, 24));
        labelVictoire.setForeground(new Color(0, 102, 0));
        labelVictoire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        if (victoire) {
            labelVictoire.setText("Felicitations !");
        } else {
            labelVictoire.setText("Dommage !");
        }

        getContentPane().add(labelVictoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        JLabel labelCoups = new JLabel();
        labelCoups.setFont(new Font("Arial", Font.PLAIN, 14));
        labelCoups.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCoups.setText("Nombre de coups : " + nbCoups);
        getContentPane().add(labelCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 30));

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new FenetreVictoire(true, 10).setVisible(true);
        });
    }
}
