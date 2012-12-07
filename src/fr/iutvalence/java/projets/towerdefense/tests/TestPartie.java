package fr.iutvalence.java.projets.towerdefense.tests;
import fr.iutvalence.java.projets.towerdefense.*;

/**
 *  Test de la classe Partie, qui est notre classe principale
 */
public class TestPartie
{
	/**
	 * Procédure de test de la classe Partie
	 * @param args Arguments passés en paramètres (aucun ici)
	 * @throws CoordonneesMatriceException Gérer une exception au niveau des coordonnées de la matrice
	 * @throws ListeUniteException Gérer une exception au niveau de la liste des unités
	 */
	public static void main(String[] args) throws CoordonneesMatriceException, ListeUniteException
	{
		Coordonnees pointDepart = new Coordonnees(4, 0);
		
		Deplacement[] parcours = new Deplacement[]
			{ Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE,
					Deplacement.DROITE, Deplacement.DROITE, Deplacement.QG };
		
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
		
		Partie partieTest = new Partie(matriceCourante, 50);
		System.out.println("Matrice originale : \n" + partieTest.matrice);
		
		partieTest.addTowerListe(new Tower(5,5,2, new Coordonnees(5,5)));
		partieTest.addTowerListe(new Tower(5,5,2, new Coordonnees(1,6)));
		partieTest.addUniteListe(new Unite());
		
		for(int i = 0; i < 4; i++) //Fait tourner 5 tours de jeu
		{
			partieTest.jouerTour();
			System.out.println("Nombre de tours effectués : " + partieTest.getNbTours());
			System.out.println(partieTest.matrice);
		}
	}
}