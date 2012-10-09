package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer la carte du jeu ici considérée comme une matrice
 * 
 */
public class Matrice
{
	/* VARIABLES DE DEPLACEMENT ------------------------------ */
	
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
	 * Largeur maximale de la carte
	 */
	public final static int LARGEUR_MAX = 30;
	
	/**
	 * Hauteur maximale de la carte
	 */
	public final static int HAUTEUR_MAX = 20;
	
	/**
	 * Largeur de la carte
	 */
	private final int largeur;
	
	/**
	 * Hauteur de la carte
	 */
	private final int hauteur;
	
	/**
	 * Hauteur de la carte
	 */
	private final Chemin chemin;
	
	/**
	 * Tableau d'entiers à double dimensions : représente la matrice.
	 */
	private int[][] background;
	
	public Matrice(int largeur, int hauteur, Chemin chemin, int[][] background)
	{
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.chemin =  chemin;
		this.background = background;
	}
	
	/**
	 * Affiche la representation graphique de la matrice
	 *
	 */
	public static void afficherBackgroundMatrice(Matrice matrice)
	{	
		for (int i = 0; i < matrice.hauteur; i++){
			for (int j = 0; j < matrice.largeur; j++){
				System.out.print(matrice.background[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}