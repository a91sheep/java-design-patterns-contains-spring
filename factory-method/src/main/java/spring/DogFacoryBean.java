package spring;

import normal.Dog;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/31
 * @since 1.0
 */
public class DogFacoryBean implements FactoryBean {

    private Dog dog;

    @Override
    public Object getObject() throws Exception {
        dog = new Dog();
        //复杂计算，如果气温高于30度，为hot
        dog.setWeather("hot");
        return dog;
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
