package designpatterns.observer.javaobserver;

/**
 * Created by wenzailong on 2017/11/15.
 */
public interface Subject {
    /*注册观察者*/
    public void registerObserver(Observer o);
    /*注销观察者*/
    public void removeObserver(Observer o);
    /*状态改变时,通知所有观察者*/
    public void notifyObservers();
}
