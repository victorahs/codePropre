package ex3;

import java.util.ArrayList;
import java.util.List;

public class SavaneAfricaine {

	/** animalZone : List<Animal>
	 * List d'animaux présent dans la zone
	 * 
	 */
	private List<Animal> animalZone = new ArrayList<>();

	/**Ajoute un animal présent dans la zone
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Comportement.HERBIVORE)) {
			animalZone.add(animal);
		}
	}

	/**Affiche la liste d'animaux présent dans la zone
	 * 
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animalZone) {
			System.out.println(animal.getNom());
		}
	}

	/**Comptes le nombre d'animaux présent dans la zone
	 * @return
	 */
	public int compterAnimaux() {
		return animalZone.size();
	}

	/**Calcule la quantité de nourriture en kilo par jours 
	 * @return
	 */
	public int calculerKgsNourritureParJour() {
		return animalZone.size() * 10;
	}
}
