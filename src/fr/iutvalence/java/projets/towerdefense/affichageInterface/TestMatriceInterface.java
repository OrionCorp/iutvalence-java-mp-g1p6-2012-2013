package fr.iutvalence.java.projets.towerdefense.affichageInterface;

import fr.iutvalence.java.projets.towerdefense.Chemin;
import fr.iutvalence.java.projets.towerdefense.Coordonnees;
import fr.iutvalence.java.projets.towerdefense.CoordonneesMatriceException;
import fr.iutvalence.java.projets.towerdefense.Decor;
import fr.iutvalence.java.projets.towerdefense.Deplacement;

/**
 * Créer une matrice, la remplir et l'afficher à des fins de test + Test des méthodes
 */
public class TestMatriceInterface
{
	/**
	 * Création d'une matrice avec un décor et un chemin, puis affichage de celle-ci afin de vérifier que tout est
	 * fonctionnel L'affichage final devra être proche de celui-ci :
	 * <table>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>13 13 13 13 13 13 13 13 13 13</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * <tr>
	 * <td>11 11 11 11 11 11 11 11 11 11</td>
	 * </tr>
	 * </table>
	 * On teste aussi la méthode getBackgroundAt
	 * 
	 * @param args
	 *            paramètre par défaut de main
	 */
	public static void main(String[] args)
	{
		Coordonnees pointDepart = new Coordonnees(4, 0);
		Deplacement[] parcours = new Deplacement[]
			{ Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE,
					Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE, Deplacement.DROITE };
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
		Affichage a = new Affichage();
		MatriceInterface carte = new MatriceInterface(9, 10, chemin, background);

		carte.Afficher();
	}
}
