package ex3;

public class Animal {

	/** nom : String
	  
	 */
	private String nom;

	/** comportement : Comportement
	 * 
	 */
	private Comportement comportement;

	/** type : Types
	 * 
	 */
	private Types type;

	/**
	 * @param nom nom 
	 * @param comportement comportement
	 * @param type type
	 */
	public Animal(String nom, Comportement comportement, Types type) {
		// TODO Auto-generated constructor stub

		this.nom = nom;
		this.comportement = comportement;
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
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public Types getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(Types type) {
		this.type = type;
	}

}
