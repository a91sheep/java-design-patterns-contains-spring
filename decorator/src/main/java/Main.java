/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        IMilk normalMilk = new NormalMilk();
        System.out.println(normalMilk.getDrink());

        //装饰后
        IMilk milk = new MilkDecorator(normalMilk);
        System.out.println(milk.getDrink());
    }
}
