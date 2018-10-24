/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/2
 * @since 1.0
 */
public class SimpleFactory {
    public static IAnimal getAnimal(String type) {
        if ("sheep".equals(type)) {
            return new Sheep();
        } else if ("dog".equals(type)) {
            return new Dog();
        }
        return null;
    }
}
