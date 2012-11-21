package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les untiés.
 * Une unité est caractérisée par des points de vie, d'attaque, et une position sur la carte 
 */
public class Unite extends fr.iutvalence.java.projets.towerdefense.Element
{

	/* VARIABLES UNITE DEFAULT ------------------------------ */

	/**
	 * Points de vie par defaut de l'unité de niveau 1
	 */
	private final static int PV_UNITE_DEFAULT = 25;

	/**
	 * Changer les points de vie de l'unité
	 * @param pointsVie
	 */
	public void setPointsVie(int pointsVie)
	{
		this.pointsVie = pointsVie;
	}

	/**
	 * Points d'attaque par defaut de l'unité de niveau 1
	 */
	private final static int PA_UNITE_DEFAULT = 10;

	/**
	 * Position initiale des unités spawnant
	 */
	private final static Coordonnees POSITION_UNITE = new Coordonnees(4, 0);

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
	 * Créer une unité de niveau 1,en utilisant les valeurs par défaut 
	 */
	public Unite()
	{

		super(POSITION_UNITE, Type.UNITE);
		this.pointsVie = PV_UNITE_DEFAULT;
		this.pointsAttaque = PA_UNITE_DEFAULT;
	}
	
	
	/**
	 * Créer une unité dont on définit les différentes caractéristiques
	 * @param pv Points de vie de l'unité
	 * @param pa Points d'attaque de l'unité
	 * @param position Position de l'unité
	 */
	public Unite(int pv, int pa, Coordonnees pos)
	{
		super(pos, Type.UNITE);
		this.pointsVie = pv;
		this.pointsAttaque = pa;
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
	 * Enlève l'unité de la matrice et du tableau d'unité si elle est morte
	 * @return True si l'unité est morte, false sinon
	 */
	public boolean mortOuVif(){
		//Supprime l'unité si elle est morte, ne fait rien si elle est toujours en vie
		if (this.pointsVie <= 0){
			//On enlève l'unité de la matrice et du tabUnite
			
			return true;
		}
		else
			return false;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Unité -- Points d'Attaque = " + this.pointsAttaque + ", Points de Vie = " + this.pointsVie + ", Position = " + this.getPos();
	}
	
	
	/**
	 * Deplacer une unité sur le chemin de la matrice
	 */
	public void deplacerUnite(){
		 
	}
}
