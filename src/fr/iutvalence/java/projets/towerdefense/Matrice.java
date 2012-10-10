package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les matrice
 * Une matrice est une carte de jeu, elle est composée d'une taille (hauteur, largeur), d'un chemmin (définissant le
 * chemin que les unités deveront suivre) ainsi qu'un background (décor de la carte du jeu)
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
	 *	Chemin que les unités deveront suivre afin de traverser la matrice de jeu
	 */
	private final Chemin chemin;
	
	/**
	 * Tableau d'entiers à double dimensions : représente le décor matrice.
	 */
	private int[][] background;
	
	/**
	 * Matrice : contient le décor de la carte de jeu ainsi que le chemin que les unités deveront suivre
	 * 
	 * @param hauteur : permet de définir la hauteur de la matrice 
	 * @param largeur : permet de définir la largeur de la matrice
	 * @param chemin : donner le chemin que les unités deveront parcouriri afin de traverser la matrice
	 * @param background : contient le décor de la matrice de jeu
	 */
	public Matrice(int hauteur, int largeur, Chemin chemin, int[][] background)
	{
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.chemin =  chemin;
		this.background = background;
	}
	
	/**
	 * Affiche la representation graphique de la matrice
	 * Parcours le matrice.background (un tableau à double dimensions) afin d'en afficher le contenu
	 * 
	 * @param matrice : la matrice dont on veut afficher le backgorund
	 *
	 */
	public static void afficherBackgroundMatrice(Matrice matrice)
	{	
		for (int i = 0; i < matrice.hauteur; i++){						// Parcours le premier tableau
			for (int j = 0; j < matrice.largeur; j++){					// Parcours le second tableau 
				System.out.print(matrice.background[i][j]);				
				System.out.print(" ");
			}
			System.out.print("\n");										// Permet de revenir à la ligne au moment de passer à la ligne suivante du tableau
		}
	}

}