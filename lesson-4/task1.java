interface Forecast {
    int Temperature(int temp);

    final class FakeClass implements Forecast {
        @Override
        public int Temperature(int temp) {
            return 4;
        }
    }
}

class Weather {
    public final Forecast temperature;
    public Weather(Forecast temp) {
        this.temperature = temp;
    }

    public int todaysTemperature() {
        return (this.temperature.Temperature(1));
    }

    String todaysWeather() {
        return("Current temperature is " + todaysTemperature() + " degrees Celcius.");
    }
}

public class task1 {

	public static void main(String[] args) {
		Forecast forecast = new Forecast.FakeClass();
        Weather today = new Weather(forecast);
        String weather = today.todaysWeather();
        System.out.println(weather);
	}

}