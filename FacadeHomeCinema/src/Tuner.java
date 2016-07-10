
public class Tuner {
	private Amplifer amplif;

	public void turnOn() {
		System.out.println(getClass().getSimpleName() + " On");
	}

	public void turnOff() {
		System.out.println(getClass().getSimpleName() + " OFF");
	}

	public void setRangeAM() {
		System.out.println(getClass().getSimpleName() + " range AM");
	}

}
