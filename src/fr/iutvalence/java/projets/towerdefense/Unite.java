package fr.iutvalence.java.projets.towerdefense;

/**
 * Gère les unités
 * @author Teddy Gustiaux & Alister Desvergnes.
 */
public class Unite
{
	
	// FIXME déclarer l'attribut en privé
	/**
	 * Points d'attaque de l'unité
	 */
	int pointsAttaque; 

	// FIXME déclarer l'attribut en privé
	/**
	 * Points de vie de l'unité
	 */
	int pointsVie;
	
	
	// FIXME remplacer par un attribut de type Coordonnees
	/**
	 * Abscisse de l'unité
	 */
	int posX;
	
	/**
	 * Ordonée de l'unité
	 */
	int posY;
	
	/**
	 * Constructeur par défaut : Créer une unité de niveau 1
	 */
	public Unite() {
		
		// FIXME définir des constantes pour les valeurs par défaut
		this.pointsAttaque = 10;
		this.pointsVie = 25;
		this.posX = 0; /* Penser à les transformer en coordonées (x,y) */ 
		this.posY = 0;
	}
}
