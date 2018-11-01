/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class SingCommand implements Command {

    private Receiver receiver;

    public SingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sing();
    }
}
