package normal;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */
public class SheepFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Sheep();
    }
}
