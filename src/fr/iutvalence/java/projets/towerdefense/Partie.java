package fr.iutvalence.java.projets.towerdefense;

import java.util.ArrayList;

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
	
	/**
	 * Coordonnées nulles utilisées pour signifier la fin du chemin
	 */
	public final static Coordonnees FIN_CHEMIN = new Coordonnees(-1,-1);

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
	//private ArrayList<Unite> listeUnite;

	/**
	 * Liste des Towers présentes dans la partie
	 */
	private Tower[] listeTower;
	//private ArrayList<Tower> listeTower;

	/**
	 * Matrice utilisée dans la partie
	 */
	public Matrice matrice;
	
	/**
	 * Copie de la matrice utilisée dans la partie (Ne doit pas être altérée)
	 */
	private Matrice matriceOriginale;
	
	/**
	 * Nombre de points de vide de la base
	 */
	private int pvQG;

	
	//FIXME PERSO Corriger le commentaire
	/**
	 * Gère une partie dont les nombres de tours, tower, score et unités sont initialisés à 0
	 * @param matrice La matrice utilisé dans la partie
	 * @param pvQG 
	 * @param arrayListeEmpty 
	 */
	public Partie(Matrice matrice, int pvQG)
	{
		// FIXME (FIXED) tous les attributs doivent être initialisés !
		super();
		this.nbTours = 0;
		this.nbTowers = 0;
		this.nbUnites = 0;
		this.score = 0;
		this.matrice = matrice;
		this.matriceOriginale = matrice;
		this.listeTower = null;
		this.listeUnite = null;
		this.pvQG = pvQG;
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
		for (int i = 0; i < this.listeUnite.length; i++)
		{
			if (this.listeUnite[i].getPos() == FIN_CHEMIN)
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
	
	/**
	 * Ajouter une unité dans la liste des unités
	 * @param unite
	 */
	public void addUniteListe(Unite unite)
	{
		this.listeUnite[this.listeUnite.length + 1] = unite; 
	}

	/**
	 * Ajouter une tower dans la liste des towers
	 * @param tower
	 */
	public void addTowerListe(Tower tower)
	{
		this.listeTower[this.listeTower.length + 1] = tower; 
	}
	
	/**
	 * Parcours la liste des unités afin d'éffectuer toute les actions possibles
	 * 
	 * @throws CoordonneesMatriceException
	 * @throws ListeUniteException
	 */
	public void parcoursListeTowers() throws CoordonneesMatriceException, ListeUniteException
	{
		for (int i = 0; i < this.listeTower.length; i++)
		{
			if (this.matrice.getBackgroundAt(listeTower[i].getPos()) != Decor.TOWER) //On place la tour si elle n'a pas déjà été placée
			{
				this.matrice.placerElement(listeTower[i]);
			}
			listeTower[i].tirer(this.listeUnite);
		}
	}
	
	/**
	 * Parcours la liste des unités afin d'éffectuer toute les actions possibles
	 */
	public void parcoursListeUnites()
	{
		for (int i = 0; i < this.listeUnite.length; i++)
		{
			//Placer ou avancer
		}
	}
	
	/**
	 * Permet de gérer un tour de jeu
	 * Parcours les tableau d'éléments
	 * 
	 * @throws CoordonneesMatriceException
	 * @throws ListeUniteException
	 */
	public void jouerTour() throws CoordonneesMatriceException, ListeUniteException
	{
		parcoursListeTowers();
		parcoursListeUnites();
		
		if (this.getPvQG() <= 0)
		{
			this.finPartie();
		}
	}
	
	/**
	 * Gère la fin de partie
	 */
	public void finPartie()
	{
		if (this.getPvQG() <= 0)
		{
			System.out.println("Vous avez perdu");
			//Ajouter le nombre de tours ou le score
		}
		else
		{
			System.out.println("Vous avez gagné");
			//Ajouter le nombre de tours ou le score			
		}
	}
}
