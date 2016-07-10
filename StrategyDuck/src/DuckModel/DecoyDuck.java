package DuckModel;

import FlyModel.ActuallyFly;
import FlyModel.CantFly;
import QuackModel.Quack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(new CantFly(), new Quack());
	}

	@Override
	public void show() {
		System.out.println("Im decoy duck");

	}

}
