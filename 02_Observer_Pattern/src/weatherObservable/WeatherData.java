package weatherObservable;

import java.util.Observable;

/**
 * @author Dell
 * @create 2019-04-16 12:54
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {

        return humidity;
    }

    public float getTemperature() {

        return temperature;
    }

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
