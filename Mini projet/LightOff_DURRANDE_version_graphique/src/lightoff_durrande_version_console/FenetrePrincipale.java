/*
 *  * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
/**
 *
 * @author Alexandre
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeCellulles grille;
    int nbCoups;
    int i;

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    public FenetrePrincipale() {
        initComponents();

        int nbLignes = 6;
        int nbColonnes =6;
        this.grille = new GrilleDeCellulles(nbLignes, nbColonnes);

        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CellullesGraphiques bouton_cellule = new CellullesGraphiques(grille.matriceCellules[i][j]);
                PanneauGrille.add(bouton_cellule);
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70,
                nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    jouerCoup();
                    repaint();
                    verifierVictoire();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }

        PaneauxBoutonsHorizontal.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PaneauxBoutonsHorizontal,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();

        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    jouerCoup();
                    repaint();
                    verifierVictoire(); 
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PaneauxBoutonsHorizontal.add(bouton_colonne);

        }

        Diago1.setLayout(new GridLayout(1, 1));
        getContentPane().add(Diago1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        JButton bouton_diago1 = new JButton();
        ActionListener ecouteurClick = new ActionListener() {
            final int j = i;

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendante();
                jouerCoup();
                repaint();
                verifierVictoire();
            }
        };
        bouton_diago1.addActionListener(ecouteurClick);
        Diago1.add(bouton_diago1);
    
        Diago2.setLayout(new GridLayout(1, 1));
        getContentPane().add(Diago2,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50 * (nbLignes + 1), 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        JButton bouton_diago2 = new JButton();
        ActionListener ecouteurClick1 = new ActionListener() {
            final int j = i;

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontante();
                jouerCoup();
                repaint();
                verifierVictoire();
                      
            }
        };
        bouton_diago2.addActionListener(ecouteurClick1);
        Diago2.add(bouton_diago2);
        
        customizeButtons(Diago1);
        customizeButtons(PaneauxBoutonsHorizontal);
        customizeButtons(Diago2);
       customizeButtons(PanneauBoutonsVerticaux);


        initialiserPartie();
    
    }
 
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PaneauxBoutonsHorizontal = new javax.swing.JPanel();
        Diago1 = new javax.swing.JPanel();
        Diago2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 51));
        PanneauGrille.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 410, 400));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(0, 0, 255));
        PanneauBoutonsVerticaux.setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 30, 400));

        PaneauxBoutonsHorizontal.setBackground(new java.awt.Color(51, 51, 255));
        PaneauxBoutonsHorizontal.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(PaneauxBoutonsHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 410, 40));

        Diago1.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(Diago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 50));

        Diago2.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(Diago2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

   
private void verifierVictoire() {
        if (grille.cellulesToutesEteintes()) {
            afficherFenetreVictoire();
            initialiserPartie();
        }
    }
  private void jouerCoup() {
     
        nbCoups++;
        verifierVictoire();
    }
    private void afficherFenetreVictoire() {
        FenetreVictoire fenetreVictoire = new FenetreVictoire(true, nbCoups);
        fenetreVictoire.setVisible(true);
    }

    private void customizeButtons(JPanel button) {
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Diago1;
    private javax.swing.JPanel Diago2;
    private javax.swing.JPanel PaneauxBoutonsHorizontal;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables

  

}
