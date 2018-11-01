import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
//不限定对象，做一些特定的事情
public class DynamicProxyAnimalHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyAnimalHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy --- do something before method invoke");

        Object obj = method.invoke(target, args);

        System.out.println("dynamic proxy --- do something after method invoke");

        return obj;
    }
}
