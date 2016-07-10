package pizza;

import ingredients.factoryAbstract.IngredientsFactory;

public class ItalianCheesePizza extends Pizza {
	IngredientsFactory ingredientsFactory;

	public ItalianCheesePizza(IngredientsFactory ingriedentsFactory) {
		this.ingredientsFactory = ingriedentsFactory;
		name = " Italian Cheese Pizza";
	}

	public void prepare() {
		System.out.println("Prepare: " + name);
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();

	}
}
