package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//必须实现InvocationHandler接口 完成代理类要做的功能(调用目标方法,功能增强)
public class MySellHandler implements InvocationHandler {
    private Object object = null;
    //动态代理: 目标对象是活动的, 不是固定的,需要传进来, 传进来是谁就给谁代理

    public MySellHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        res = method.invoke(object, args);//执行目标方法
        if (res != null){
            Float price = (float)res;
            price = price + 25;
            res = price;
        }
        return res;
    }

}
