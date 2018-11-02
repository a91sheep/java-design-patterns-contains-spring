/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/2
 * @since 1.0
 */
public abstract class Builder {

    private Computer computer;

    public Builder() {
        computer = new Computer();
    }

    public abstract void createCpu();

    public abstract void createScreen();

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
