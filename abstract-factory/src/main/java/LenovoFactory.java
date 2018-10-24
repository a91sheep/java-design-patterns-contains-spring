/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/2
 * @since 1.0
 */
public class LenovoFactory implements IComputerFactory {
    @Override
    public ICpu createCPU() {
        return new LenoveCpu();
    }

    @Override
    public IScreen createScreen() {
        return new LenovoScreen();
    }
}
