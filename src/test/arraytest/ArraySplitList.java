package arraytest;

import com.alibaba.fastjson.JSON;
import com.mb.wzl.entity.User;
import org.junit.Test;

import java.util.*;

/**
 * Created by wenzailong on 2017/10/23.
 */
public class ArraySplitList {
    @Test
    public void splitTest(){
        String str = "a,b,c,,d,d,";
        String[] ary = str.split(",");
        // 预期大于 3，结果是 3
        System.out.println(ary[0]);
        System.out.println(ary.length);
    }
    @Test
    public void fpreachTest(){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }
    }
    @Test
    public void foreach(){
        List list = new LinkedList();
        LinkedList list1 = new LinkedList();
        /*list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");*/
        /*String firstElement = (String)list1.element();*/
       /* String firstElement1 = (String)list1.getFirst();*/
        String firstElement2 = (String)list1.peek();
        System.out.print(firstElement2);

    }
    @Test
    public void setList(){
        Set list = new HashSet();
        list.add("1");
        list.add("2");
        boolean isxit = list.contains("1");
        System.out.println("是否存在："+isxit);

    }


    public String finallyTest(){
        try {
            int i=10/0;
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            int a=1;int b=3;
            System.out.print(a);
            return null;
        }
    }

    @Test
    public void finalTest(){
        this.finallyTest();
    }
    @Test
    public void stringTest(){
        List list = new ArrayList();
        User user = new User();
        user.setName("大爷");
        user.setId("1");
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        int[] a={1,2,3,4,5,6,7};
        System.out.println(JSON.toJSONString(a));
        System.out.println(JSON.toJSONString(list));
        float f = 1.224854F;
        System.out.println(list.toString());
        System.out.printf("原来是占位符呀！%s %s","aaa","bbb");
        System.out.println(f);
    }

}
