import DuckModel.Duck;
import DuckModel.RubberDuck;
import DuckModel.WildDuck;
import FlyModel.CantFly;
import QuackModel.Squeak;

public class Start {

	public static void main(String[] args) {
		Duck wild = new WildDuck();
		Duck rubber = new RubberDuck();

		wild.show();
		wild.doFly();
		wild.doQuack();
		wild.setBehaviorFly(new CantFly()); // this is how you can implement public void shoot(Duck d) for Hunter class
		wild.setBehaviorQuack(new Squeak());
		wild.doFly();
		wild.doQuack();

	}

}
