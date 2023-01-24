interface Forecast {
    int temperature(int temp);

    final class fakeClass implements Forecast {
        @Override
        public int temperature(int temp) {
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
        return (this.temperature.temperature(1));
    }

    String todaysWeather() {
        return("Current temperature is " + todaysTemperature() + " degrees Celcius.");
    }
}

public class task1 {

	public static void main(String[] args) {
		Forecast forecast = new Forecast.fakeClass();
        Weather today = new Weather(forecast);
        String weather = today.todaysWeather();
        System.out.println(weather);
	}

}