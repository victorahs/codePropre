package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	private static final int DECOUVERT = 0;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 
	 * @param solde représente le solde du compte
	 *            
	 * @param decouvert  représente le découvert autorisé
	 *           
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 *    
	 */
	public LivretA(double solde, double tauxRemuneration) {

		super(solde, DECOUVERT);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {

		this.solde = solde + solde * tauxRemuneration / 100;
	}
}
