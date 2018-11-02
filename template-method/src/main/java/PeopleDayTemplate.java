/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/2
 * @since 1.0
 */
public abstract class PeopleDayTemplate {

    //把不变的步骤实现
    public void getUp() {
        System.out.println("起床了....");
    }

    //可变的步骤交由子类实现
    public abstract void goToWork();

    //把不变的步骤实现
    public void sleep() {
        System.out.println("睡觉了...");
    }

    /**
     * 定义一天当中的步骤和流程，把不变的步骤实现{起床和睡觉}，把可变的步骤交给子类去实现。
     * 如果强制不可修改，可修饰为final
     */
    public void lifecycle() {
        getUp();
        goToWork();
        sleep();
    }
}
