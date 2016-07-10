
public class MenuPosition {
	String name;
	String description;
	boolean vegetarian;
	double price;

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

	public Boolean isVegetarian() {
		return vegetarian;
	}

	public Double getPrice() {
		return price;
	}

}
