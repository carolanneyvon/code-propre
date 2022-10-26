package ex3;

/**
 * @author Carolanne
 *
 */
public class Animal {

	/** famille de l'animal */
	protected String type;
	/** nom de l'animal */
	protected String nom;
	/** comportement de l'animal */
	protected String comportment;

	/**
	 * @param type
	 * @param nom
	 * @param comportment
	 */
	public Animal(String type, String nom, String comportment) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportment = comportment;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", nom=" + nom + ", comportment=" + comportment + "]";
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param famille the famille to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the comportment
	 */
	public String getComportment() {
		return comportment;
	}

	/**
	 * Setter
	 * 
	 * @param comportment the comportment to set
	 */
	public void setComportment(String comportment) {
		this.comportment = comportment;
	}

}
