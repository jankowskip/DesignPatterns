
public class ShowCurrentConditions implements ShowElements, Observer {
	private float temperature;
	private float humidity;
	private float pressure;

	public ShowCurrentConditions(Subject s) {
		s.registerObserver(this);

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		show();

	}

	@Override
	public void show() {
		System.out.println("**********Show Current Weather: **************");
		System.out.println("Temperature: " + temperature);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure);

	}

}
