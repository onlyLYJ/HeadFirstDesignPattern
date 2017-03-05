import static util.Print.println;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {

	private float temp;
	private float hum;
	private float index;
	Observable obs;

	public HeatIndexDisplay(Observable obs) {
		super();
		obs.addObserver(this);
	}

	public void display() {
		System.out.println("Heat index: " + index);
	}


	private float currentindex(float t, float rh) {
	
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
			+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
			+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;

	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData wd = (WeatherData) obs;
			this.temp = wd.getTemperature();
			this.hum = wd.getHumidity();
			index = currentindex(temp,hum);
			display();
		}

	}

}
