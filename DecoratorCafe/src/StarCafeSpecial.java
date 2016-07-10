
public class StarCafeSpecial extends Beverage {
	private BeverageSize size;

	public StarCafeSpecial(BeverageSize size) {
		setDescription("Coffe Star Cafe Special" + " Size: " + size.toString());
		this.size = size;
	}

	public double cost() {
		if (size == BeverageSize.Big) {
			return 1.99;

		} else if (size == BeverageSize.Average) {
			return 1.49;

		} else {
			return 0.99;
		}

	}

	@Override
	public BeverageSize getSize() {
		return size;
	}
}
