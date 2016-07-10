import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuPosition> menuPositions;

	public PancakeHouseMenu() {
		menuPositions = new ArrayList<MenuPosition>();

		addElement("pancake", "with strawberrys", true, 2.99);
		addElement("pancake", "with meat", false, 4.99);
		addElement("pancake", "with sausage", false, 3.99);
		addElement("pancake", "with apple", true, 1.99);

	}

	public void addElement(String name, String description, boolean vegetarian, double price) {
		MenuPosition menuPosition = new MenuPosition(name, description, vegetarian, price);
		menuPositions.add(menuPosition);
	}

	public Iterator createIterator() {
		return menuPositions.iterator();
	}
}
