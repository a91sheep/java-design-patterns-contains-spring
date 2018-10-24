/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */
//工厂方法模式
public class Main {

    public static void main(String[] args) {
        AnimalFactory factory = null;
        factory = new DogFactory();
        Animal dog = factory.createAnimal();
        dog.sing();

        factory = new SheepFactory();
        Animal sheep = factory.createAnimal();
        sheep.sing();
    }
}
