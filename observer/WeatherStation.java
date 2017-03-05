
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
		HeatIndexDisplay hd = new HeatIndexDisplay(wd);
		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(50, 165, 60.4f);

	}

}
