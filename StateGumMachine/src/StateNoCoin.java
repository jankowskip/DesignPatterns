
public class StateNoCoin implements State {
	SellingMachine machine;

	public StateNoCoin(SellingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void returnCoin() {
		System.out.println("there is no coin inside");

	}

	@Override
	public void putCoin() {
		System.out.println("Coin accepted");
		machine.setState(machine.getStateCoinInside());

	}

	@Override
	public void rotateStick() {
		System.out.println("put coin inside first");

	}

	@Override
	public void giveGum() {
		System.out.println("no coin, no gum");

	}

}
