package fr.iutvalence.java.projets.towerdefense.tests;


import fr.iutvalence.java.projets.towerdefense.Chemin;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;
import fr.iutvalence.java.projets.towerdefense.Matrice;


//FIXME détailler (à discuter)
/**
 * Permet de tester la carte de jeu
 *
 */
public class TestMatrice
{

	// FIXME compléter le commentaire
	/** Créer une matrice, la remplir et l'affiche
	 * @param args
	 */
	public static void main(String[] args)
	{
		Coordonnees pointDepart = new Coordonnees(5,0);
		int[] parcours = new int[] {Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE, Chemin.DROITE};
		Chemin chemin = new Chemin(pointDepart, parcours);
		int[][] background = new int[][]{
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE,Matrice.ROUTE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
											{Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE,Matrice.TERRE},
										};
		
		Matrice carte = new Matrice(9, 10, chemin, background);
		
		//Matrice.afficherBackground(carte); // On affiche la matrice
		
		System.out.print(carte);
	}
}
