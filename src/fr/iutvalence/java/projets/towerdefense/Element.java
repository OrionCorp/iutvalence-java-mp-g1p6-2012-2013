package fr.iutvalence.java.projets.towerdefense;

/**
 * Permet de gérer les éléments du jeu.
 * Les classes Tower et Unité héritent de cette classe
 */
public class Element
{
	/**
	 * Emplacement de l'élément
	 */
	private Coordonnees pos;
	
	/**
	 * Type de l'élément
	 */
	private Type type;
	
	/**
	 * Modifier la position de l'élément
	 * @param pos Position de l'évènement
	 */
	public void setPos(Coordonnees pos)
	{
		this.pos = pos;
	}

	/**
	 * Obtenir la position de l'élément
	 * @return Les coordonnées de l'élément
	 */
	public Coordonnees getPos()
	{
		return this.pos;
	}

	/**
	 * Obtenir le type de l'élément
	 * @return Le type de l'élément
	 */
	public Type getType()
	{
		return this.type;
	}

	/**
	 * Constructeur d'un élément
	 * @param pos Position de l'élément
	 * @param type Type de l'élément
	 */
	public Element(Coordonnees pos, Type type)
	{
		super();
		this.pos = pos;
		this.type = type;
	}
}