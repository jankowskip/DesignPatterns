
public class Chocolate extends Component {
	Beverage beverage;

	public Chocolate(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Chocolate";
	}

	public double cost() {
		if (beverage.getSize() == BeverageSize.Big) {
			return beverage.cost() + 0.40;

		} else if (beverage.getSize() == BeverageSize.Average) {
			return beverage.cost() + 0.30;

		} else {
			return beverage.cost() + 0.20;
		}
	}

	@Override
	public BeverageSize getSize() {
		return beverage.getSize();
	}

}
