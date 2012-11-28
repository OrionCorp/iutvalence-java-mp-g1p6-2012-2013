package fr.iutvalence.java.projets.towerdefense;

public class Element
{
	/**
	 * Emplacement de l'élément, représenté par un objet "Coordonnees"
	 */
	private Coordonnees pos;
	
	/**
	 * Type de l'élément, représenté par un objet "Coordonnees"
	 */
	private Type type;
	

	/**
	 * @param pos
	 */
	public void setPos(Coordonnees pos)
	{
		this.pos = pos;
	}

	/**
	 * Obtenir la position de l'élément
	 * @return La position de l'élément
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
