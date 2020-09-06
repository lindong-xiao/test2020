package test;

public class usbFactory implements usbSell{

    @Override
    public float sell(int num) {
        System.out.println("执行 工厂sell方法");
        return 85.f;
    }
}
