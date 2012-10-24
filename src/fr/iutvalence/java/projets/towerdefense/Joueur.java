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
	private final static String NOM_JOUEUR_DEFAUT = "Gordon Freeman";

	/* VARIABLES DE JOUEUR ------------------------------ */

	/**
	 * Pseudonyme du joueur
	 */
	// FIXME (FIXED) peut-il changer ?
	private final String joueur;

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
		this.joueur = NOM_JOUEUR_DEFAUT;
		this.highScore = 0;
	}

	// FIXME (FIXED) ajouter des accesseurs sur les attributs
	/**
	 * @return Le high score du joueur courant
	 */
	public int getHighScore()
	{
		return this.highScore;
	}

	/**
	 * @return Le nom du joueur courant
	 */
	public String getJoueur()
	{
		return this.joueur;
	}

	// FIXME (FIXED) redéfinir toString
	/**
	 * Renvoie le nom du joueur ainsi que son high score sous la forme d'une chaîne de caractères
	 */
	public String toString()
	{
		return "[ Nom du joueur = " + this.joueur + "--> High score=" + this.highScore + "]";
	}

}
