package reflection;

import org.junit.Test;

import java.lang.reflect.*;

/**
 * Created by wenzailong on 2017/11/28.
 */
public class GetClassMethod {
    @Test
    public void reflectionDemo(){
        Class<String> stringClass = String.class;
        //获取类属性
        Field[] declaredFields = stringClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //如果获取全名就使用declaredField.getType()，去掉getSimpleName()
            System.out.println("field:"+Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getType().getSimpleName() + " " +  declaredField.getName());
        }
        //获取类方法
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method declaredField : declaredMethods) {
            Type[] genericParameterTypes = declaredField.getGenericParameterTypes();
            System.out.print("method:  " +declaredField.getGenericReturnType()+" "+ declaredField.getName());
            System.out.print("(");
            for (Type genericParameterType : genericParameterTypes) {
                System.out.print(genericParameterType.toString()+",");
            }
            System.out.print(")");
            System.out.println("");
        }
        //获取类构造方法
        Constructor<?>[] constructors = stringClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.print("constructor: "+constructor.getName().toString());
            System.out.print("(");
            Type[] genericExceptionTypes = constructor.getGenericParameterTypes();
            for (Type genericExceptionType : genericExceptionTypes) {
                System.out.print(genericExceptionType + ",");
            }
            System.out.print(")");
            System.out.println("");
        }
    }
}
