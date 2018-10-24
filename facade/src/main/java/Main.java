/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/3
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        //由一个上层类封装几个子系统的初始化，简化客户端的操作
        Facade facade = new Facade();
        facade.start();
    }
}
