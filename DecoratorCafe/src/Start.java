
public class Start {

	public static void main(String[] args) {
		Beverage beverage = new Espresso(BeverageSize.Big);
		System.out.println(beverage.getDescription() + " " + beverage.cost());

		Beverage beverage2 = new StarCafeSpecial(BeverageSize.Average);
		beverage2 = new Chocolate(beverage2);
		beverage2 = new SoyMilk(beverage2);
		beverage2 = new SoyMilk(beverage2);
		System.out.println(beverage2.getDescription() + " " + beverage2.cost());

	}

}
