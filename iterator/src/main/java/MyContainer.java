import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class MyContainer<E> {
    private List<E> list = new ArrayList<E>();

    public void add(E obj) {
        list.add(obj);
    }

    public void remove(E obj) {
        list.remove(obj);
    }

    public Iterator iterator() {
        return new MyIterator<E>(list);
    }
}
