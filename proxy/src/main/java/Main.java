import java.lang.reflect.Proxy;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        //静态代理
        IAnimal animal = new StaticProxyAnimal();
        animal.sing();

        System.out.println("\n#####################\n");
        //动态代理
        IAnimal target = new Animal();
        DynamicProxyAnimalHandler handler = new DynamicProxyAnimalHandler(target);
        IAnimal animal1 = (IAnimal) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
        animal1.sing();
    }
}
