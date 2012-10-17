package fr.iutvalence.java.projets.towerdefense;

// FIXME détailler un peu
/**
 * Gère les unités
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
	private final static Coordonnees POSITION_UNITE = new Coordonnees(0,0);
	
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
	// FIXME viibilité ?
	Coordonnees pos;
	
	// FIXME détailler
	/**
	 * Constructeur par défaut : Créer une unité de niveau 1
	 */
	public Unite() {
		
		super();
		this.pointsVie = PV_UNITE_DEFAULT;
		this.pointsAttaque = PA_UNITE_DEFAULT;
		this.pos = POSITION_UNITE;
	}
	
	// FIXME accesseurs sur les attributs ?
	
	// FIXME redéfinir toString
}
