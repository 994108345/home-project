package designpatterns.observer;

import java.util.ArrayList;

/**
 * Created by wenzailong on 2017/11/15.
 */
public class WeatherData implements  Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0 ){
            observers.remove(i);
        }
    }
    @Override
    /*把状态高数每一个观察者*/
    public void notifyObservers(){
        for (int i = 0; i< observers.size(); i++){
            Observer observer =(Observer) observers.get(i);
            observer.updare(temperature,humidity,pressure);
        }
    }
    /*当从气象站得到观测值，我们通知观察者*/
    public void measurementsChanged(){
        notifyObservers();
    }
    /**/
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
