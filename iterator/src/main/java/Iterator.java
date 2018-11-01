import java.util.NoSuchElementException;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    E first();
}
