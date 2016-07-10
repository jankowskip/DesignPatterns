
public class FacadeHomeCinema {
	private Amplifer amplifer;
	private Tuner tuner;
	private PlayerCD playerCD;
	private PlayerDVD playerDVD;
	private Projector projector;
	private Lights lights;
	private Screen screen;
	private PopcornMachine popcorn;

	public FacadeHomeCinema(Amplifer amplifer, Tuner tuner, PlayerCD playerCD, PlayerDVD playerDVD, Projector projector,
			Lights lights, Screen screen, PopcornMachine popcorn) {
		this.amplifer = amplifer;
		this.tuner = tuner;
		this.playerCD = playerCD;
		this.playerDVD = playerDVD;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popcorn = popcorn;
	}

	public void playMovie() {
		amplifer.TurnOn();
		tuner.turnOn();
		playerCD.turnOn();
		playerDVD.turnOn();
		projector.turnOn();
		lights.turnOn();
		screen.turnOn();
		popcorn.turnOn();
	}

	public void endMovie() {
		amplifer.turnOff();
		tuner.turnOff();
		playerCD.turnOff();
		playerDVD.turnOff();
		projector.turnOff();
		lights.turnOff();
		screen.turnOff();
		popcorn.turnOff();
	}
}
