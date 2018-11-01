/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/11/1
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        //创建集合
        MyContainer<String> container = new MyContainer<String>();
        container.add("tom");
        container.add("cat");
        container.add("john");

        //获取集合的迭代器
        Iterator iterator = container.iterator();
        //遍历集合中的各个元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
