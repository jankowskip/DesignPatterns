
public class PlayerCD {
	private Amplifer amp;

	public void turnOn() {
		System.out.println(getClass().getSimpleName() + " On");
	}

	public void turnOff() {
		System.out.println(getClass().getSimpleName() + " OFF");
	}

	public void setCD() {
		System.out.println(getClass().getSimpleName() + " cd set");
	}

	public void pause() {
		System.out.println(getClass().getSimpleName() + " pause");
	}

	public void play() {
		System.out.println(getClass().getSimpleName() + " play");
	}

}
