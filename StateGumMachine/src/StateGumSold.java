
public class StateGumSold implements State {
	SellingMachine machine;

	public StateGumSold(SellingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void returnCoin() {
		System.out.println("we already gave you gum, you cant take coin");

	}

	@Override
	public void putCoin() {
		System.out.println("please wait for gum");

	}

	@Override
	public void rotateStick() {
		System.out.println("you wont get 2nd gum for 2nd rotate");
	}

	@Override
	public void giveGum() {
		machine.giveGum();
		if (machine.getNumber() > 0) {
			machine.setState(machine.getStateNoCoin());
		} else {
			System.out.println("we are ouf of gums");
			machine.setState(machine.getStateNoGum());
		}

	}

}
