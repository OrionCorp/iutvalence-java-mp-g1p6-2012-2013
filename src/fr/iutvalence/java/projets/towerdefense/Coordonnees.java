package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les coordonnées
 * @author Teddy Gustiaux & Alister Desvergnes.
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
	 * Permet de définir un objet Coordonnées
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
	 * Permet de connaître la position en abscisse
	 * @return entier
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Permet de connaître la position en ordonnée
	 * @return entier
	 */
	public int getY()
	{
		return this.y;
	}

	public String toString()
	{
		return "("+this.x + ","+this.y+")";
	}

	
}
