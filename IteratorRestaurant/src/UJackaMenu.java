import java.util.HashMap;
import java.util.Iterator;

public class UJackaMenu implements Menu {
	HashMap menuPositions = new HashMap();

	public UJackaMenu() {
		addElement("Pizza", "Papperoni", false, 9.99);
	}

	public void addElement(String name, String description, boolean vegetarian, double price) {
		MenuPosition menuPosition = new MenuPosition(name, description, vegetarian, price);
		menuPositions.put(menuPosition.getName(), menuPosition);
	}

	@Override
	public Iterator createIterator() {
		return menuPositions.values().iterator();
	}

}
