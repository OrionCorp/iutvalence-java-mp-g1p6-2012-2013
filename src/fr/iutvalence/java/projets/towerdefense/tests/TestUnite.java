package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.*;

/**
 * Test de la classe Unite.
 * Créer une unité et tester la méthode toString
 */
public class TestUnite
{
	/**
	 * Procédure de test de la classe Unite
	 * @param args Arguments passés en paramètres (aucun ici)
	 */
	public static void main(String[] args)
	{
		Coordonnees position = new Coordonnees(4,0);
		Unite toto = new Unite(25,25,position);
		System.out.print(toto);
	}
}