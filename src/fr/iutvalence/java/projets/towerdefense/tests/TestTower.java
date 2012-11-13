package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.*;

public class TestTower
{

	/**
	 * Créer une tower et test le fonction ToString de la classe Tower
	 * @param args
	 */
	public static void main(String[] args)
	{
		Coordonnees pos = new Coordonnees(6,6);
		Tower tower = new Tower(10,5,5,pos);
		System.out.print(tower);
	}

}
