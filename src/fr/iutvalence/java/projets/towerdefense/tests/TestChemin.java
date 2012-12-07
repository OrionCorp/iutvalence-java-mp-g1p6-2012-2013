package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.Chemin;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;
import fr.iutvalence.java.projets.towerdefense.Deplacement;

/**
 * Test de la classe Chemin.
 * Créer un chemin, le remplir avec un point de départ et un tableau de déplacements.
 * Pour finir, l'afficher
 */
public class TestChemin
{
	/**
	 * Procédure de test de la classe Chemin
	 * @param args Arguments passés en paramètres (aucun ici)
	 */
	public static void main(String[] args)
	{
		// On déclare les coordonnées du point de départ
		Coordonnees pointDepart = new Coordonnees(4, 0);
		
		// On déclare le tableau de déplacements
		Deplacement[] parcours = new Deplacement[]
			{ Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE };
		Chemin chemin = new Chemin(pointDepart, parcours);
		
		// On affiche le chemin
		System.out.print(chemin);
	}
}