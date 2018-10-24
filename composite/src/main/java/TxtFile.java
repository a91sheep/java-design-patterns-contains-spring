/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/3
 * @since 1.0
 */
public class TxtFile extends AbstractFile {

    public TxtFile(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        this.getName();
    }
}
