/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */

/**
 * 优点：线程安全
 * 缺点：类加载即完成对象的实例化(有些对象实例化后会占用比较多资源)
 */
public class Singleton2 {

    private static Singleton2 instant = new Singleton2();

    private Singleton2() {
        if (instant != null) {
            System.out.println("Singleton1已经实例化了。。。");
        }
    }

    public static Singleton2 getInstant() {
        return instant;
    }
}
