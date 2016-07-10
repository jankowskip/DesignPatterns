package DuckModel;

import FlyModel.ActuallyFly;
import QuackModel.Quack;

public class ShovelerDuck extends Duck {

	public ShovelerDuck() {
		super(new ActuallyFly(), new Quack());
	}

	@Override
	public void show() {
		System.out.println("Im shoveler duck");

	}

}
