import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> list;

	public WeatherData() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		list.add(o);

	}

	@Override
	public void deleteObserver(Observer o) {
		list.remove(o);

	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).update(temp, humidity, pressure);
		}

	}

	public void setData(float temp, float hum, float press) {
		this.temp = temp;
		this.humidity = hum;
		this.pressure = press;
		notifyObserver();

	}

}
