package fr.iutvalence.java.projets.towerdefense;

/**
 * Gère les joueurs
 */

public class Joueur {
	
	/* CONSTANTES --------------------------------------- */
	
	/**
	 * Nom par défaut attribué au joueur
	 */
	private final static String NOM_JOUEUR_DEFAUT = "Gordon Freeman";
	
	/* VARIABLES DE JOUEUR ------------------------------ */
	
	/**
	 * Pseudonyme du joueur
	 */
	private String joueur;
	
	/**
	 * High score du joueur
	 * //TODO (à la fin) Penser à gérer le high score à l'aide d'une base de données
	 */
	private int highScore;

	/**
	 * Gère un joueur dont le nom et le High-score sont initialisés par defaut
	 */
	public Joueur()
	{
		super();
		this.joueur = NOM_JOUEUR_DEFAUT;
		this.highScore = 0;
	}
}
