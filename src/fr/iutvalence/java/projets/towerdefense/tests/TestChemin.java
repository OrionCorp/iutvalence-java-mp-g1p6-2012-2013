package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.Chemin;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;
import fr.iutvalence.java.projets.towerdefense.Deplacement;

/**
 * Créer un chemin, le rempli avec un point de départ et un tableau de depacements. Affiche le chemin
 */
public class TestChemin
{
	public static void main(String[] args)
	{
	Coordonnees pointDepart = new Coordonnees(4, 0);
	Deplacement[] parcours = new Deplacement[]
		{ Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE };
	Chemin chemin = new Chemin(pointDepart, parcours);
	
	System.out.print(chemin);
	}
}