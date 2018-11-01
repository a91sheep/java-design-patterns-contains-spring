/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        //命令接收者
        Receiver receiver = new Receiver();
        //初始化所有命令
        EatCommand eatCommand = new EatCommand(receiver);
        SleepCommand sleepCommand = new SleepCommand(receiver);
        SingCommand singCommand = new SingCommand(receiver);

        //命令发起者 发送 命令
        Invoke invoke = new Invoke();

        invoke.send(eatCommand);

        invoke.send(singCommand);

        invoke.send(sleepCommand);
    }
}
