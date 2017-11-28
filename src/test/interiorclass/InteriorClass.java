package interiorclass;

import org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS;

/**
 * Created by wenzailong on 2017/9/26.
 */
public class InteriorClass {
    class Outer{

    }
    Outer back(){
        return new Outer();
    }
    public static void main(String[] args){
        InteriorClass interiorClass=new InteriorClass();
        Outer outer=interiorClass.back();
        System.out.println(outer);
    }
}
class Out{
    private int a=1;
    public int b=2;
    int c=3;
    public int d=4;
    protected int e=5;
    Out out=new Out();
    class Into{
        public void main(String[] args){
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c:"+c);
            System.out.println("d:"+d);
            System.out.println("e:"+e);
        }
    }
    Out outs=Out.this;
    Into into=out.new Into();
    public static void main(String[] args){
        Out out=new Out();
        System.out.println("a:"+out.a);
        System.out.println("b:"+out.b);
        System.out.println("c:"+out.c);
        System.out.println("d:"+out.d);
        System.out.println("e:"+out.e);
    }
}

interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}
class Parcel4{
    private class PContents implements  Contents{
        private int i=11;
        public int value(){return i;}
    }
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label=whereTo;
            System.out.print(label);
        }
        @Override
        public String readLabel() {
            return label;
        }

    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}
 class TestParcel{
    public static void  main (String[] args){
        Parcel4 p=new Parcel4();
        Contents c=p.contents();
        Destination d=p.destination("Tasmania");
    }
}