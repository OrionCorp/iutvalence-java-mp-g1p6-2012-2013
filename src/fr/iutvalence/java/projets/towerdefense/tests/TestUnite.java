package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.*;

/**
 * Créer une unité et test la fonction ToString de la classe Unite
 */
public class TestUnite
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Coordonnees position = new Coordonnees(4,0);
		Unite toto = new Unite(25,25,position);
		System.out.print(toto);
	}

}
