package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les untiés.
 * Une unité est caractérisée par des points de vie, d'attaque, et une position sur la carte 
 */
public class Unite
{

	/* VARIABLES UNITE DEFAULT ------------------------------ */

	/**
	 * Points de vie par defaut de l'unité de niveau 1
	 */
	private final static int PV_UNITE_DEFAULT = 25;

	/**
	 * Points d'attaque par defaut de l'unité de niveau 1
	 */
	private final static int PA_UNITE_DEFAULT = 10;

	/**
	 * Position initiale des unités spawnant
	 */
	private final static Coordonnees POSITION_UNITE = new Coordonnees(0, 0);

	/* VARIABLES UNITE ------------------------------ */

	/**
	 * Points d'attaque de l'unité
	 */
	private int pointsAttaque;

	/**
	 * Points de vie de l'unité
	 */
	private int pointsVie;

	/**
	 * Emplacement de l'unité, représenté par un objet "Coordonnees"
	 */
	private Coordonnees pos;

	/**
	 * Créer une unité de niveau 1,en utilisant les valeurs par défaut 
	 */
	public Unite()
	{

		super();
		this.pointsVie = PV_UNITE_DEFAULT;
		this.pointsAttaque = PA_UNITE_DEFAULT;
		this.pos = POSITION_UNITE;
	}
	
	
	/**
	 * Créer une unité dont on définit les différentes caractéristiques
	 * @param pv Points de vie de l'unité
	 * @param pa Points d'attaque de l'unité
	 * @param position Position de l'unité
	 */
	public Unite(int pv, int pa, Coordonnees position)
	{
		super();
		this.pointsVie = pv;
		this.pointsAttaque = pa;
		this.pos = position;
	}

	/**
	 * Obtenir les points d'attaque de l'unité
	 * @return les points d'attaque de l'unité
	 */
	public int getPointsAttaque()
	{
		return this.pointsAttaque;
	}

	/**
	 * Obtenir les points de vie de l'unité
	 * @return les points de vie de l'unité
	 */
	public int getPointsVie()
	{
		return this.pointsVie;
	}

	/**
	 * Obtenir les coordonnées de l'unité
	 * @return les coordonnées de l'unité
	 */
	public Coordonnees getPos()
	{
		return this.pos;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Unité -- Points d'Attaque = " + this.pointsAttaque + ", Points de Vie = " + this.pointsVie + ", Position = " + this.pos;
	}
	
}
