package normal;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/31
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog1 = new Dog("二哈");
        Dog dog2 = (Dog) dog1.clone();

        if (dog1 != dog2) {
            System.out.println(dog1.hashCode());
            System.out.println(dog2.hashCode());
            System.out.println("do1 和 dog2 不同");
        }
        System.out.println("clone出来的dog2.name=" + dog2.getName());
    }
}
