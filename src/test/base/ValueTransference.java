package base;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.dyuproject.protostuff.MapSchema.MessageFactories.HashMap;

/**
 * Created by 99410 on 2017/11/27.
 */
public class ValueTransference {
    int a = 1;
    List list = null;
    Map map1 =new HashMap();
    Map hashmap1 = null;
    User user;
    String b;
    @Test
    public void demoTest(){
        map1.put(1,1);
        test1(a,user);
        test1(map1);
    }
    public void test1(int i,User user1){
        i++;
        System.out.println("a:"+a);
        System.out.println("i:"+i);

        if(b==null){
            System.out.println("b:"+b);
        }
        if(user1 == null){
            System.out.println("user1:"+user1);
        }
    }
    public void test1(Map map){
        map.put(2,2);
        System.out.println("map:"+map.size());
        System.out.println("map1:"+map1.size());
    }
}

class User{
    String name;
}
