import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent { // composite
	ArrayList menuComponents = new ArrayList();
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getDescendant(int i) {
		return (MenuComponent) menuComponents.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.println(getName());
		System.out.println(getDescription());
		System.out.println("------------");

		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponents = (MenuComponent) iterator.next();
			menuComponents.print();
		}
	}

	public Iterator createIterator() {
		return new IteratorComposite(menuComponents.iterator());
	}
}
