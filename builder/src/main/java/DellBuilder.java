/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/2
 * @since 1.0
 */
public class DellBuilder extends Builder {
    @Override
    public void createCpu() {
        System.out.println("生产dell cpu");
        this.getComputer().setCpu("dell cpu");
    }

    @Override
    public void createScreen() {
        System.out.println("生产dell screen");
        this.getComputer().setScreen("dell screen");
    }
}
