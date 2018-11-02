/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/2
 * @since 1.0
 */
public class Computer {
    private String cpu;
    private String screen;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void show() {
        System.out.println("电脑组装完成,cpu:" + getCpu() + ",screen:" + getScreen());
    }
}
