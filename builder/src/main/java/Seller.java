/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/2
 * @since 1.0
 */
public class Seller {
    private Builder builder;

    public Seller(Builder builder) {
        this.builder = builder;
    }

    public Computer create() {
        builder.createCpu();
        builder.createScreen();
        return builder.getComputer();
    }
}
