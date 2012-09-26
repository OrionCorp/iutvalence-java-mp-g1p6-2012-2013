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

	// FIXME écrire un commentaire correct
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

	// FIXME écrire un commentaire correct
	/**
	 * Permet de connaître la position en abscisse
	 * @return entier
	 */
	public int getX()
	{
		return this.x;
	}

	// FIXME écrire un commentaire correct
	/**
	 * Permet de connaître la position en ordonnée
	 * @return entier
	 */
	public int getY()
	{
		return this.y;
	}

	// FIXME écrire un commentaire correct
	public String toString()
	{
		return "("+this.x + ","+this.y+")";
	}

	
	
	
}
