package pizza;

import ingredients.factoryAbstract.IngredientsFactory;

public class ItalianPepperoniPizza extends Pizza {
	IngredientsFactory ingredientsFactory;

	public ItalianPepperoniPizza(IngredientsFactory ingriedentsFactory) {
		this.ingredientsFactory = ingriedentsFactory;
		name = " Italian pepperoni Pizza";
	}

	public void prepare() {
		System.out.println("Prepare: " + name);
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();
		pepperoni = ingredientsFactory.createPepperoni();

	}

}
