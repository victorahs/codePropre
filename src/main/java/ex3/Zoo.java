package ex3;

import com.sun.glass.ui.CommonDialogs.Type;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		if (animal.getType().equals(Types.MAMMIFERE) && animal.getComportement().equals(Comportement.CARNIVORE)){
			zoneCarnivore.addAnimal(animal.getType(), animal.getNom(), animal.getComportement());
		}
		else if (animal.getType().equals(Types.MAMMIFERE) && animal.getComportement().equals(Comportement.HERBIVORE)){
			savaneAfricaine.addAnimal(animal.getType(), animal.getNom(), animal.getComportement());
		}
		else if (animal.getType().equals(Types.REPTILE)){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getType().equals(Types.POISSON)){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
