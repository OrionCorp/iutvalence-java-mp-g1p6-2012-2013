package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les coordonnées
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
	 * @param x
	 *            abscisse
	 * @param y
	 *            ordonnée
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
	 * @return l'abscisse
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Renvoie l'ordonée
	 * 
	 * @return l'ordonnée
	 */
	public int getY()
	{
		return this.y;
	}

	// FIXME corriger le commentaire (à discuter)
	/**
	 * Renvoie une chaine de caractères correspondant à la postion de l'objet La chaine est composé de l'abscisse et de
	 * l'ordonée (des entiers)
	 * 
	 * @return chaine (abscisse, ordonée)
	 */
	public String toString()
	{
		return "(" + this.x + "," + this.y + ")";
	}

	// FIXME (FIXED) redéfinir equals et hashCode

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
	 * Permet de savoir si deux coordonnées sont égales ou non
	 * 
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

	// FIXME écrire (dans une autre classe) une application de test basique
}
