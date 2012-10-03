package fr.iutvalence.java.projets.towerdefense;

/**
 * Gère les unités
 *
 * @author Teddy Gustiaux & Alister Desvergnes.
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
	Coordonnees pos;
	
	/**
	 * Constructeur par défaut : Créer une unité de niveau 1
	 */
	public Unite() {
		
		this.pointsVie = PV_UNITE_DEFAULT;
		this.pointsAttaque = PA_UNITE_DEFAULT;
		this.pos = POSITION_UNITE;
	}
}
