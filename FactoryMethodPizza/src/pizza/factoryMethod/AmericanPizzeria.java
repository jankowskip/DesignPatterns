package pizza.factoryMethod;

import ingredients.factoryAbstract.AmericanIngredientsFactory;
import pizza.AmericanCheesePizza;
import pizza.AmericanPepperoniPizza;
import pizza.AmericanVegeterianPizza;
import pizza.Pizza;

public class AmericanPizzeria extends Pizzeria {

	@Override
	public Pizza createPizza(PizzaType pizzaType) {
		switch (pizzaType) {
		case Cheese:
			return new AmericanCheesePizza(new AmericanIngredientsFactory());
		case Pepperoni:
			return new AmericanPepperoniPizza(new AmericanIngredientsFactory());
		case Vegetarian:
			return new AmericanVegeterianPizza(new AmericanIngredientsFactory());
		}
		throw new IllegalArgumentException("the pizza type " + pizzaType + "is not recognized");
	}

}
