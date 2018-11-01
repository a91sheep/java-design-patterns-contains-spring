/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
//硬编码，针对特定对象做一些特定的事情
public class StaticProxyAnimal implements IAnimal {

    private Animal animal;

    @Override
    public void sing() {
        animal = new Animal();
        System.out.println("static proxy --- do something before sing...");
        animal.sing();
        System.out.println("static proxy --- do something after sing...");
    }
}
