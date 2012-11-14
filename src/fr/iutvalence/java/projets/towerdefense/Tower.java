package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de manipuler toutes les tours du jeu
 */

public class Tower extends fr.iutvalence.java.projets.towerdefense.Element
{
	/**
	 * Points d'attaque de la tower
	 */
	private final int pointsAttaque;
	
	/**
	 * Portée d'attaque de la tower
	 */
	private final int porteeAttaque;
	
	/**
	 * Temps de rechargement de la tower
	 */
	private final int tempsRechargement;
	
	/**
	 * Permet de savoir si la tour a l'autorisation de tirer.
	 * Dans ce cas, l'entier sera égal à 0. Dans les autres cas, il est égal au temps de rechargement,
	 * décrémenté de 1 à chaque tour.
	 * Autrement dit, permet de savoir si le temps de rechargement est terminé.
	 */
	private int autorisationTir;
	
	/**
	 * Créer une tower avec des caractéristiques données
	 * @param pointsAttaque Points d'attaque de la tower
	 * @param porteeAttaque Portée de l'attaque de la tower
	 * @param pos Position de la tower
	 */
	public Tower(int pointsAttaque, int porteeAttaque,int tempsRechargement, Coordonnees pos)
	{
		super(pos, Type.TOWER);
		this.pointsAttaque = pointsAttaque;
		this.porteeAttaque = porteeAttaque;
		this.tempsRechargement = tempsRechargement;
		this.autorisationTir = 0;
	}

	/**
	 * Obtenir l'entier représentant l'autorisation de tir 
	 * @return Entier représentant l'autorisation de tir 
	 */
	public int getAutorisationTir()
	{
		return this.autorisationTir;
	}

	/**
	 * Changer l'entier représentant l'autorisation de tir 
	 * @param autorisationTir Entier représentant l'autorisation de tir 
	 */
	public void setAutorisationTir(final int autorisationTir)
	{
		this.autorisationTir = autorisationTir;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Tower -- Position = " + this.getPos() + ", points d'attaque = " + this.pointsAttaque + ", Portée de l'attaque = " + this.porteeAttaque;
	}
	
	/**
	 * Permet de gérer le rechargement des towers
	 */
	public void gestionRechargement(){
		if (this.getAutorisationTir() > 0){
			this.setAutorisationTir(this.getAutorisationTir()-1);
		}
	}
	
	//TODO A faire !!! 
	/**
	 * Obtenir l'unité la plus proche de notre Tower.
	 * @param tabUnite Le tableau des unités présentes sur la matrice
	 * @return L'unité la plus proche de notre Tower
	 */
	public Unite closerEnemy(Unite[] tabUnite){
		
		Unite[] tabUniteRes; // Tableau resultat ordonné, on renverra le permier élément
		
		for (int i = 0; i < tabUnite.length; i++){
			
			int X = Math.abs(this.getPos().getX() - tabUnite[i].getPos().getX());
			int Y = Math.abs(this.getPos().getY() - tabUnite[i].getPos().getY());

			if ((X == Y) && (X + Y <= this.porteeAttaque)){
				//OK
			}
			
			else if (X + Y < this.porteeAttaque){
				//OK
			}
		}
		
		return tabUniteRes[0];
	}
	
	/**
	 * Tire sur l'unité
	 * @param unite Unité attaquée !
	 * @return True si tiré, false si pas tiré.
	 */
	public boolean fireInTheHole(Unite[] tabUnite){
		if (this.autorisationTir == 0){
			if (this.closerEnemy(tabUnite) == ){ //Ne pas faire de test, tirer sur l'unité renvoyée
				// Tire sur l'ennemi le plus près
				this.setAutorisationTir(this.tempsRechargement); // Reinitialise le temps de rechargement
				return true;
			}
			else return false;
		}
		else return false;
	}	
}
