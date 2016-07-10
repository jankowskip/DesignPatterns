package pizza.factoryMethod;

import pizza.Pizza;

public abstract class Pizzeria {

	public enum PizzaType {
		Cheese, Pepperoni, Vegetarian;
	}

	public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza;
		pizza = createPizza(pizzaType);

		pizza.prepare();
		pizza.bake();
		pizza.slice();
		pizza.pack();

		return pizza;
	}

	public abstract Pizza createPizza(PizzaType pizzaType);

}
