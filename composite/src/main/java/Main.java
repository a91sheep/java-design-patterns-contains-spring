/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 18/7/3
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("顶层文件夹");
        AbstractFile pdf_2 = new PdfFile("二层pdf文件");
        AbstractFile txt_2 = new TxtFile("二层txt文件");
        Folder folder_2 = new Folder("二层文件夹");

        //一级目录下包含两个文件和一个二级目录
        root.addFile(pdf_2);
        root.addFile(txt_2);
        root.addFile(folder_2);

        AbstractFile pdf_3 = new PdfFile("三层pdf文件");
        AbstractFile txt_3 = new TxtFile("三层txt文件");
        folder_2.addFile(pdf_3);
        folder_2.addFile(txt_3);

        root.showName();
        root.showAllChildren();
        System.out.println("----------------------");
        folder_2.showName();
        folder_2.showAllChildren();
    }
}
