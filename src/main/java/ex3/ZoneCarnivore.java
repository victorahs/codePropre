package ex3;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore {

	/** animalZone : List<Animal>
	 * Liste d'animaux présent dans la zone
	 */
	private List<Animal> animalZone = new ArrayList<>();

	/**Ajoute un animal dans la zone
	 * @pararm animal animal à ajouter dans la zone
	 */
	public void addAnimal(Animal animal) {
		if (animal.getComportement().equals(Comportement.HERBIVORE)) {
			animalZone.add(animal);
		}

	}

	/**
	 * Afficher les animaux présent dans la zone
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animalZone) {
			System.out.println(animal.getNom());
		}
	}

	/**Compter le nombre d'animaux présent dans la zone
	 * @return
	 */
	public int compterAnimaux() {
		return animalZone.size();
	}

	/**Calcule en kilo la quantité de nouriture par jours
	 * @return
	 */
	public double calculerKgsNourritureParJour() {
		return animalZone.size() * 10;
	}
}
