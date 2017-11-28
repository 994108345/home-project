package net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by wenzailong on 2017/11/13.
 */
public class InetAddressTest {
    /*获取本机ip地址*/
    @Test
    public void demo1() throws UnknownHostException {
        InetAddress address = InetAddress.getLoopbackAddress();
        System.out.println(address);
        address = InetAddress.getByName("osborne.com");
        System.out.println(address);
        InetAddress SW[] = InetAddress.getAllByName("www.baidu.com");
        for(int i= 0; i<SW.length;i++){
            System.out.println(SW[i]);
        }

    }
}
