
public class SellingMachine {
	private State stateNoGum;
	private State stateNoCoin;
	private State stateCoinInside;
	private State stateGumSold;
	private State stateWinner;

	State state = stateNoGum;
	int number = 0; 

	public SellingMachine(int number) {
		stateNoGum = new StateNoGum(this);
		stateNoCoin = new StateNoCoin(this);
		stateCoinInside = new StateCoinInside(this);
		stateGumSold = new StateGumSold(this);
		stateWinner = new StateWinner(this);
		this.number = number;
		if (number > 0) {
			state = stateNoCoin;
		}
	}

	public void putCoin() {
		state.putCoin();
	}

	public void returnCoin() {
		state.returnCoin();

	}

	public void rotateStick() {
		state.rotateStick();
		state.giveGum();
	}

	public void giveGum() {
		System.out.println("Gum is comming");
		if (number != 0) {
			number = number - 1;
		}
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getStateNoGum() {
		return stateNoGum;
	}

	public State getStateCoinInside() {
		return stateCoinInside;
	}

	public State getStateNoCoin() {
		return stateNoCoin;
	}

	public State getStateGumSold() {
		return stateGumSold;
	}

	public State getStateWinner() {
		return stateWinner;
	}

	public int getNumber() {
		return number;
	}

}
