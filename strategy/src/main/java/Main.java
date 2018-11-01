/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        TravelStrategy strategy = getTravelStrategy(2000);
        strategy.travelTransportation();
    }

    /**
     * 看到这里，大家可能会疑惑，这怎么和简单工厂模式这么像啊。。。
     * 其实结构上两者真的非常像，但是用途上还是由区别的。
     * 1、简单工厂模式是创建型的，主要目的是为了创建对象；策略模式是行为型模式，主要是为了根据环境（条件），让一个对象在对中行为中选择一种行为
     * 2、工厂相当于黑盒子，关注于工厂的创建；策略相当于白盒子，关注于行为的封装
     *
     * @param money
     * @return strategy
     */
    public static TravelStrategy getTravelStrategy(int money) {
        //模拟复杂逻辑计算，钱超过1000块，使用飞机出行
        if (money > 1000) {
            return new PlaneStrategy();
        }
        return new TrainStrategy();
    }
}
