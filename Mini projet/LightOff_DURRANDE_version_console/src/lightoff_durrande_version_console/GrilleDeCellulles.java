/*
 * Alexandre Durrande Mini projet TDA FG2
 */
package lightoff_durrande_version_console;
 import java.util.Random;
/**
 *
 * @author Alexandre
 */
public class GrilleDeCellulles {
    
public Cellulle_Lumineuse[][] matriceCellules;
public int nbLignes;
public int nbColonnes;   
 
    /**
     * Cre? un grille de cellulles lumineuses 
     * @param p_nbLignes
     * @param p_nbColonnes
     */
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
    
    /**
     *Toutes les cellulles deviennent ?teinte.
     */
    public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j].EteindreCellule(); 
        }
    }
}

    /**
     *Allume soit une ligne une colonne ou une diagonale.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3); 

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].EteindreCellule(); 
            }
        }

        switch (choix) {
            case 0 -> {
                int ligne = random.nextInt(nbLignes); 
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].EteindreCellule(); 
                }
            }
            case 1 -> {
                int colonne = random.nextInt(nbColonnes); 
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].EteindreCellule(); 
                }
            }
            case 2 -> {
                int direction = random.nextBoolean() ? 1 : -1;
                int ligneDiagonale = random.nextInt(nbLignes); 
                for (int i = 0; i < nbLignes && ligneDiagonale >= 0 && ligneDiagonale < nbLignes; i++) {
                    matriceCellules[ligneDiagonale][i].EteindreCellule(); 
                    ligneDiagonale += direction;
                }
            }
            default -> {
            }
                
        }
    }

    /**
     *Genere une grille de cellulles, ?teint et alllume au fur et ? mesure des tours les lignes colonnes diagonales permet de s'assurer que qu'une grille puisse ?tre r?alisable
     * @param nbTours
     */
public void melangerMatriceAleatoirement(int nbTours) {
    Random random = new Random();

    for (int tour = 0; tour < nbTours; tour++) {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                int choix = random.nextInt(2);
                if (choix == 0) {
                    matriceCellules[i][j].EteindreCellule();
                } else {
                    matriceCellules[i][j].ActiverCellule();
                }
            }
        }
    }
}

    

    /**
     *allume toutes les cellulles d'une ligne
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].ActiverCellule();
        }
    }

    /**
     *allume toutes les cellulles d'une colonne
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].ActiverCellule();
        }
    }

    /**
     *allume toutes les cellulles d'une diagonales descendantes.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][i].ActiverCellule();
        }
    }

    /**
     *allume toutes les cellulles d'une diagonales montante.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].ActiverCellule();
        }
    }

    /**
     *Verifie si l'etat des cellules
     * @return true quand toutes les cellulles sont ?teintes
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].GetEtat()) {
                } else { 
                    return false;
                }
            }
        }
        return true; 
    }
    
@Override
public String toString() {
    StringBuilder builder = new StringBuilder();

    // Largeur de chaque colonne pour l'alignement
    int colWidth = 4;

    // En-t?te des colonnes
    builder.append("       |");
    for (int j = 0; j < nbColonnes; j++) {
        builder.append(String.format("%" + colWidth + "d |", j));
    }
    builder.append("\n");

    // Ligne de s?paration
    for (int j = 0; j <= nbColonnes; j++) {
        builder.append(String.format("%" + (colWidth + 1) + "s", "-----"));
    }
    builder.append("\n");

    // Affichage de la matrice
    for (int i = 0; i < nbLignes; i++) {
        builder.append(String.format("  %" + colWidth + "d |", i));
        for (int j = 0; j < nbColonnes; j++) {
            builder.append(String.format(" %" + (colWidth - 1) + "s |", (matriceCellules[i][j].GetEtat() ? "X" : "O")));
        }
        builder.append("\n");

        // Ligne de s?paration
        for (int j = 0; j <= nbColonnes; j++) {
            builder.append(String.format("%" + (colWidth + 1) + "s", "------"));
        }
        builder.append("\n");
    }

    return builder.toString();
}


}

    
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

