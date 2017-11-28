package constrution;

import org.junit.Test;

/**
 * Created by wenzailong on 2017/8/18.
 */
public class CreateObject {
  /* @Test
    public void  crtObj(){
       A a=new A();
       System.out.println("创建完毕");
   }
   @Test
    public void dogTest(){
        Dog dog=new Dog();
        dog.bark(Demo1);
       dog.bark("Demo1");
       dog.bark(1L);
       dog.bark(Demo1,"Demo1");
       dog.bark("Demo1",Demo1);

   }

   public CreateObject thisTest(){
        System.out.println("想知道谁引用我吗");
         return this;
   }
   @Test
    public void  callThis(){
       CreateObject a=new CreateObject();
       CreateObject b=new CreateObject();
       System.out.println(a.thisTest());
       System.out.println(b.thisTest());
   }
   @Test
    public void test8(){
        B b=new B();
        b.fun1();

   }
}
class B{
    void fun1(){
        fun2();
        this.fun2();
    }
    void fun2(){}
        }
class A{
    public A() {
        System.out.println("这是构造器");
    }

}
class Dog{
    void Dog(String a){
        int c=3;
        int b=2;
        this.Dog(Demo1);
        this.Dog(2);
        this.Dog('a');
    }
    void Dog(int a){

    }
    void Dog(char a){

    }
    public void bark(int a){
        this.bark(Demo1,"Demo1");
        this.bark(Demo1);
        System.out.println("狗叫");
    }
    public void bark(String a){
        System.out.println("狗吠");
    }
    public void bark(long a){
        System.out.println("狗吼");
    }
    public void bark(String a,int b){
        System.out.println("我是黑");
    }
    public void bark(int b,String a){
        System.out.println("你否白");
    }
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.Dog("Demo1");
    }

}
class D{
    private int a;
    protected void finalize(D d){
        System.out.println("这个是垃圾回收方法吗！");
        if(0 != d.a){

        }else{
            System.gc();
        }
    }
    public static void main(String[] args){
        D d=new D();
        d.a=Demo1;
        d.finalize(d);

    }*/
}
