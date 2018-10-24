/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/6/29
 * @since 1.0
 */
//抽象工厂模式
public class Main {

    public static void main(String[] args) {
        //lenovo computer
        IComputerFactory lenovoFactory = new LenovoFactory();
        ICpu cpu = lenovoFactory.createCPU();
        IScreen screen = lenovoFactory.createScreen();

        cpu.print();
        screen.print();

        System.out.println("----------------------");

        //dell computer
        IComputerFactory dellFactory = new DellFactory();
        ICpu cpu2 = dellFactory.createCPU();
        IScreen screen2 = dellFactory.createScreen();
        cpu2.print();
        screen2.print();
    }

}
