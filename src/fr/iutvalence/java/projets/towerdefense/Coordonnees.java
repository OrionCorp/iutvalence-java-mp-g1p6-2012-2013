package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les coordonnées
 */
public class Coordonnees
{
	/**
	 * Abscisse
	 */
	private int x;

	/**
	 * Ordonnée
	 */
	private int y;

	/**
	 * Permet de définir un objet "Coordonnees" composé de deux entiers donnée en paramètres
	 * 
	 * @param x Abscisse de la coordonnée
	 * @param y Ordonnée de la coordonnée
	 */
	public Coordonnees(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Renvoie l'abscisse
	 * 
	 * @return L'abscisse
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Renvoie l'ordonée
	 * 
	 * @return L'ordonnée
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * Renvoie une chaine de caractères correspondant à la position de l'objet La chaine est composé de l'abscisse et de
	 * l'ordonnée (des entiers)
	 * 
	 * @return (<i>abscisse</i>, <i>ordonnée</i>)
	 */
	public String toString()
	{
		return "(" + this.x + "," + this.y + ")";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x;
		result = prime * result + this.y;
		return result;
	}

	
	/**
	 *
	 * On considère que deux coordonnées sont égales si les abscisses et les ordonnées de ces
	 * coordonnées sont les mêmes
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordonnees other = (Coordonnees) obj;
		if (this.x != other.x)
			return false;
		if (this.y != other.y)
			return false;
		return true;
	}
}
