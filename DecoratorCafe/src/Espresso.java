
public class Espresso extends Beverage {
	private BeverageSize size;

	public Espresso(BeverageSize size) {
		setDescription("Coffe Espresso" + " Size: " + size.toString());
		this.size = size;
	}

	@Override
	public double cost() {
		if (size == BeverageSize.Big) {
			return 1.79;

		} else if (size == BeverageSize.Average) {
			return 1.29;

		} else {
			return 0.89;
		}
	}

	@Override
	public BeverageSize getSize() {
		return size;
	}
}
