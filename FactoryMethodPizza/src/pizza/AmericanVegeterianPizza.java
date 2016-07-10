package pizza;

import ingredients.factoryAbstract.IngredientsFactory;

public class AmericanVegeterianPizza extends Pizza {
	IngredientsFactory ingredientsFactory;
	public AmericanVegeterianPizza(IngredientsFactory ingriedentsFactory) {
		this.ingredientsFactory = ingriedentsFactory;
		name = " American vegetarian Pizza";
	}
	
	public void prepare() {
		System.out.println("Prepare: " +  name);
		dough = ingredientsFactory.createDough();
		sauce = ingredientsFactory.createSauce();
		cheese = ingredientsFactory.createCheese();
		vegetables = ingredientsFactory.createVegetables();
		
	}
}
