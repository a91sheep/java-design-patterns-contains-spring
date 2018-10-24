/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */

/**
 * 优点：实例在第一次使用时构建
 * 缺点：需要加锁保证线程安全
 */
public class Singleton1 {

    private static Singleton1 instant = null;

    private Singleton1() {
        if (instant != null) {
            System.out.println("Singleton1已经实例化了。。。");
        }
    }

    public static synchronized Singleton1 getInstant() {
        if (instant == null) {
            instant = new Singleton1();
        }
        return instant;
    }
}
