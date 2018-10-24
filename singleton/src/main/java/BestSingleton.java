/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */

/**
 * 目前来说比较推荐的单例实现方式
 */
public class BestSingleton {

    public static class Inner {
        public static BestSingleton instant = new BestSingleton();
    }

    private BestSingleton() {
        System.out.println("....");
    }

    public static BestSingleton getInstant() {
        return Inner.instant;
    }
}
