import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class MultiCast {
    private List<IObserver> observers = new ArrayList<IObserver>();

    public void register(IObserver observer) {
        observers.add(observer);
    }

    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    public void castEvent() {
        //此处默认只有一种固定的事件，就是通知监听者，爸爸马上回家了
        System.out.println("老爸马上回家了。。。。");
        for (IObserver observer : observers) {
            observer.invoke();
        }
    }
}
