package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les untiés, hérité de Element.
 * Une unité est caractérisée par des points de vie, d'attaque, et une position sur la carte 
 */
public class Unite extends fr.iutvalence.java.projets.towerdefense.Element
{
	/* VARIABLES UNITE DEFAULT ------------------------------ */

	/**
	 * Points de vie par defaut de l'unité
	 */
	private final static int PV_UNITE_DEFAULT = 25;

	/**
	 * Points d'attaque par defaut de l'unité
	 */
	private final static int PA_UNITE_DEFAULT = 10;

	/**
	 * Position initiale des unités apparaissant sur la carte
	 */
	private final static Coordonnees POSITION_UNITE = new Coordonnees(4, 0);

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
	 * Créer une unité par défaut 
	 */
	public Unite()
	{
		super(POSITION_UNITE, Type.UNITE);
		this.pointsVie = PV_UNITE_DEFAULT;
		this.pointsAttaque = PA_UNITE_DEFAULT;
	}
	
	/**
	 * Créer une unité dont on définit les différentes caractéristiques
	 * @param pv Points de vie de l'unité
	 * @param pa Points d'attaque de l'unité
	 * @param pos Position de l'unité
	 */
	public Unite(int pv, int pa, Coordonnees pos)
	{
		super(pos, Type.UNITE);
		this.pointsVie = pv;
		this.pointsAttaque = pa;
	}

	/**
	 * Changer les points de vie de l'unité
	 * @param pointsVie Les points de vie de l'unité
	 */
	public void setPointsVie(int pointsVie)
	{
		this.pointsVie = pointsVie;
	}
	
	/**
	 * Obtenir les points d'attaque de l'unité
	 * @return les points d'attaque de l'unité
	 */
	public int getPointsAttaque()
	{
		return this.pointsAttaque;
	}

	/**
	 * Obtenir les points de vie de l'unité
	 * @return les points de vie de l'unité
	 */
	public int getPointsVie()
	{
		return this.pointsVie;
	}
	
	/**
	 * Obtenir un booléen à True si l'unité est morte, False sinon.
	 * @return True si l'unité est morte, false sinon
	 */
	public boolean mort(){
		if (this.pointsVie <= 0){
			return true;
		}
		else
			return false;
	}

	/**
	 * Redéfinition de la méthode toString
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Unité -- Points d'Attaque = " + this.pointsAttaque + ", Points de Vie = " + this.pointsVie + ", Position = " + this.getPos();
	}
	
	/**
	 * Déplacer une unité sur le chemin de la matrice
	 * @param matrice La matrice conteant le chemin que l'unité est en train de parcourir
	 */
	public void deplacerUnite(Matrice matrice)
	{
		Chemin chemin = matrice.getChemin();;
		Deplacement[] deplacement = matrice.getChemin().getTabDeplacements();
		switch (deplacement[chemin.getIndiceDeplacement()]) {
			case BAS:
				Coordonnees pos_bas = new Coordonnees(this.getPos().getX(), this.getPos().getY() + 1); 
				this.setPos(pos_bas);
				break;
			case HAUT:
				Coordonnees pos_haut = new Coordonnees(this.getPos().getX(), this.getPos().getY() - 1); 
				this.setPos(pos_haut);
				break;
			case DROITE:
				Coordonnees pos_droite = new Coordonnees(this.getPos().getX() + 1, this.getPos().getY()); 
				this.setPos(pos_droite);
				break;
			case GAUCHE:
				Coordonnees pos_gauche = new Coordonnees(this.getPos().getX() - 1, this.getPos().getY()); 
				this.setPos(pos_gauche);
				break;
			case QG:
				Coordonnees pos_base = new Coordonnees(-1, -1); 
				this.setPos(pos_base);
				break;
		}
		chemin.setIndiceDeplacement(chemin.getIndiceDeplacement() + 1); 
	}
}