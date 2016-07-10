import pizza.Pizza;
import pizza.factoryMethod.AmericanPizzeria;
import pizza.factoryMethod.ItalianPizzeria;
import pizza.factoryMethod.Pizzeria;
import pizza.factoryMethod.Pizzeria.PizzaType;

public class Start {
	public static void main(String[] args) {
		Pizzeria american = new AmericanPizzeria();
		Pizzeria italian = new ItalianPizzeria();

		Pizza pizza = italian.orderPizza(PizzaType.Cheese);
		System.out.println("Jack zamowil " + pizza.getName() + "\n");

		Pizza pizza2 = american.orderPizza(PizzaType.Vegetarian);
		System.out.println("Peter zamowil " + pizza2.getName() + "\n");
	}
}
