import java.util.ArrayList;
import java.util.LinkedList;

public class Start {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		UJackaMenu uJackaMenu = new UJackaMenu();
		ArrayList menu = new ArrayList<>();
		menu.add(pancakeHouseMenu);
		menu.add(dinerMenu);
		menu.add(uJackaMenu);
		Waitress waitress = new Waitress(menu);
		waitress.printMenu();

	}

}
