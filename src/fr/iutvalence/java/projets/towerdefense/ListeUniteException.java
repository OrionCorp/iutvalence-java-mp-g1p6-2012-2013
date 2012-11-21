package fr.iutvalence.java.projets.towerdefense;

/**
 * Classe permettant de gérer une exception au niveau de la liste des unités
 */
public class ListeUniteException extends Exception
{
	/**
	 * Affiche une erreur
	 */
	public ListeUniteException()
	{
		// TODO Pas d'affichage console ici (à discuter)
		System.out.println("Il n'y a pas d'unité sur laquelle tirer !");
	}
}