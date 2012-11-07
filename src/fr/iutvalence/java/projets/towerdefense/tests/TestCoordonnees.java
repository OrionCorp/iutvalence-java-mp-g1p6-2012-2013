package fr.iutvalence.java.projets.towerdefense.tests;

import fr.iutvalence.java.projets.towerdefense.Coordonnees;

/**
 * Le test correspond à créer un objet Coordonnées, et à l'afficher
 * 
 * Permet de tester les coordonnées
 */
public class TestCoordonnees
{
	/**
	 * Création d'un objet Coordonnées que l'on va afficher à des fins de test
	 * 
	 * @param args aucun
	 */
	public static void main(String[] args)
	{
		Coordonnees c = new Coordonnees(3, 2);
		System.out.println(c);
	}
}
