/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/3
 * @since 1.0
 */
public class Facade {
    private Step1 step1;
    private Step2 step2;
    private Step3 step3;

    public Facade() {
        this.step1 = new Step1();
        this.step2 = new Step2();
        this.step3 = new Step3();
    }

    public void start() {
        step1.start();
        step2.start();
        step3.start();
    }
}
