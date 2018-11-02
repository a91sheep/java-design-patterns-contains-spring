/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/2
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        //销售人员收到订单，要一台dell电脑
        Seller seller = new Seller(new DellBuilder());
        //告诉Dell生产者生产一台电脑
        Computer computer = seller.create();
        //验收电脑
        computer.show();
    }
}
