
public class Start {

	public static void main(String[] args) {
		Amplifer amp = new Amplifer();
		Lights light = new Lights();
		PlayerCD playerCD = new PlayerCD();
		PlayerDVD playerDVD = new PlayerDVD();
		PopcornMachine popcorn = new PopcornMachine();
		Projector projector = new Projector();
		Screen screen = new Screen();
		Tuner tuner = new Tuner();

		FacadeHomeCinema facade = new FacadeHomeCinema(amp, tuner, playerCD, playerDVD, projector, light, screen, popcorn);
		facade.playMovie();
		facade.endMovie();
	}

}
