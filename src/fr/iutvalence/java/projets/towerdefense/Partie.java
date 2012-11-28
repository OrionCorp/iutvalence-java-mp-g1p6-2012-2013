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
	
	/**
	 * Nombre de points de vide de la base
	 */
	private int pvQG;

	
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
	 * @throws ListeUniteException 
	 */
	public void demarrer() throws ListeUniteException
	{
		System.out.print(this.matrice);
		// TODO A FINIR RAPIDEMENT ! Pour plus de détails, se référer au <a href="https://github.com/sebastienjean/iutvalence-java-mp-g1p6-2012-2013/wiki/Fonctionnement-du-jeu">Fonctionnement</a>
		// Parcours de la liste des towers, et tirs
		for (int i = 0; i < this.listeTower.length; i++)
		{
			this.listeTower[i].tirer(this.listeUnite);
		}
		// Suppression des unités mortes
		for (int i = 0; i < this.listeUnite.length; i++)
		{
			if (this.listeUnite[i].mort())
			{
				// Suppression de l'unité morte
				this.listeUnite[i] = this.listeUnite[this.listeUnite.length];
				this.listeUnite[this.listeUnite.length] = null;
				
			}
		}
		// Déplacement des unités
		for (int i = 0; i < this.listeUnite.length; i++)
		{
			// Cas où une unité va sortir de la matrice et entrer dans le QG
				this.listeUnite[i].deplacerUnite(this.matrice);
		}
		// Cas où l'unité entre dans la QG
		Coordonnees finChemin = new Coordonnees(-1,-1);
		for (int i = 0; i < this.listeUnite.length; i++)
		{
			if (this.listeUnite[i].getPos() == finChemin)
			{
				this.setPvQG(this.getPvQG() - this.listeUnite[i].getPointsAttaque());
			}
		}
	}


	public int getPvQG()
	{
		return pvQG;
	}


	public void setPvQG(int pvQG)
	{
		this.pvQG = pvQG;
	}
	
	public void addUniteListe(Unite unite)
	{
		this.listeUnite[this.listeUnite.length + 1] = unite; 
	}

}
