
public class SoyMilk extends Component {
	Beverage beverage;

	public SoyMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", soy milk";
	}

	public double cost() {
		if (beverage.getSize() == BeverageSize.Big) {
			return beverage.cost() + 0.30;

		} else if (beverage.getSize() == BeverageSize.Average) {
			return beverage.cost() + 0.20;

		} else {
			return beverage.cost() + 0.10;
		}
	}

	public BeverageSize getSize() {
		return beverage.getSize();
	}
}
