package pizza;

import ingredients.factoryAbstract.IngredientsFactory;

public class ItalianVegetarianPizza extends Pizza {
	IngredientsFactory ingredientsFactory;

	public ItalianVegetarianPizza(IngredientsFactory ingriedentsFactory) {
		this.ingredientsFactory = ingriedentsFactory;
		name = " Italian vegetarian Pizza";
	}

	public void prepare() {
		System.out.println("Prepare: " + name);
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();
		vegetables = ingredientsFactory.createVegetables();

	}
}
