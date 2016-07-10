
public class StateNoGum implements State {
	SellingMachine machine;

	public StateNoGum(SellingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void returnCoin() {
		System.out.println("you didnt put coin inside");

	}

	@Override
	public void putCoin() {
		System.out.println("You cant put coin when machine is empty");

	}

	@Override
	public void rotateStick() {
		System.out.println("Machine is empty");

	}

	@Override
	public void giveGum() {
		System.out.println("machine is empty");

	}

}
