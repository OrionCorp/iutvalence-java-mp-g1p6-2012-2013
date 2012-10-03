package fr.iutvalence.java.projets.towerdefense;

import java.util.Arrays;

/**
 * Permet de gérer la carte du jeu.
 * @author Teddy Gustiaux & Alister Desvergnes.
 */
public class Matrice
{
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
	 * Représente la carte (tableau à deux dimensions) telle qu'elle sera affichée
	 */
	private int[][] matrice;
	
	/**
	 * Chemin contenant le point de départ et les directions successives
	 */ 
	private Chemin cheminEmprunte;

	/**
	 * Constructeur de la carte de jeu, qui retourne la matrice et le chemin emprunté
	 * par les unités
	 */ 
	public Matrice(int i, int j, Chemin chemin)
	{
		// TODO Créer le constructueur permettant la création d'une carte
	}

	public String toString()
	{
		// TODO Modifier le constructeur toString() afin de pouvoir afficher la
		// carte correctement dans TestMatrice. 
	}

	
	
	
}