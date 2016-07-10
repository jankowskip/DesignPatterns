import java.util.Iterator;

public class MenuPosition extends MenuComponent { // leaf
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	public MenuPosition(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void print() {
		System.out.println("  " + getName());
		if (isVegetarian()) {
			System.out.print(" (v) ");
			System.out.print(", " + getPrice());
			System.out.print("     -- " + getDescription());
		}
	}

	public Iterator createIterator() {
		return new IteratorNull();
	}
}
