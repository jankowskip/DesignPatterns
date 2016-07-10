import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_NUMBER_OF_ELEMENTS = 6;
	int numberOfElements;
	MenuPosition[] menuPositions;

	public DinerMenu() {
		menuPositions = new MenuPosition[MAX_NUMBER_OF_ELEMENTS];
		addElement("sandwich", "with vegetables", true, 2.99);
		addElement("sandwich", "with meat", false, 4.99);
		addElement("sandwich", "with sausage", false, 3.99);
		addElement("sandwich", "with fruits", true, 1.99);
	}

	public void addElement(String name, String description, boolean vegetarian, double price) {
		MenuPosition menuPosition = new MenuPosition(name, description, vegetarian, price);
		if (numberOfElements >= MAX_NUMBER_OF_ELEMENTS) {
			System.out.println("Menu is full");
		} else {
			menuPositions[numberOfElements] = menuPosition;
			numberOfElements = numberOfElements + 1;
		}
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuPositions);
	}

}
