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
	 * @param x abscisse
	 * @param y ordonnée
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
	 * Renvoie une chaine de caractères correspondant à la postion de l'objet
	 * La chaine est composé de l'abscisse et de l'ordonée (des entiers)
	 *
	 * @return chaine (abscisse, ordonée)
	 */
	public String toString()
	{
		return "("+this.x + ","+this.y+")";
	}
	
	// FIXME redéfinir equals et hashCode
	
	// FIXME écrire (dans une autre classe) une application de test basique
}
