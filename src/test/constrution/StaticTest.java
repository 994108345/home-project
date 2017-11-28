package constrution;

import org.junit.Test;

/**
 * Created by wenzailong on 2017/8/18.
 */
public class StaticTest {

    @Test
    public void staticTest(){
        StaticDemo1 staticDemo1=new StaticDemo1();
        StaticDemo1 staticDemo2=new StaticDemo1();
    }
}
class StaticDemo1{
    static{
        System.out.println("听说只会创建一次");
    }
}
