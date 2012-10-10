package fr.iutvalence.java.projets.towerdefense;

// FIXME détailler un peu le commentaire
/**
 * Permet la definition d'une partie.
 */
public class Partie
{
	/* CONSTANTES --------------------------------------- */
	
	/**
	 * Nombre maximal de tours de jeu
	 */
	public final static int NBMAX_TOURS_JEU = 10;
	
	/**
	 * Nombre maximal d'unités sur la carte
	 */
	public final static int NBMAX_UNITS = 50;
	
	/**
	 * Nombre maximal de towers sur la carte
	 */
	public final static int NBMAX_TOWERS = 25;
	
	/* VARIABLES DE PARTIE ------------------------------ */
	
	/**
	 * Nombre de tours de la partie
	 */	
	private int nbTours;
	
	/**
	 * Nombre d'unités présentes sur la matrice
	 */	
	private int nbUnites;
	
	/**
	 * Nombre de towers présentes sur la matrice
	 */	
	private int nbTowers;

	// FIXME (FIXED) initialisation des attributs dans le constructeur
	/**
	 * Score du joueur
	 */
	private int score;
	
	/**
	 * Gère une partie dont les nombres de tours, tower, score et unités sont initialisés à 0
	 */
	public Partie()
	{
		super();
		this.nbTours = 0;
		this.nbTowers = 0;
		this.nbUnites = 0;
		this.score = 0;
	}
	
	// FIXME autres attributs ?
	
	// FIXME (Half FIXED) constructeurs, méthodes ?
}

