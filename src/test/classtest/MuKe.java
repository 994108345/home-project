package classtest;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wenzailong on 2017/11/8.
 */
public class MuKe {
    @Test
    public void createClass(){
        Foo foo=new Foo();
        Class c1=Foo.class;
        Class c2 = foo.getClass();


        try {
            Class c3 = null;
             c3 = Class.forName("Muke");
            Foo foo1 =(Foo)c1.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
    class Foo{
        Foo(){
            System.out.println("come on");
        }
        public void test1(String a){
            System.out.println(a);

        }
    };

    @Test
    public void getMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MuKe muke= new MuKe();
        Foo foo = new Foo();
        Class c1 = Integer.class;
        Class c2 = Class.forName("classtest.MuKe");
        Class c3 = foo.getClass();
        Method m1 = c2.getMethod("test1", String.class);
        m1.invoke(muke,"woqunidaye");
        Method[] m2 = c1.getMethods();
        Constructor[] m3 = c1.getConstructors();
        for (Constructor constructor:m3) {
            System.out.println("构造方法名："+constructor.getName());
        }
        for (Method method : m2) {
            System.out.println("公共方法名："+method.getName());
        }
        System.out.println(m1.getName());
    }
    public void test1(String a){
        System.out.println(a);

    }

    @Test
    public void main (){
        moveProxy(new Student());
        moveProxy(new Teacher());
    }
    public void moveProxy(ProxyInterface proxyInterface){
        proxyInterface.run();
    }
}
interface ProxyInterface{
    void doSimething();
    void run();
    void somethingElse(String arg);
}
class Student implements  ProxyInterface{
    @Override
    public void run() {
        System.out.println("我是学生");
    }

    @Override
    public void somethingElse(String arg) {

    }

    @Override
    public void doSimething() {

    }
}
class Teacher implements ProxyInterface{
    @Override
    public void run() {
        System.out.println("我的老师");
    }
    @Override
    public void somethingElse(String arg) {

    }

    @Override
    public void doSimething() {

    }
}


