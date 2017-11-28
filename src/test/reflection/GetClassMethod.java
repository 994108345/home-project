package reflection;

import org.junit.Test;

import java.lang.reflect.*;

/**
 * Created by wenzailong on 2017/11/28.
 */

/**
 * 利用反射获取一个类参数、方法、构造方法的信息
 */
public class GetClassMethod {
    @Test
    public void reflectionDemo() {
        Class<String> stringClass = String.class;
        //获取类属性
        this.getParam(stringClass);
        //获取类方法
        this.getMethod(stringClass);
        //获取类构造方法
        this.getContructor(stringClass);
    }
    /*获取参数*/
    public void getParam(Class<?> stringClass){
        Field[] declaredFields = stringClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //如果获取类型的全名就使用declaredField.getType()，去掉getSimpleName()
            String modifyer = Modifier.toString(declaredField.getModifiers());//获取修饰符
            String paramType = declaredField.getType().getSimpleName();//获取参数类型
            String paramName = declaredField.getName();//获取参数名
            System.out.println("field:"+modifyer + " " + paramType + " " +  paramName);
        }
    }
    /*获取普通方法*/
    public void getMethod(Class<?> stringClass){
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method declaredField : declaredMethods) {
            String modifyer = Modifier.toString(declaredField.getModifiers());//获取修饰符
            Type[] genericParameterTypes = declaredField.getGenericParameterTypes();
            String returnType = declaredField.getGenericReturnType().toString();//返回参数类型
            System.out.print("method:  " + modifyer +""+returnType+" "+ declaredField.getName());
            System.out.print("(");
            for (Type genericParameterType : genericParameterTypes) {
                String paramType = genericParameterType.toString();//获取参数列表
                System.out.print(paramType+",");
            }
            System.out.print(")");
            System.out.println("");
        }
    }
    /*获取构造方法*/
    public void getContructor(Class<?> stringClass){
        Constructor<?>[] constructors = stringClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            String modifyer = Modifier.toString(constructor.getModifiers());//获取修饰符
            System.out.print("constructor: "+ modifyer + " " +constructor.getName().toString());
            System.out.print("(");
            Type[] genericExceptionTypes = constructor.getGenericParameterTypes();
            for (Type genericExceptionType : genericExceptionTypes) {
                String paramType = genericExceptionType.toString();//获取参数列表
                System.out.print(genericExceptionType + ",");
            }
            System.out.print(")");
            System.out.println("");
        }
    }
}
