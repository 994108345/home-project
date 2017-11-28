package polymorphism;

/**
 * Created by wenzailong on 2017/9/26.
 */
public class Bird {
    public  void fly(){
        System.out.println("I am a bird,i will flay");
    }
    private  void eat(){//只有public的方法才会被覆盖
        System.out.println("I am a bird,I like eatting the worms");
    }
     public static void main(String[] args){
        Bird bird=new Dove();
        bird.eat();
     }
}
class Dove extends Bird{
    public void fly(){
        System.out.println("I am a Dove,i will flay");
    }
    public void eat(){
        System.out.println("I am a Dove,I like eatting the worms");
    }
    public void deliverLetters(){
        System.out.println("I am a dove,i can deliver the letters");
    }
}
class Eagle extends Bird{
    public void fly(){
        System.out.println("I am a Eagle,i will flay");
    }
    public void eat(){
        System.out.println("I am a Eagle,I like eatting the worms");
    }
}
class Sparrow extends Bird{
    public void fly(){
        System.out.println("I am a Sparrow,i will flay");
    }
    public void eat(){
        System.out.println("I am a Sparrow,I like eatting the worms");
    }
}
class eyes extends Sparrow{
    public void fly(){
        System.out.println("I am a eyes,i will flay");
    }
    public void eat(){
        System.out.println("I am a Sparrow,I like eatting the worms");
    }
}

class Animal{
    public static void fly(Bird bird){
        bird.fly();
    }
    public static void flyAll(Bird[] birds){
        for (Bird bird:birds){
            fly(bird);
        }
    }
    public static void main(String[] args){
        Bird[] birds={
                new Dove(),
                new Eagle(),
                new Sparrow(),
                new eyes()
        };
        flyAll(birds);
    }
}
class BirdArrea{
    public static void main(String[] args){
        Bird bird=new Dove();
        bird.fly();
        Dove dove=new Dove();
        dove.fly();
    }
}
class Man{
    void draw(){System.out.println("Man draw");}
    Man(){
        System.out.println("Man  before draw ");
        draw();
        System.out.println("Man  after draw ");
    }
}
class Woman extends Man{
    private int radius=1;
    Woman(int r){
       radius=r;
       System.out.println("Woman.radius="+radius);
    }
    void draw(){
        System.out.println("woman.draw.radius="+radius);
    }
}
class Person{
    public static void main(String[] args){
        new Woman(5);
    }
}
class BirdTest1{
    public static void main(){
        Bird bird=new Dove();
    }
}
class DownType{
    public static void main(String[] args){
        Bird bird=new Bird();
        Bird dove=new Dove();
        bird.fly();
        dove.fly();
        dove=(Dove)dove;
        ((Dove) dove).deliverLetters();
        bird=(Dove)bird;
        ((Dove) bird).deliverLetters();
    }
}