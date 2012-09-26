package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet la deffinition d'une partie.
 * @author Teddy Gustiaux & Alister Desvergnes.
 * @version 0.1
 */
public class Partie
{
	/**
	 * Nombre maximal de tours de jeu
	 */
	public final static int NB_TOUR_JEU = 10;
	
	/**
	 * Score maximal d'une partie
	 */
	public final static int SCORE_MAX = 100000;
	/**
	 * Nombre maximal d'unités sur la carte
	 */
	public final static int NB_MAX_UNITS = 50;
	/**
	 * Nombre maximal de tours sur la carte
	 */
	public final static int NB_MAX_TOWERS = 40;
	
	
	/**
	 * Pseudonyme de l'utilisateur
	 */
	private String pseudo = "Joueur";
	/**
	 * Score de l'utilisateur
	 */
	private int score = 0;
}

