package classtest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wenzailong on 2017/11/9.
 */
public class ReflectProxy {

}

/**
 * 接口类
 */
interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

/**
 *工具类
 */
class DynamicProxyHandler implements InvocationHandler{
    private Object proxied;
    public  DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy;" + proxy.getClass() + ". method; " + method + ". args;" + args );
        if (args != null){
            for (Object arg : args) {
                System.out.println(" " + args);
            }
        }
        return method.invoke(proxied , args);
    }
}

/**
 *运行类
 */
class SompleDynamicProxy{
    public static void consumer (Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String [] args)
    {
        RealObject real =new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}

/**
 *真实对象
 */
class RealObject implements  Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse" + arg);
    }
}

/**
 *简单对象
 */
class SimpleProxy implements  Interface{
    private Interface proxied;
    public SimpleProxy (Interface proxied){
        this.proxied = proxied;
    }
    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }
    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse" + arg);
        proxied.somethingElse(arg);
    }
}
