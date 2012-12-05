package fr.iutvalence.java.projets.towerdefense;
import java.util.Arrays;

/**
 * Permet de gérer le chemin de déplacement dans la carte
 */
public class Chemin
{
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
	 * 
	 * @param coorDepart Permet de définir le point de départ des unités
	 * @param tabDeplacements Permet de définir les déplacements à effectuer
	 */
	public Chemin(Coordonnees coorDepart, Deplacement[] tabDeplacements)
	{
		super();
		this.coorDepart = coorDepart;
		this.tabDeplacements = tabDeplacements;
		this.indiceDeplacement = 0;
	}

	/**
	 * Obtenir le tableau des déplacements de la matrice
	 * 
	 * @return Tableau des déplacements  
	 */
	public Deplacement[] getTabDeplacements()
	{
		return this.tabDeplacements;
	}

	/**
	 * Redéfinition de la méthode toString. Coordonnées de départ et tableau des déplacements
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Coodonnées de départ = " + this.coorDepart + ", Tableau des déplacements = " + Arrays.toString(this.tabDeplacements);
	}

	/**
	 * Obtenir l'indice de déplacement
	 * 
	 * @return Indice de déplacement
	 */
	public int getIndiceDeplacement()
	{
		return this.indiceDeplacement;
	}

	/**
	 * Modifie l'indice de déplacement
	 * 
	 * @param indiceDeplacement
	 */
	public void setIndiceDeplacement(int indiceDeplacement)
	{
		this.indiceDeplacement = indiceDeplacement;
	}
}