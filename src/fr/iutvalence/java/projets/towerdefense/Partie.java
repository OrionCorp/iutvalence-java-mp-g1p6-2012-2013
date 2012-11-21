package fr.iutvalence.java.projets.towerdefense;
/**
 * Permet la definition d'une partie.
 * Pour plus de détails, se référer au <a href="https://github.com/sebastienjean/iutvalence-java-mp-g1p6-2012-2013/wiki">wiki</a>
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

	/**
	 * Score du joueur
	 */
	private int score;
	
	/**
	 * Liste des unités présentes dans la partie
	 */
	private Unite[] listeUnite;

	/**
	 * Liste des Towers présentes dans la partie
	 */
	private Tower[] listeTower;

	/**
	 * Matrice utilisée dans la partie
	 */
	private Matrice matrice;

	
	//FIXME PERSO Corriger le commentaire
	/**
	 * Gère une partie dont les nombres de tours, tower, score et unités sont initialisés à 0
	 * @param matrice La matrice utilisé dans la partie
	 */
	public Partie(Matrice matrice)
	{
		super();
		this.nbTours = 0;
		this.nbTowers = 0;
		this.nbUnites = 0;
		this.score = 0;
		this.matrice = matrice;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Partie - nbTours = " + this.nbTours + ", nbUnites = " + this.nbUnites + ", nbTowers = " + this.nbTowers + ", score = " + this.score;
	}

	/**
	 * Démarrer la partie
	 */
	public void demarrer()
	{
		System.out.print(this.matrice);
		// TODO A FINIR RAPIDEMENT ! Pour plus de détails, se référer au <a href="https://github.com/sebastienjean/iutvalence-java-mp-g1p6-2012-2013/wiki/Fonctionnement-du-jeu">Fonctionnement</a>
		// Parcours de la liste des towers
		
			
	}
	
	
	// FIXME (FIXED) autres attributs ?

	// FIXME (FIXED) méthodes ?
}
