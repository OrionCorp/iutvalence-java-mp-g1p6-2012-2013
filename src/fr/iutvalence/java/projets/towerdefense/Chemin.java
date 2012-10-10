package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer le chemin de déplacement dans la carte
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

	/**
	 * Coordonnées de départ du chemin
	 */
	private final Coordonnees coorDepart;
	
	/**
	 * Tableau contenant les déplacments que les unités deveront effectuer afin de traverser la matrice
	 */
	private final int[] tabDeplacements;

	/**
	 * Chemin : contient les coordonées de spawn des unités ainsi que les déplacements qu'elles deveront effectuer afin de traverser la matrice
	 * 
	 * @param coorDepart : permet de définir le point de départ des unités (Coordonnees)
	 * @param tabDeplacements : permetr de définir les déplacements à effectuer (int[])
	 */
	public Chemin(Coordonnees coorDepart, int[] tabDeplacements)
	{
		super();
		this.coorDepart = coorDepart;
		this.tabDeplacements = tabDeplacements;
	}
}
