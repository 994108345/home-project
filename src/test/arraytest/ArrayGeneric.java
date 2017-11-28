package arraytest;

import org.junit.Test;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzailong on 2017/11/9.
 */
public class ArrayGeneric {
    private static long counter;
    private final long id = counter++;
    @Test
    public void generic(){
        counter = 100L;
        System.out.println("counter"+counter);
        System.out.println("id"+id);
        counter = 1000L;
        System.out.println("counter"+counter);
        System.out.println("id"+id);
    }

    @Test
    public void arrayLength(){
        int[] a;
        int[] b = new int[]{1,2,3,4,5};
        int[] c = {2,3,4,5,6};
        StringUtils.print(c[2]+"");
        for(int i = 0; i < b.length; i++){
        }
    }
    @Test
    public void genericTest1(){
        List<String>[] ls;

    }
}
class BerylliumSphere{}
 class ArrayOfGrnerics{
     @SuppressWarnings("unchecked")
    public static void main (String[] args){
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List <String>[]) la;
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();
        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
        for (int i= 0; i < spheres.length;i++){
            spheres[i] = new ArrayList<BerylliumSphere>();
        }
    }
}



