package ex3;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.control.skin.FXVK.Type;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", Comportement.HERBIVORE, Types.MAMMIFERE));
		zoo.addAnimal(new Animal("Zèbre", Comportement.HERBIVORE, Types.MAMMIFERE));
		zoo.addAnimal(new Animal("Lion", Comportement.HERBIVORE, Types.MAMMIFERE));
		zoo.addAnimal(new Animal("Panthère", Comportement.CARNIVORE, Types.MAMMIFERE));
		zoo.addAnimal(new Animal("Requin blanc", Comportement.HERBIVORE, Types.POISSON));
		zoo.addAnimal(new Animal("Truite dorée", Comportement.HERBIVORE, Types.POISSON));
		zoo.addAnimal(new Animal("Boa constrictor", Comportement.CARNIVORE, Types.SERPENT));
		zoo.addAnimal(new Animal("Python", Comportement.CARNIVORE, Types.SERPENT));
	}

}
