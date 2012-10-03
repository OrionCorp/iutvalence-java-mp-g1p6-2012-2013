package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de tester la carte de jeu
 *
 * @author Teddy Gustiaux & Alister Desvergnes.
 */
public class TestMatrice
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] chemin = new int[] {	Chemin.DROITE,
									Chemin.DROITE,
									Chemin.DROITE, 
									Chemin.DROITE,
									Chemin.DROITE,
									Chemin.DROITE,
									Chemin.DROITE,
									Chemin.DROITE,
									Chemin.DROITE,
									Chemin.DROITE };
		System.out.println(new Matrice(10,10, new Chemin(new Coordonnees(5,0),chemin)));
	}

}
