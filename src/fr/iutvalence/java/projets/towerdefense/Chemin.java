// FIXME (général) naviguer dans la doc et corriger si besoin

package fr.iutvalence.java.projets.towerdefense;

import java.util.Arrays;

/**
 * Permet de gérer le chemin de déplacement dans la carte
 */
public class Chemin
{
	/* CONSTANTES DE DEPLACEMENT ------------------------------ */

	// FIXME (FIXED) faire migrer ces constantes dans une énumération "Deplacement"

	/**
	 * Coordonnées de départ du chemin
	 */
	private final Coordonnees coorDepart;

	/**
	 * Tableau contenant les déplacements que les unités deveront effectuer afin de traverser la matrice
	 */
	private final Deplacement[] tabDeplacements;

	/**
	 * Chemin : contient les coordonées de spawn des unités ainsi que les déplacements qu'elles deveront effectuer afin
	 * de traverser la matrice
	 * 
	 * @param coorDepart
	 *            : permet de définir le point de départ des unités (Coordonnees)
	 * @param tabDeplacements
	 *            : permetr de définir les déplacements à effectuer (int[])
	 */
	public Chemin(Coordonnees coorDepart, Deplacement[] tabDeplacements)
	{
		super();
		this.coorDepart = coorDepart;
		this.tabDeplacements = tabDeplacements;
	}

	// TODO A compléter
	/**
	 * Renvoie les coordonnées successives que les unités deveront suivre afin de traverser la matrice
	 * 
	 * @return un tableau contenant toutes les coordonnées
	 */
	public Coordonnees[] coordonneesChemin()
	{

		Coordonnees[] res = {};

		return res;
	}

	// FIXME (FIXED) redéfinir toString
	/**
	 * Renvoie une chaîne contenant les coordonnées du point de départ et le tableau des déplacements
	 */
	public String toString()
	{
		return "Coodonnées de départ = " + coorDepart + ", Tableau des déplacements = " + Arrays.toString(tabDeplacements);
	}

	// FIXME (FIXED) écrire (dans une autre classe) une application de test basique
}
