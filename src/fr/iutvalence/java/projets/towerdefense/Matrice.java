package fr.iutvalence.java.projets.towerdefense;

/**
 * Une matrice est une carte de jeu, elle est composée d'une taille (hauteur, largeur), d'un chemmin (définissant le
 * chemin que les unités devront suivre) ainsi qu'un background (décor de la carte du jeu)
 * 
 */
public class Matrice
{
	/* CONSTANTES --------------------------------------- */

	/**
	 * Largeur maximale de la matrice de jeu
	 */
	public final static int LARGEUR_MAX = 30;

	/**
	 * Hauteur maximale de la matrice de jeu
	 */
	public final static int HAUTEUR_MAX = 20;
	

	/* VARIABLES DE MATRICE ------------------------------ */

	/**
	 * Largeur de la matrice de jeu
	 */
	private final int largeur;

	/**
	 * Hauteur de la matrice de jeu
	 */
	private final int hauteur;

	/**
	 * Chemin que les unités devront suivre afin de traverser la matrice de jeu
	 */
	private final Chemin chemin;

	/**
	 * Tableau d'entiers à double dimensions : représente le décor matrice. Contient des des entiers qui représentent le
	 * décor
	 */
	private Decor[][] background;

	/**
	 * Genère une matrice d'une taille, d'un chemin et d'un background donnés
	 * 
	 * @param hauteur
	 *            La hauteur de la matrice
	 * @param largeur
	 *            La largeur de la matrice
	 * @param chemin
	 *            Le chemin que les unités deveront parcouriri afin de traverser la matrice
	 * @param background
	 *            Le décor de la matrice de jeu
	 */
	public Matrice(int hauteur, int largeur, Chemin chemin, Decor[][] background)
	{
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.chemin = chemin;
		this.background = background;
	}

	/**
	 * Renvoie une chaîne qui contient la représentation du background de la matrice en ascii-art
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String res = "";

		for (int i = 0; i < this.hauteur; i++)
		{					// Parcours le premier tableau
			for (int j = 0; j < this.largeur; j++)
			{				// Parcours le second tableau
				
				switch (this.background[i][j])
				{
					case MUR : res = res +"M"; break;
					case HERBE : res = res +"H"; break;
					case ROUTE : res = res +"R"; break;
					case TERRE : res = res +"T"; break;
				}
				
				res = res + " ";
			}
			res = res + "\n";	// Permet de revenir à la ligne au moment de passer à la ligne suivante du tableau
		}
		return res;
	}

	/**
	 * Permet de connaître l'élément de la carte à des coordonnées données
	 * 
	 * @param c
	 *            Un objet de type Coordonnées
	 * @return Un entier représentant l'élément (décor, chemin) aux coordonnées données
	 * @throws CoordonneesMatriceException Gère les exceptions au niveau des coordonnées des points
	 */
	public Decor getBackgroundAt(Coordonnees c) throws CoordonneesMatriceException
	{
		if (c.getX() > getLargeur() || c.getX() < 0 || c.getY() > getHauteur() || c.getY() < 0)
		{
			throw new CoordonneesMatriceException();
		}
		return this.background[c.getX()][c.getY()];
	}

	/**
	 * Permet de changer le background à des coordonnées données.
	 * @param c Coordonnées du point dont le background sera changé
	 * @param background Nouveau décor 
	 * @throws CoordonneesMatriceException Gère les exceptions au niveau des coordonnées des points
	 */
	public void setBackgroundAt(Coordonnees c, Decor background) throws CoordonneesMatriceException
	{
		if (c.getX() > getLargeur() || c.getX() < 0 || c.getY() > getHauteur() || c.getY() < 0)
		{
			throw new CoordonneesMatriceException();
		}
		this.background[c.getX()][c.getY()] = background;
	}
	
	/**
	 * Permet d'obtenir la largeur de la carte
	 * 
	 * @return Entier représentant la largeur de la carte
	 */
	public int getLargeur()
	{
		return this.largeur;
	}

	/**
	 * Permet d'obtenir la hauteur de la carte
	 * 
	 * @return Entier représentant la hauteur de la carte
	 */
	public int getHauteur()
	{
		return this.hauteur;
	}

	/**
	 * Permet d'obtneir le chemin parcouru par les unités
	 * 
	 * @return Le chemin qui sera parcouru par les unités
	 */
	public Chemin getChemin()
	{
		return this.chemin;
	}


}