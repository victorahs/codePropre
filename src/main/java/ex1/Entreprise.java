package ex1;

import java.util.Date;

public class Entreprise {

	/** siret : int */

	int siret;

	/** nom : String */

	String nom;

	/** adresse : String */

	Adresse adresse;

	/** dateCreation : Date */

	Date dateCreation;

	/** CAPITAL_MAX : int */

	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Methode qui permet d'afficher le status
	 * 
	 */
	public void afficherStatut() {

	}

	/**
	 * Getter
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 * 
	 * @param siret
	 *            the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
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
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 * 
	 * @param dateCreation
	 *            the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
