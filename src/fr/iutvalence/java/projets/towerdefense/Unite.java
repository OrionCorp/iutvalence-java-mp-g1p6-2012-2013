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
	
	// FIXME remplacer par un attribut de type Coordonnees
	/**
	 * Abscisse de l'unité
	 */
	int posX;
	
	/**
	 * Ordonée de l'unité
	 */
	int posY;
	
	/**
	 * Constructeur par défaut : Créer une unité de niveau 1
	 */
	public Unite() {
		
		this.pointsVie = PV_UNITE_DEFAULT;
		this.pointsAttaque = PA_UNITE_DEFAULT;
		this.posX = 0; 
		this.posY = 0;
	}
}
