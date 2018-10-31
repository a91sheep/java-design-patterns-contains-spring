package spring;

import normal.Dog;
import normal.Sheep;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/24
 * @since 1.0
 */
public class DemoInSpring {

    public static void main(String[] args) {
        //1、17～21行，装载配置文件并启动容器。与设计模式无关
        Resource res = new ClassPathResource("beans.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(res);
        System.out.println("#########init BeanFactory.");

        //2、下面是简单工厂模式的应用
        Dog dog = beanFactory.getBean("dog", Dog.class);
        dog.sing();

        Sheep sheep = beanFactory.getBean("sheep", Sheep.class);
        sheep.sing();
    }
}
