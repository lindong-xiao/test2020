package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testhello {
    public static void main(String[] args) {
        //helloService service = new HelloServiceImpl();
        //service.sayHello("zhangsan");

        //使用反射机制执行sayhello方法 核心method (类中的方法)
        helloService service = new HelloServiceImpl();
        //获取sayhello名称对于Method类的对象
        try {
            Method method = helloService.class.getMethod("sayHello", String.class);
            //通过method可以执行sayhello方法调用
            /*
            invoke是Method类中的一个方法 表示执行方法的调用
            参数: 1.Object ,表示对象的,要执行方法的调用
                 2.Object....arg ,方法执行时的参数值
            返回值: Object :方法执行后的返回值
             */
            //执行service对象sayhello,参数是lisi
            Object object = method.invoke(service, "lisi");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
