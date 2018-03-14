package ex1;

/**
 * @author ETY0005 Class qui posséde deux méthode qui permettent de returner la
 *         somme et la différence deux nombres
 *
 */
public class Calcul {

	/**
	 * Methode qui permet d'additionner deux nombres
	 * 
	 * @param nombre1
	 *            premier nombres à additionner
	 * @param nombre2
	 *            deuxième nombres à additionner
	 * @return somme des deux nombres
	 */
	public int somme(int nombre1, int nombre2) {
		return nombre1 + nombre2;
	}

	/**
	 * @param nombre1
	 *            premier nombres à soustraire
	 * @param nombre2
	 *            deuxieme nombres à soustraire
	 * @return
	 */
	public int soustraction(int nombre1, int nombre2) {
		return nombre1 - nombre2;
	}
}
