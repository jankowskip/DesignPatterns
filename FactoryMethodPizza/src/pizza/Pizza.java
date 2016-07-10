package pizza;

import java.util.ArrayList;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetables;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Vegetables vegetables[];
	Cheese cheese;
	Pepperoni pepperoni;

	ArrayList<String> additives = new ArrayList<String>();

	public abstract void prepare();

	public void bake() {
		System.out.println("Baking in temperature: 350 for 25 mins");
	}

	public void slice() {
		System.out.println("cuts into 8 parts");
	}

	public void pack() {
		System.out.println("packaged in a corporate box");
	}

	public String getName() {
		return name;
	}

}
