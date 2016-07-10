package DuckModel;

import FlyModel.ActuallyFly;
import QuackModel.Quack;

public class WildDuck extends Duck {

	public WildDuck() {
		super(new ActuallyFly(), new Quack());
	}

	@Override
	public void show() {
		System.out.println("Im  a wild, wild duck");

	}

}
