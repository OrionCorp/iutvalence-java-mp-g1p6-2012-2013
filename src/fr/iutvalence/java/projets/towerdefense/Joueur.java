package fr.iutvalence.java.projets.towerdefense;

/**
 * Gère les joueurs
 */
public class Joueur
{
	/**
	 * Nom par défaut attribué au joueur
	 */
	private final static String NOM_JOUEUR_DEFAUT = "Joueur";

	/**
	 * Pseudonyme du joueur
	 */
	private final String nomJoueur; 

	/**
	 * High score du joueur
	 */
	private int highScore;

	/**
	 * Créer un joueur par defaut
	 */
	public Joueur()
	{
		super();
		this.nomJoueur = NOM_JOUEUR_DEFAUT;
		this.highScore = 0;
	}
	
	/**
	 * Créer un joueur dont le nom est passé en paramètre
	 * 
	 * @param nomJoueur 
	 */
	public Joueur(String nomJoueur)
	{
		super();
		this.nomJoueur = nomJoueur;
		this.highScore = 0;
	}

	/**
	 * Obtenir le hight score du joueur
	 *  
	 * @return Le high score du joueur courant
	 */
	public int getHighScore()
	{
		return this.highScore;
	}

	/**
	 * Obtenir le nom du joueur
	 * 
	 * @return Le nom du joueur courant
	 */
	public String getNomJoueur()
	{
		return this.nomJoueur;
	}

	/**
	 * Redefinition de la méthode toString
	 */
	public String toString()
	{
		return "[ Nom du joueur = " + this.nomJoueur + "--> High score=" + this.highScore + "]";
	}
}