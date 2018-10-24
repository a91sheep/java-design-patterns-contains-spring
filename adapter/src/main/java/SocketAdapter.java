/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/19
 * @since 1.0
 */
//适配器类：重写2孔插座的充电方法，内部（往往需要做一些数据操作），然后调用3孔插座的方法
public class SocketAdapter extends ThreeFootSocket implements ITwoFootSocket {
    @Override
    public void charge() {
        super.threeCharge();
    }
}
