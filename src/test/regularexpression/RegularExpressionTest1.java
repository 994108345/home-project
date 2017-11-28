package regularexpression;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by wenzailong on 2017/10/30.
 */
public class RegularExpressionTest1 {
    @Test
    public void demo1(){
        for (String pattern : new String[] {"Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*","R.*"})
        {
            System.out.println("Rudolph".matches(pattern));
        }
    }
    @Test
    public void demo2() {
        Scanner scanner = new Scanner("12,2,15,46,31,4,5");
        scanner.useDelimiter("\\s*,\\s*");
        while(scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }

    }
}
