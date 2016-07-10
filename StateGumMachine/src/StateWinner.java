
public class StateWinner implements State {
	SellingMachine machine;

	public StateWinner(SellingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void returnCoin() {
		System.out.println("there is no coin");

	}

	@Override
	public void putCoin() {
		System.out.println("you won gums");

	}

	@Override
	public void rotateStick() {
		System.out.println("2nd rotate wont help you");

	}

	@Override
	public void giveGum() {
		System.out.println("YOU WON! 2nd gums is free");
		machine.giveGum();
		if (machine.getNumber() == 0) {
			machine.setState(machine.getStateNoGum());

		} else {
			machine.giveGum();
			if (machine.getNumber() > 0) {
				machine.setState(machine.getStateNoCoin());
			} else {
				System.out.println("we are out of gums");
				machine.setState(machine.getStateNoGum());
			}
		}

	}

}
