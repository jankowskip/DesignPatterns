package DuckModel;

import FlyModel.ActuallyFly;
import FlyModel.CantFly;
import QuackModel.Quack;
import QuackModel.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new CantFly(), new Squeak());
	}

	@Override
	public void show() {
		System.out.println("Im rubber duck");

	}

}
