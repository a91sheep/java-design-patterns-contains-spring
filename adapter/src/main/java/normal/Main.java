package normal;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/31
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        ITwoFootSocket two = new TwoFootSocket();
        two.charge();

        //使用三脚适配器--将两孔插座充电接口改造成三孔插座充电接口
        ITwoFootSocket twoAdapter = new SocketAdapter();
        twoAdapter.charge();
    }
}
