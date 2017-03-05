import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	
	public void setMeasurements(float temp, float hum, float pre) {
		temperature = temp;
		humidity = hum;
		pressure = pre;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}



	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}
}
