
public class Amplifer {
	private Tuner tuner;
	private PlayerDVD playerDvd;
	private PlayerCD playerCD;

	public void TurnOn() {
		System.out.println(getClass().getSimpleName() + " ON");
	}

	public void turnOff() {
		System.out.println(getClass().getSimpleName() + " OFF");
	}

	public void setCD() {
		System.out.println(getClass().getSimpleName() + " Set CD");
	}

	public void setDVD() {
		System.out.println(getClass().getSimpleName() + " set DVD");
	}

	public void setStereoSound() {
		System.out.println(getClass().getSimpleName() + " set stereo sound");
	}

	public void setTuner() {
		System.out.println(getClass().getSimpleName() + " set tuner");
	}

	public void setVolume() {
		System.out.println(getClass().getSimpleName() + " set volume");
	}

}
