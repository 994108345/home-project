package designpatterns.observer;

/**
 * Created by wenzailong on 2017/11/15.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float hudimity;
    private Subject weatherData;//只是为了方便以后注销观察者
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    /*我们把温度和湿度保存起来*/
    @Override
    public void updare(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.hudimity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + hudimity + "% humidity");
    }
}
