package ex3;




/**
 * @author ETY0005
 * Classe zoo
 *
 */
public class Zoo {

	/** nom : String
	 * 
	 */
	private String nom;
	/** savaneAfricaine : SavaneAfricaine
	  */
	private SavaneAfricaine savaneAfricaine;
	/** zoneCarnivore : ZoneCarnivore
	 * 
	 */
	private ZoneCarnivore zoneCarnivore;
	/** fermeReptile : FermeReptile
	 * 
	 */
	private FermeReptile fermeReptile;
	/** aquarium : Aquarium
	 * 
	 */
	private Aquarium aquarium;

	/**Constructeur
	 * @param nom nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore = new ZoneCarnivore();
		fermeReptile = new FermeReptile();
		aquarium = new Aquarium();
	}

	/**Ajouter un animal dans le zoo
	 * @param animal animal à ajouter
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Types.MAMMIFERE) && animal.getComportement().equals(Comportement.CARNIVORE)) {
			zoneCarnivore.addAnimal(animal);
		} else if (animal.getType().equals(Types.MAMMIFERE)
				&& animal.getComportement().equals(Comportement.HERBIVORE)) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getType().equals(Types.REPTILE)) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getType().equals(Types.POISSON)) {
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * Affichers les animaux présent dans la zone
	 */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
