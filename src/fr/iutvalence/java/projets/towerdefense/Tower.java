package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de manipuler toutes les towers du jeu
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
	 * 
	 * @param pointsAttaque Points d'attaque de la tower
	 * @param porteeAttaque Portée de l'attaque de la tower
	 * @param tempsRechargement Le temps de rechargement de la Tower
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
	 * 
	 * @return Entier représentant l'autorisation de tir 
	 */
	public int getAutorisationTir()
	{
		return this.autorisationTir;
	}

	/**
	 * Changer l'entier représentant l'autorisation de tir 
	 * 
	 * @param autorisationTir Entier représentant l'autorisation de tir 
	 */
	public void setAutorisationTir(final int autorisationTir)
	{
		this.autorisationTir = autorisationTir;
	}

	/**
	 * Redéfinition de la méthode toString
	 * 
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
	
	/**
	 * Obtenir la valeur absolue de la distance entre l'unité d'un tableau et la tower
	 * 
	 * @param tabUnite Un tableau d'unité
	 * @param i Un entier
	 * @return La valeur absolue de la distance entre l'unité d'un tableau et la tower
	 */
	public int distanceTowerUnite (Unite[] tabUnite, int i)
	{
		return Math.abs( this.getPos().getX() - tabUnite[i].getPos().getX() ) + 
		Math.abs( this.getPos().getY() - tabUnite[i].getPos().getY() );
	}
	
	/**
	 * Obtenir l'unité la plus proche de notre Tower
	 * 
	 * @param tabUnite Le tableau des unités présentes sur la matrice
	 * @return L'unité la plus proche de notre Tower
	 * @throws ListeUniteException 
	 */
	public Unite closerEnemy(Unite[] tabUnite) throws ListeUniteException
	{
		if (tabUnite[0] == null)
		{
			throw new ListeUniteException();
		}
		Unite uniteRes = new Unite(-1, -1, new Coordonnees(-1,-1));
		
		for (int i = 0; tabUnite[i] != null; i++)
		{
			
			int X = Math.abs(this.getPos().getX() - tabUnite[i].getPos().getX());
			int Y = Math.abs(this.getPos().getY() - tabUnite[i].getPos().getY());

			if ((X == Y) && (X + Y <= this.porteeAttaque)){ // Gère la diagonale
				int j = 0;
				while (tabUnite[j] != null)
				{
					if (distanceTowerUnite(tabUnite, j) <= X + Y)
					{
						 uniteRes = tabUnite[j];
					}
					j++;
				}
			}
			
			else if (X + Y < this.porteeAttaque) // Gère les lignes droites
			{
				int j = 0;
				while (j <= tabUnite.length)
				{
					if (distanceTowerUnite(tabUnite, j) <= X + Y)
					{
						 uniteRes = tabUnite[j];
					}
					j++;
				}
			}
		}
		return uniteRes;
	}
	
	/**
	 * Tire sur l'unité la plus proche si elle existe, ne fait rien sinon
	 * 
	 * @param tabUnite Unité attaquée !
	 * @return True si tiré, false si pas tiré.
	 * @throws ListeUniteException 
	 */
	public boolean tirer(Unite[] tabUnite) throws ListeUniteException{
		// On vérifie que la Tower peut tirer
		if (this.autorisationTir == 0){
			Unite unite = this.closerEnemy(tabUnite);
			// Tire sur l'ennemi le plus près
			unite.setPointsVie(unite.getPointsVie()-this.pointsAttaque);
			if (unite.mort() == true){
			}
			// Reinitialise le temps de rechargement
			this.setAutorisationTir(this.tempsRechargement); 
			return true;
		}
		else return false;
	}	
}