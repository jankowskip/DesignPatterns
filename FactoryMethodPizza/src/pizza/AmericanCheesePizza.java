package pizza;

import java.util.ArrayList;

import ingredients.factoryAbstract.IngredientsFactory;

public class AmericanCheesePizza extends Pizza {
	IngredientsFactory ingredientsFactory;

	public AmericanCheesePizza(IngredientsFactory ingriedentsFactory) {
		this.ingredientsFactory = ingriedentsFactory;
		name = " American cheese Pizza";
	}

	@Override
	public void prepare() {
		System.out.println("Prepare: " + name);
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();

	}

}
