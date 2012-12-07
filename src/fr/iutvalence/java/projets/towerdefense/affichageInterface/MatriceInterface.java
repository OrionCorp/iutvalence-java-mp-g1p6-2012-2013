package fr.iutvalence.java.projets.towerdefense.affichageInterface;
import fr.iutvalence.java.projets.towerdefense.*;

/**
 * Classe Matrice, implémetant une interface.
 * Une matrice est une carte de jeu, elle est composée d'une taille (hauteur, largeur), d'un chemmin (définissant le
 * chemin que les unités devront suivre) ainsi qu'un background (décor de la carte du jeu)
 * 
 */
public class MatriceInterface implements Affichage
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
	 * Générer une matrice d'une taille, d'un chemin et d'un background donnés
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
	public MatriceInterface(int hauteur, int largeur, Chemin chemin, Decor[][] background)
	{
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.chemin = chemin;
		this.background = background;
	}

	/**
	 * Obtenir une chaîne qui contient la représentation du background de la matrice en ascii-art
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
					case TOWER : res = res +"O"; break;
					case UNITE : res = res +"X"; break;
					case QG : res = res + "G"; break;
				}
				
				res = res + " ";
			}
			res = res + "\n";	// Permet de revenir à la ligne au moment de passer à la ligne suivante du tableau
		}
		return res;
	}

	/**
	 * Obtenir l'élément de la carte à des coordonnées données
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
	 * Changer le background à des coordonnées données.
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
	 * Obtenir la largeur de la carte
	 * @return Entier représentant la largeur de la carte
	 */
	public int getLargeur()
	{
		return this.largeur;
	}

	/**
	 * Obtenir la hauteur de la carte
	 * @return Entier représentant la hauteur de la carte
	 */
	public int getHauteur()
	{
		return this.hauteur;
	}

	/**
	 * Obtenir le chemin parcouru par les unités
	 * @return Le chemin qui sera parcouru par les unités
	 */
	public Chemin getChemin()
	{
		return this.chemin;
	}
	
	/** Ajoute un élément sur la matrice
	 * @param element Un élément à placer sur la matrice
	 * @throws CoordonneesMatriceException Gérer une exception au niveau des coordonnées de la matrice
	 */
	public void placerElement(Element element) throws CoordonneesMatriceException{
		
		if (element.getType() == Type.TOWER){
			this.setBackgroundAt(element.getPos(), Decor.TOWER);
		}
		else{
			this.setBackgroundAt(element.getPos(), Decor.UNITE);
		}
	}
	
	/**
	 * Supprimer un élément de la matrice
	 * @param element Une élément que l'on souhaite enlever de la matrice
	 * @throws CoordonneesMatriceException Gérer une exception au niveau des coordonnées de la matrice
	 */
	public void enleverElement(Element element) throws CoordonneesMatriceException{
		
		if (element.getType() == Type.TOWER){
			this.setBackgroundAt(element.getPos(), Decor.TERRE);
		}
		else{
			this.setBackgroundAt(element.getPos(), Decor.ROUTE);
		}
	}
	
	public void Afficher()
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
					case TOWER : res = res +"O"; break;
					case UNITE : res = res +"X"; break;
					case QG : res = res + "G"; break;
				}
				
				res = res + " ";
			}
			res = res + "\n";	// Permet de revenir à la ligne au moment de passer à la ligne suivante du tableau
		}
		System.out.print(res);
	}
}