package ex3;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

	private List<Animal> animalZone = new ArrayList<>();

	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Types.POISSON)) {
			animalZone.add(animal);
		}
	}

	public void afficherListeAnimaux() {
		for (Animal animal : animalZone) {
			System.out.println(animal.getNom());
		}
	}

	public double calculerKgsNourritureParJour() {
		return animalZone.size() * 0.2;
	}
}
