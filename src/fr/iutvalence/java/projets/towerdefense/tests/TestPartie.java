package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.*;

/**
 * 	Créer une partie et tester la méthode toString de la classe Partie
 */
public class TestPartie
{

	/**
	 * @param args
	 * @throws CoordonneesMatriceException 
	 * @throws ListeUniteException 
	 */
	public static void main(String[] args) throws CoordonneesMatriceException, ListeUniteException
	{
		/*
		Coordonnees pointDepart = new Coordonnees(4, 0);
		Deplacement[] parcours = new Deplacement[]
			{ Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE,
					Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE };
		Chemin chemin = new Chemin(pointDepart, parcours);
		Decor[][] background = new Decor[][]
			//@formatter:off
			{
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE,	Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE }, 
			};
		//@formatter:on
		Matrice matriceCourante = new Matrice(9, 10, chemin, background);
		
		Partie partieCourante = new Partie(matriceCourante, 50);
		partieCourante.demarrer();
		
		Tower tower1 = new Tower(5,5,2, new Coordonnees(5,5));
		Unite unite1 = new Unite();
		partieCourante.addUniteListe(unite1);
		
		matriceCourante.placerElement(tower1);
		matriceCourante.placerElement(unite1);
		
		System.out.println("\n");
		System.out.println(matriceCourante);
		
		*/
		
		//TODO : Finir le test
		
		//TEST PROPRE D'UNE VRAIE PATIE
		
		Coordonnees pointDepart = new Coordonnees(4, 0);
		Deplacement[] parcours = new Deplacement[]
			{ Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE,
					Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE };
		Chemin chemin = new Chemin(pointDepart, parcours);
		Decor[][] background = new Decor[][]
			//@formatter:off
			{
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE,	Decor.ROUTE, Decor.ROUTE, Decor.ROUTE, Decor.ROUTE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE },
						{ Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE,	Decor.TERRE, Decor.TERRE, Decor.TERRE, Decor.TERRE }, 
			};
		//@formatter:on
		Matrice matriceCourante = new Matrice(9, 10, chemin, background);
		
		Partie partieTest1 = new Partie(matriceCourante, 50);
		System.out.println(partieTest1.matrice);
		
		partieTest1.addTowerListe(new Tower(5,5,2, new Coordonnees(5,5)));
		partieTest1.addUniteListe(new Unite());

		partieTest1.jouerTour();
		
		System.out.println(partieTest1.matrice);
	}
}
