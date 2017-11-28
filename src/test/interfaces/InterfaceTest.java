package interfaces;

/**
 * Created by wenzailong on 2017/9/26.
 */
public class InterfaceTest {
    void inteface(){
        System.out.println("class--interface");
    };
}
interface A{
    void a();

}

interface B extends A,C{
    void b();

}

interface C {
    void c();
    void look(String i);
}

interface D{
    int a=0;
    void d();
    void look();
}

interface E{
    void e();
}

class F implements C,D{
    void f(){};

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void look(String i) {

    }

    @Override
    public void look() {

    }
}

class Bird{
    interface fly{
        void fly();
    }
    public interface run{
        void run();
    }
    private interface eat{
        void eat();
    }
    class Dove implements fly,run,eat{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void eat() {

        }
    }
}
interface Animals{
    interface fly{
        void fly();
    }
    public interface run{
        void run();
    }
    interface eat{
        void eat();
    }
}
class eagle implements Animals.fly {
    @Override
    public void fly() {

    }
}
