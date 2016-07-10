package DuckModel;

import FlyModel.FlyInterface;
import QuackModel.QuackInterface;

public abstract class Duck {
	private FlyInterface flyInterface;
	private QuackInterface quackInterface;

	public Duck(FlyInterface fi, QuackInterface qi) {
		flyInterface = fi;
		quackInterface = qi;
	}

	public void setBehaviorFly(FlyInterface fi) {
		flyInterface = fi;
	}

	public void setBehaviorQuack(QuackInterface qi) {
		quackInterface = qi;
	}

	public abstract void show();

	public void doFly() {
		flyInterface.fly();
	}

	public void doQuack() {
		quackInterface.quack();
	}

	public void swim() {
		System.out.println("Every duck can swim, even fake one");
	}
}
