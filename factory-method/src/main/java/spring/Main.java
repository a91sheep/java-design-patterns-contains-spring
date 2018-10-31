package spring;

import normal.Dog;
import normal.Sheep;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/31
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        //为了更加形象，本文先获取factoryBean本身，再通过factoryBean获取具体的bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //获取dog工厂bean
        DogFacoryBean dogFacoryBean = ctx.getBean("&dogFacoryBean", DogFacoryBean.class);

        Dog dog = null;
        try {
            //dog工厂创建dog
            dog = (Dog) dogFacoryBean.getObject();
            System.out.println("dog say:" + dog.getWeather());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取sheep工厂bean
        SheepFacoryBean sheepFacoryBean = ctx.getBean("&sheepFacoryBean", SheepFacoryBean.class);

        Sheep sheep = null;
        try {
            //sheep工厂创建sheep
            sheep = (Sheep) sheepFacoryBean.getObject();
            System.out.println("sheep say:" + sheep.getWeather());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
