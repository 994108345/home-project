package readjdk.string;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenzailong on 2017/11/27.
 */
public class StringFile {
    String a = "1";
    int c = 1;
    Map map = new HashMap();
    @Test
    public void testDemo(){
        String b = a;
        b = "3";
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    @Test
    public void testDemo1(){
        map.put(1,1);
        testString(c);
        testString(map);
    }

    public void testString(int i){
        i = 3;
        System.out.println("c:" + c);
        System.out.println("i:" + i);
    }
    public void testString(String  j){
        j = j+"1";
        System.out.println("a:"+a);
        System.out.println("j:"+j);
    }
    public void testString(Map  hashMap){
        hashMap.put(2,2);
        System.out.println("map:"+map.size());
        System.out.println("hashMap:"+hashMap.size());
    }
}
