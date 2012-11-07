package fr.iutvalence.java.projets.towerdefense;

/**
 * Gère les joueurs
 */

public class Joueur
{

	/* CONSTANTES --------------------------------------- */

	/**
	 * Nom par défaut attribué au joueur
	 */
	private final static String NOM_JOUEUR_DEFAUT = "Joueur";

	/* VARIABLES DE JOUEUR ------------------------------ */

	/**
	 * Pseudonyme du joueur
	 */
	private final String nomJoueur; 

	/**
	 * High score du joueur //TODO (à la fin) Penser à gérer le high score à l'aide d'une base de données
	 */
	private int highScore;

	/**
	 * Gère un joueur dont le nom et le High-score sont initialisés par defaut
	 */
	public Joueur()
	{
		super();
		this.nomJoueur = NOM_JOUEUR_DEFAUT;
		this.highScore = 0;
	}

	/**
	 * @return Le high score du joueur courant
	 */
	public int getHighScore()
	{
		return this.highScore;
	}

	/**
	 * Obtenir le nom du joueur
	 * @return Le nom du joueur courant
	 */
	public String getNomJoueur()
	{
		return this.nomJoueur;
	}

	/**
	 * Renvoie le nom du joueur ainsi que son high score sous la forme d'une chaîne de caractères
	 */
	public String toString()
	{
		return "[ Nom du joueur = " + this.nomJoueur + "--> High score=" + this.highScore + "]";
	}
}
