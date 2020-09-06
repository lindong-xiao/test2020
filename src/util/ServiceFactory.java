package util;

public class ServiceFactory {
    public static Object getService (Object service){
        //取的对象
        return new TransactionHandler(service).getProxy();
    }
}
