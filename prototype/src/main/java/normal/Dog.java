package normal;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/31
 * @since 1.0
 */
public class Dog implements Cloneable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
