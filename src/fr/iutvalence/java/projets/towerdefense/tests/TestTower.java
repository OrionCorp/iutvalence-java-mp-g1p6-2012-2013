package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.*;

/**
* Test de la classe Tower.
* Créer une tower et tester la méthode toString de la classe Tower
*/
public class TestTower
{
	/**
	 * Procédure de test de la classe Tower
	 * @param args Arguments passés en paramètres (aucun ici)
	 */
	public static void main(String[] args)
	{
		Coordonnees pos = new Coordonnees(6,6);
		Tower tower = new Tower(10,5,5,pos);
		System.out.print(tower);
	}
}