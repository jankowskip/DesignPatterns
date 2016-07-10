package ingredients.factoryAbstract;

import ingredients.Cheese;
import ingredients.CheeseReggiano;
import ingredients.Dough;
import ingredients.Garlic;
import ingredients.Mushrooms;
import ingredients.Onion;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.SauceMarinara;
import ingredients.SlicesPepperoni;
import ingredients.ThinDough;
import ingredients.Vegetables;

public class ItalianIngredientsFactory implements IngredientsFactory {

	@Override
	public Dough createDough() {

		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		return new SauceMarinara();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new CheeseReggiano();
	}

	@Override
	public Vegetables[] createVegetables() {
		Vegetables vegetables[] = { new Onion(), new Garlic(), new Mushrooms() };
		return vegetables;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicesPepperoni();
	}

}
