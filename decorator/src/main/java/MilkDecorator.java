/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class MilkDecorator implements IMilk {

    private IMilk milk;

    public MilkDecorator(IMilk milk) {
        this.milk = milk;
    }

    @Override
    public String getDrink() {
        return milk.getDrink() + "加点糖";
    }
}
