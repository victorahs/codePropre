package ex1;

/**
 * @author ETY0005 Class qui poss�de deux m�thode qui permettent de returner la
 *         somme et la diff�rence deux nombres
 *
 */
public class Calcul {

	/**
	 * Methode qui permet d'additionner deux nombres
	 * 
	 * @param nombre1
	 *            premier nombres � additionner
	 * @param nombre2
	 *            deuxi�me nombres � additionner
	 * @return somme des deux nombres
	 */
	public int somme(int nombre1, int nombre2) {
		return nombre1 + nombre2;
	}

	/**
	 * @param nombre1
	 *            premier nombres � soustraire
	 * @param nombre2
	 *            deuxieme nombres � soustraire
	 * @return
	 */
	public int soustraction(int nombre1, int nombre2) {
		return nombre1 - nombre2;
	}
}
