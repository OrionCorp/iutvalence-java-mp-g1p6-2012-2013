package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de manipuler toutes les tours du jeu
 */

public class Tower
{	
	/**
	 * Position de la tower
	 */
	private Coordonnees pos;
	
	/**
	 * Points d'attaque de la tower
	 */
	private final int pointsAttaque;
	
	/**
	 * Portée d'attaque de la tower
	 */
	private final int porteeAttaque;
	
	/**
	 * Créer une tower avec des caractéristiques données
	 * @param pointsAttaque
	 * @param porteeAttaque
	 * @param pos
	 */
	public Tower(int pointsAttaque, int porteeAttaque, Coordonnees pos)
	{
		this.pointsAttaque = pointsAttaque;
		this.porteeAttaque = porteeAttaque;
		this.pos = pos;
	}

	public String toString()
	{
		return "Tower -- Position = " + this.pos + ", points d'attaque = " + this.pointsAttaque + ", Portée de l'attaque = " + this.porteeAttaque;
	}

	// FIXME (FIXED) attributs ?

	// FIXME (FIXED) constructeurs ?

	// FIXME (FIXED) redéfinir toString
}
