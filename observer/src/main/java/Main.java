/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        //初始化事件广播器
        MultiCast multiCast = new MultiCast();
        //注册监听器
        multiCast.register(new MotherObserver());
        multiCast.register(new SonObserver());

        //发布事件，通知注册的各个监听者
        multiCast.castEvent();
    }
}
