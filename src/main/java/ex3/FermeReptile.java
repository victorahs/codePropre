package ex3;

import java.util.ArrayList;
import java.util.List;

public class FermeReptile {

	/** animalZone : List<Animal>
	 * Liste d'animaux présent dans la zone
	 * 
	 */
	private List<Animal> animalZone = new ArrayList<>();

	
	/**Ajoute un animal dans la zone
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		if(animal.getType().equals(Types.REPTILE)){
			animalZone.add(animal);
		}
	}
	
	/**Affiche la liste d'animaux présent dans la zone
	 * 
	 */
	public void afficherListeAnimaux(){
		for (Animal  animal: animalZone){
			System.out.println(animal.getNom());
		}
	}
	
	/**Compte le nombre d'animaux présent dans la zone
	 * @return
	 */
	public int compterAnimaux(){
		return animalZone.size();
	}
	
	/**Calcule en kilo la quantité de nourriture par jours
	 * @return
	 */
	public double calculerKgsNourritureParJour(){
		return animalZone.size() * 0.1;
	}
}
