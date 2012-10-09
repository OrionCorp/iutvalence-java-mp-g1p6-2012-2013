package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les coordonnées
 *
 */
public class Coordonnees
{
	/**
	 * Abscisse
	 */
	private final int x;
	
	/**
	 * Ordonnée
	 */
	private final int y;

	/**
	 * Permet de définir un objet "Coordonnees" composé de deux entiers donnée en paramètres
	 *
	 * @param x : entier (abscisse)
	 * @param y : entier (ordonnée)
	 */
	public Coordonnees(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Renvoi un entier correspondant à l'abscisse de l'objet
	 *
	 * @return entier (abscisse)
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Renvoi un entier correspondant à ll'ordonée de l'objet
	 *
	 * @return entier (ordonnée)
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * Renvoi une chaine de caractères correspondant à la postion de l'objet
	 * La chaine est composé de l'abscisse et de l'ordonée (des entiers)
	 *
	 * @return chaine (abscisse, ordonée)
	 */
	public String toString()
	{
		return "("+this.x + ","+this.y+")";
	}
}
