package ex3;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

	/**
	 * animalZone : List<Animal> List d'animaux présent dans la zone
	 */
	List<Animal> animalZone = new ArrayList<>();

	/**Ajoute un animal dans la zone
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Types.POISSON)) {
			animalZone.add(animal);
		}
	}

	/**
	 * Affiche la liste d'animaux présent dans la zone
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animalZone) {
			System.out.println(animal.getNom());
		}
	}

	/**Calcule en kilo la quantité de nourriture à donné par jours
	 * @return
	 */
	public double calculerKgsNourritureParJour() {
		return animalZone.size() * 0.2;
	}
}
