package ingredients.factoryAbstract;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetables;

public interface IngredientsFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Vegetables[] createVegetables();

	public Pepperoni createPepperoni();

}
