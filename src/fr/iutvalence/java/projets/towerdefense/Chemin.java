

package fr.iutvalence.java.projets.towerdefense;

import java.util.Arrays;

/**
 * Permet de gérer le chemin de déplacement dans la carte
 */
public class Chemin
{
	/* CONSTANTES DE DEPLACEMENT ------------------------------ */

	/**
	 * Coordonnées de départ du chemin
	 */
	private final Coordonnees coorDepart;

	/**
	 * Tableau contenant les déplacements que les unités deveront effectuer afin de traverser la matrice
	 */
	private final Deplacement[] tabDeplacements;
	
	
	/**
	 * Entier permettant de connaître son avancement sur le chemin de la matrice
	 */
	private int indiceDeplacement;

	/**
	 * Permet de créer un chemin contenant le point de départ des unités ainsi que les déplacements à effectuer
	 * @param coorDepart Permet de définir le point de départ des unités (Coordonnees)
	 * @param tabDeplacements Permet de définir les déplacements à effectuer (int[])
	 */
	public Chemin(Coordonnees coorDepart, Deplacement[] tabDeplacements)
	{
		super();
		this.coorDepart = coorDepart;
		this.tabDeplacements = tabDeplacements;
		this.indiceDeplacement = 0;
	}

	/**
	 * @return
	 */
	public Deplacement[] getTabDeplacements()
	{
		return this.tabDeplacements;
	}

	// TODO A compléter
	/**
	 * Renvoie les coordonnées successives que les unités deveront suivre afin de traverser la matrice
	 * 
	 * @return Un tableau contenant toutes les coordonnées
	 */
	public Coordonnees[] coordonneesChemin()
	{

		Coordonnees[] res = {};

		return res;
	}

	/**
	 * Renvoie une chaîne contenant les coordonnées du point de départ et le tableau des déplacements
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Coodonnées de départ = " + this.coorDepart + ", Tableau des déplacements = " + Arrays.toString(this.tabDeplacements);
	}

	public int getIndiceDeplacement()
	{
		return this.indiceDeplacement;
	}

	public void setIndiceDeplacement(int indiceDeplacement)
	{
		this.indiceDeplacement = indiceDeplacement;
	}

}
