package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;

/**
 * Permet de tester les coordonnées
 * Le test correspond à créer un objet Coordonnées, et à l'afficher
 */
public class TestCoordonnees
{
	public static void main(String[] args)
	{
		Coordonnees c = new Coordonnees(3, 2);
		System.out.println(c);
	}
}