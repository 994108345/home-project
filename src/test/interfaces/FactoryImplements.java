package interfaces;

/**
 * Created by wenzailong on 2017/9/26.
 */
public class FactoryImplements {
}
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
     Service getService();
}
class Tools1Service implements Service{
    @Override
    public void method1() {
        System.out.println("tools1Service---method1");
    }
    @Override
    public void method2() {
        System.out.println("tools1Service---method2");
    }
}
class Tools1ServiceFactory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Tools1Service();
    }
}
class Tools2Service implements Service{
    @Override
    public void method1() {
        System.out.println("tools2Service---method1");
    }
    @Override
    public void method2() {
        System.out.println("tools2Service---method2");
    }
}
class Tools2ServiceFactory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Tools2Service();
    }
}

class Factory{
    public static void service(ServiceFactory serviceFactory){
        Service service=serviceFactory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args){
        Tools1ServiceFactory tools1ServiceFactory=new Tools1ServiceFactory();
        service(tools1ServiceFactory);
    }
}


