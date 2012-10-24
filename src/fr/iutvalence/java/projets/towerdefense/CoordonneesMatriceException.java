package fr.iutvalence.java.projets.towerdefense;

/**
 * Classe permettant de gérer une exception au niveau des coordonnées de la matrice
 */
public class CoordonneesMatriceException extends Exception
{
	/**
	 * Affiche une erreur
	 */
	public CoordonneesMatriceException()
	{
		// Pas d'affichage console ici (à discuter)
		System.out.println("Les coordonnées fournies sont en dehors de la carte !");
	}

}
