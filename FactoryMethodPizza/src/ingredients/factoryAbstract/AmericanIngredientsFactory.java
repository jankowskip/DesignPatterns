package ingredients.factoryAbstract;

import ingredients.Cheese;
import ingredients.CheeseMozarella;
import ingredients.Dough;
import ingredients.Garlic;
import ingredients.Mushrooms;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.SauceAmericano;
import ingredients.SlicesPepperoni;
import ingredients.ThickDough;
import ingredients.Tomato;
import ingredients.Vegetables;

public class AmericanIngredientsFactory implements IngredientsFactory {

	@Override
	public Dough createDough() {

		return new ThickDough();
	}

	@Override
	public Sauce createSauce() {
		return new SauceAmericano();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new CheeseMozarella();
	}

	@Override
	public Vegetables[] createVegetables() {
		Vegetables vegetables[] = { new Tomato(), new Garlic(), new Mushrooms() };
		return vegetables;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicesPepperoni();
	}
}
