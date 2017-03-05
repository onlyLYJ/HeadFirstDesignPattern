import static util.Print.println;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float hum;
	Observable obervable;

	public CurrentConditionsDisplay(Observable obervable) {
		super();
		this.obervable = obervable;
		obervable.addObserver(this);
	}

	public void display() {
		System.out.println("Current condition: " + temp + "F degrees and "
				+ hum + "% humidity");
	}


	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData wd = (WeatherData) obs;
			this.temp = wd.getTemperature();
			this.hum = wd.getHumidity();
			display();
		}
		
	}

}
