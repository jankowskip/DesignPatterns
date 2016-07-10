package pizza;

import ingredients.factoryAbstract.IngredientsFactory;

public class AmericanPepperoniPizza extends Pizza {
	IngredientsFactory ingredientsFactory;

	public AmericanPepperoniPizza(IngredientsFactory ingriedentsFactory) {
		this.ingredientsFactory = ingriedentsFactory;
		name = " American pepperoni Pizza";
	}

	public void prepare() {
		System.out.println("Prepare: " + name);
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();
		pepperoni = ingredientsFactory.createPepperoni();

	}
}
