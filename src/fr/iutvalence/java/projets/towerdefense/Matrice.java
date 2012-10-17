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
	
	
	/* VARIABLES DE DECOR ------------------------------ */
	
	
	// FIXME définir sous la forme d'une énumération "Decor"
	/**
	 * Correspond au décor terre
	 */
	public final static int TERRE = 11;
	
	/**
	 * Correspond au décor herbe
	 */
	public final static int HERBE = 12;
	
	/**
	 * Correspond au décor route
	 */
	public final static int ROUTE = 13;
	
	/**
	 * Correspond au décor mur
	 */
	public final static int MUR = 14;
	
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
	 *	Chemin que les unités devront suivre afin de traverser la matrice de jeu
	 */
	private final Chemin chemin;
	
	
	// FIXME (FIXED) détailler le commentaire (contenu des cases)
	/**
	 * Tableau d'entiers à double dimensions : représente le décor matrice.
	 * Contient des des entiers qui représentent le décor
	 */
	private int[][] background;
	
	// FIXME (FIXED) corriger
	/**
	 * Genère une matrice d'une taille, d'un chemin et d'un background donnés  
	 * 
	 * @param hauteur la hauteur de la matrice 
	 * @param largeur la largeur de la matrice
	 * @param chemin le chemin que les unités deveront parcouriri afin de traverser la matrice
	 * @param background le décor de la matrice de jeu
	 */
	public Matrice(int hauteur, int largeur, Chemin chemin, int[][] background)
	{
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.chemin =  chemin;
		this.background = background;
	}
	
	// FIXME (FIXED) corriger le commentaire (rien n'est affiché)

	/**
	 * Renvoie une chaîne qui contient la représentation du background de la matrice
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String res = "";
		
		for (int i = 0; i < this.hauteur; i++){					// Parcours le premier tableau
			for (int j = 0; j < this.largeur; j++){				// Parcours le second tableau 
				res = res +this.background[i][j];				
				res = res +" ";
			}
			res = res +"\n";					 				// Permet de revenir à la ligne au moment de passer à la ligne suivante du tableau
		}	
		return res;
	}

	/**
	 * Permet de connaître l'élément de la carte à des coordonnées données
	 * @param c Un objet de type Coordonnées
	 * @return Un entier représentant l'élément (décor, chemin) aux coordonnées données
	 */
	public int getBackgroundAt(Coordonnees c) throws CoordonneesMatriceException
	{
		if (c.getX() > getLargeur() || c.getX() < 0 || c.getY() > getHauteur() || c.getY() < 0 )
		{
			throw new CoordonneesMatriceException();
		}
		return this.background[c.getX()][c.getY()];
	}

	/**
	 * Permet d'obtenir la largeur de la carte
	 * @return Entier représentant la largeur de la carte
	 */
	public int getLargeur()
	{
		return this.largeur;
	}

	/**
	 * Permet d'obtenir la hauteur de la carte
	 * @return Entier représentant la hauteur de la carte
	 */
	public int getHauteur()
	{
		return this.hauteur;
	}

	/**
	 * Permet d'obtneir le chemin parcouru par les unités
	 * @return Le chemin qui sera parcouru par les unités
	 */
	public Chemin getChemin()
	{
		return this.chemin;
	}
	
	// FIXME (FIXED) ajouter des accesseurs sur les attributs
	
}