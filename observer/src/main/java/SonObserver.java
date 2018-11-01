/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class SonObserver implements IObserver {
    @Override
    public void invoke() {
        System.out.println("儿子说，我不打球了，回家洗澡了");
    }
}
