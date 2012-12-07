package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;

/**
 * Test de la classe Coordonnées
 * Créer un objet Coordonnées, et l'afficher
 */
public class TestCoordonnees
{
	/**
	 * Procédure de test de la classe Coordonnées
	 * @param args Arguments passés en paramètres (aucun ici)
	 */
	public static void main(String[] args)
	{
		Coordonnees c = new Coordonnees(3, 2);
		System.out.println(c);
	}
}