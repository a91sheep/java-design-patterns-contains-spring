import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/3
 * @since 1.0
 */
public class Folder extends AbstractFile {

    private List<AbstractFile> list = new ArrayList();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println(this.getName());
    }

    public void addFile(AbstractFile file) {
        list.add(file);
    }

    public void showAllChildren() {
        for (AbstractFile file : list) {
            System.out.println(file.getName());
        }
    }
}
