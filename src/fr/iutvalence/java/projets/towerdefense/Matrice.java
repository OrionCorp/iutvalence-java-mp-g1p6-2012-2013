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
	
	
	// FIXME (à la fin) définir sous la forme d'une énumération
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
	
	/* VARIABLES DE CARTE ------------------------------ */
			
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
	
	/**
	 * Tableau d'entiers à double dimensions : représente le décor matrice.
	 */
	private int[][] background;
	
	// FIXME corriger (FIXED)
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
	
	// FIXME remplacer par une redéfinition de toString()
	/**
	 * Affiche la representation graphique de la matrice
	 * Parcours le matrice.background (un tableau à double dimensions) afin d'en afficher le contenu
	 * 
	 *
	 */
	public void afficherBackground()
	{	
		for (int i = 0; i < this.hauteur; i++){					// Parcours le premier tableau
			for (int j = 0; j < this.largeur; j++){				// Parcours le second tableau 
				System.out.print(this.background[i][j]);				
				System.out.print(" ");
			}
			System.out.print("\n");					 			// Permet de revenir à la ligne au moment de passer à la ligne suivante du tableau
		}
	}
	
	/**
	 * Renvoie les coordonnées successives que les unités deveront suivre afin de traverser la matrice 
	 * 
	 * @return un tableau contenant toutes les coordonnées
	 */
	public  Coordonnees[] coordonneesChemin(){
		
		int[] res = {};
		
		
		
		return res;
	}
}