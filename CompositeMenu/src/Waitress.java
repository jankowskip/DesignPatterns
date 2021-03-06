import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void print() {
		allMenus.print();
	}

	public void printVegetarian() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("Menu vegetarianskie");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();

			}
		}
	}
}
