package fr.iutvalence.java.projets.towerdefense.tests;


import fr.iutvalence.java.projets.towerdefense.Chemin;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;
import fr.iutvalence.java.projets.towerdefense.CoordonneesMatriceException;
import fr.iutvalence.java.projets.towerdefense.Matrice;


//FIXME (FIXED) détailler (à discuter)
/**
 * Créer une matrice, la remplir et l'afficher à des fins de test + Test des méthodes
 */
public class TestMatrice
{

	// FIXME (FIXED) compléter le commentaire
	/** Création d'une matrice avec un décor et un chemin, puis affichage de celle-ci afin de vérifier que tout est fonctionnel
	 * L'affichage final devra être proche de celui-ci :
	 *	11 11 11 11 11 11 11 11 11 11 
		11 11 11 11 11 11 11 11 11 11 
		11 11 11 11 11 11 11 11 11 11 
		11 11 11 11 11 11 11 11 11 11 
		13 13 13 13 13 13 13 13 13 13 
		11 11 11 11 11 11 11 11 11 11 
		11 11 11 11 11 11 11 11 11 11 
		11 11 11 11 11 11 11 11 11 11 
		11 11 11 11 11 11 11 11 11 11
	 * On teste aussi la méthode getBackgroundAt
	 * @param args
	 * @throws CoordonneesMatriceException 
	 */
	public static void main(String[] args) throws CoordonneesMatriceException
	{
		Coordonnees pointDepart = new Coordonnees(4,0);
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
		
		System.out.print(carte);
		
		// On teste la méthode getBackgroundAt()
		// Coordonnees pointErreur = new Coordonnees(42,42); -> Soulève l'exception
		int testGetBackAt = carte.getBackgroundAt(pointDepart);
		System.out.print("\nCoordonnées du point : " + testGetBackAt);
	}
}
