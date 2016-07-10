
public class Start {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		ShowCurrentConditions conditions = new ShowCurrentConditions(weatherData);
		weatherData.setData(26.6f, 65.4f, 1010.1f);
		weatherData.setData(24.6f, 63.4f, 1050.1f);
		weatherData.setData(22.6f, 61.4f, 1100.1f);
	}

}
