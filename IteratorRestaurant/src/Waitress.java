import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList menu;

	public Waitress(ArrayList menu) {
		this.menu = menu;
	}

	public void printMenu() {

		Iterator menuIterator = menu.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = (Menu) menuIterator.next();
			printMenu(menu.createIterator());

		}
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuPosition menuPosition = (MenuPosition) iterator.next();
			System.out.println(menuPosition.getName() + ", ");
			System.out.println(menuPosition.getDescription() + " -- ");
			System.out.println(menuPosition.getPrice());
		}

	}

}
