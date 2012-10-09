package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de tester la carte de jeu
 *
 */
public class TestMatrice
{

	/** Créer une matrice, la remplire et l'affiche
	 * @param args
	 */
	public static void main(String[] args)
	{
		Coordonnees pointDepart = new Coordonnees(5,0);
		int[] parcours = new int[] {Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE};
		Chemin chemin = new Chemin(pointDepart, parcours);
		int[][] background = new int[][]{
											{11,11,11,11,11,11,11,11,11,11},
											{11,11,11,11,11,11,11,11,11,11},
											{11,11,11,11,11,11,11,11,11,11},
											{11,11,11,11,11,11,11,11,11,11},
											{13,13,13,13,13,13,13,13,13,13},
											{11,11,11,11,11,11,11,11,11,11},
											{11,11,11,11,11,11,11,11,11,11},
											{11,11,11,11,11,11,11,11,11,11},
											{11,11,11,11,11,11,11,11,11,11},
										};
		
		Matrice carte = new Matrice(10, 9, chemin, background);
		
		Matrice.afficherBackgroundMatrice(carte); // On affiche la matrice
	}
}
