import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class MyIterator<E> implements Iterator {

    private List<E> list;
    int cursor;       // index of next element to return
    int lastRet = -1; // index of last element returned; -1 if no such
    int size;

    public MyIterator(List<E> list) {
        this.list = list;
        this.size = list.size();
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public E next() {
        int i = cursor;
        if (i >= size)
            throw new NoSuchElementException();

        if (i >= list.size())
            throw new ConcurrentModificationException();
        cursor = i + 1;
        return (E) list.get(lastRet = i);
    }

    @Override
    public E first() {
        return list.get(0);
    }
}
