package designpatterns.observer.javaobserver;

import java.util.Observable;

/**
 * Created by wenzailong on 2017/11/15.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){

    }

    /*当从气象站得到观测值，我们通知观察者*/
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    /**/
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
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
