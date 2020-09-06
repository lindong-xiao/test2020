package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        //创建目标对象
        usbSell factory = new usbFactory();
        //创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);
        //创建代理对象
        usbSell proxy =(usbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        //通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理方法 " + price);
    }
}
