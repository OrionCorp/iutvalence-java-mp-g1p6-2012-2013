package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer le chemin de déplacement dans la carte
 *
 */
public class Chemin
{
	/* CONSTANTES DE DEPLACEMENT ------------------------------ */

	/**
	 * Correspond a un déplacement vers le bas
	 */
	public final static int BAS = 0;
	
	/**
	 * Correspond a un déplacement vers le haut
	 */
	public final static int HAUT = 1;
	
	/**
	 * Correspond a un déplacement vers le gauche
	 */
	public final static int GAUCHE = 2;
	
	/**
	 * Correspond a un déplacement vers le droite
	 */
	public final static int DROITE = 3;


	private final Coordonnees coorDepart;
	
	private final int[] tabDeplacements;

	public Chemin(Coordonnees coorDepart, int[] tabDeplacements)
	{
		super();
		this.coorDepart = coorDepart;
		this.tabDeplacements = tabDeplacements;
	}
	
}
