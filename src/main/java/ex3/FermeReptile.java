package ex3;

import java.util.ArrayList;
import java.util.List;

public class FermeReptile {

	private List<Animal> animalZone = new ArrayList<>();

	
	public void addAnimal(Animal animal) {
		if(animal.getType().equals(Types.REPTILE)){
			animalZone.add(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		for (Animal  animal: animalZone){
			System.out.println(animal.getNom());
		}
	}
	
	public int compterAnimaux(){
		return animalZone.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animalZone.size() * 0.1;
	}
}
