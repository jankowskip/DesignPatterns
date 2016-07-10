
public class Start {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("MENU PANCAKE HOUSE", "BREAKFAST");
		MenuComponent uJackaMenu = new Menu("MENU U JACKA", "LUMCH");
		MenuComponent dinerMenu = new Menu("MENU DINER", "DINNERS");
		MenuComponent allMenus = new Menu("ALL MENUS", "polaczone");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(uJackaMenu);
		allMenus.add(dinerMenu);

		MenuComponent pancake = new MenuPosition("Pancake", "With vegetablaes", true, 2.99);
		pancakeHouseMenu.add(pancake);
		MenuComponent burger = new MenuPosition("Cheeseburger", "With meat", false, 3.99);
		uJackaMenu.add(burger);
		MenuComponent diner = new MenuPosition("Meat with fries", "With special sauce", false, 5.99);
		dinerMenu.add(diner);

		MenuComponent desertsMenu = new Menu("DESERT MENU", "SOMETHING SWEAT");
		MenuComponent iceCream = new MenuPosition("Ice cream", "With strawberry sauce", true, 1.99);
		desertsMenu.add(iceCream);

		dinerMenu.add(desertsMenu);

		Waitress waitress = new Waitress(allMenus);

		waitress.print();
		waitress.printVegetarian();

	}

}
