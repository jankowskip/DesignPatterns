import java.util.Random;

public class StateCoinInside implements State {
	Random randomWin = new Random(System.currentTimeMillis());
	SellingMachine machine;

	public StateCoinInside(SellingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void returnCoin() {
		System.out.println("Returning coin");
		machine.setState(machine.getStateNoCoin());

	}

	@Override
	public void putCoin() {
		System.out.println("Coin is already inside, you cant put two");
	}

	@Override
	public void rotateStick() {
		System.out.println("rotating stick");
		int win = randomWin.nextInt(10);
		if (win == 0) {
			machine.setState(machine.getStateWinner());
		} else {
			machine.setState(machine.getStateGumSold());
		}
	}

	@Override
	public void giveGum() {
		System.out.println("Nie wydano gumy");
	}

}
