/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */
//简单工厂模式
public class Main {

    public static void main(String[] args) {

        IAnimal dog = SimpleFactory.getAnimal("dog");
        if (dog != null) {
            dog.sing();
        }
        System.out.println("-------------------");

        IAnimal sheep = SimpleFactory.getAnimal("sheep");
        if (sheep != null) {
            sheep.sing();
        }

        IAnimal cat = SimpleFactory.getAnimal("cat");
        if (cat != null) {
            cat.sing();
        }
    }
}
