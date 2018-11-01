/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class MotherObserver implements IObserver {
    @Override
    public void invoke() {
        System.out.println("老妈说，我要开始做饭了。。。");
    }
}
