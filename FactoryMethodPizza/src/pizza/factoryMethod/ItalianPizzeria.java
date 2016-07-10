package pizza.factoryMethod;

import ingredients.factoryAbstract.ItalianIngredientsFactory;
import pizza.ItalianCheesePizza;
import pizza.ItalianPepperoniPizza;
import pizza.ItalianVegetarianPizza;
import pizza.Pizza;

public class ItalianPizzeria extends Pizzeria {

	@Override
	public Pizza createPizza(PizzaType pizzaType) {
		switch (pizzaType) {
		case Cheese:
			return new ItalianCheesePizza(new ItalianIngredientsFactory());
		case Pepperoni:
			return new ItalianPepperoniPizza(new ItalianIngredientsFactory());
		case Vegetarian:
			return new ItalianVegetarianPizza(new ItalianIngredientsFactory());
		}
		throw new IllegalArgumentException("the pizza type " + pizzaType + "is not recognized");
	}
}
