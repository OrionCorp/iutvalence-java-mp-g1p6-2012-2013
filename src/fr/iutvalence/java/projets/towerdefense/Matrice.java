package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de manipuler les différentes trames du jeu.
 * @author Teddy Gustiaux & Alister Desvergnes.
 * @version 0.1
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
	
	
	private int largeur;
	
	private int hauteur;
	
	private int[][] matrice;
	
	private int[] chemin;
	
	
}