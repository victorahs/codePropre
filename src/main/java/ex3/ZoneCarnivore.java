package ex3;

import java.util.List;

public class ZoneCarnivore {

	private List<Types> types;
	private List<String> noms;
	private List<Comportement> comportements;
	
	public void addAnimal(Types type, String nomAnimal, Comportement comportement) {
		types.add(type);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
