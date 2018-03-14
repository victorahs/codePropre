package ex3;

import java.util.List;

public class SavaneAfricaine {

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
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
