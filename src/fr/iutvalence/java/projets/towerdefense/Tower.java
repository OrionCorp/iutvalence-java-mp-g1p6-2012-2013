package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de manipuler toutes les tours du jeu
 */

public class Tower extends fr.iutvalence.java.projets.towerdefense.Element
{
	
	/**
	 * Points d'attaque de la tower
	 */
	private final int pointsAttaque;
	
	/**
	 * Portée d'attaque de la tower
	 */
	private final int porteeAttaque;
	
	/**
	 * Temps de rechargement de la tower
	 */
	private final int tempsRechargement;
	
	
	/**
	 * Créer une tower avec des caractéristiques données
	 * @param pointsAttaque Points d'attaque de la tower
	 * @param porteeAttaque Portée de l'attaque de la tower
	 * @param pos Position de la tower
	 */
	public Tower(int pointsAttaque, int porteeAttaque,int tempsRechargement, Coordonnees pos)
	{
		super(pos, Type.TOWER);
		this.pointsAttaque = pointsAttaque;
		this.porteeAttaque = porteeAttaque;
		this.tempsRechargement = tempsRechargement;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Tower -- Position = " + this.getPos() + ", points d'attaque = " + this.pointsAttaque + ", Portée de l'attaque = " + this.porteeAttaque;
	}
}
