package test;

public class HelloServiceImpl implements helloService{

    @Override
    public void sayHello(String name) {
        System.out.println("你好" + name);
    }
}
