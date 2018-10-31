package spring;

import normal.Sheep;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author <a href="mailto:wujia@2dfire.com">linxiaohui</a>
 * @version 1.0 2018/10/31
 * @since 1.0
 */
public class SheepFacoryBean implements FactoryBean {

    private Sheep sheep;

    @Override
    public Object getObject() throws Exception {
        sheep = new Sheep();
        //复杂计算，如果气温低于5度，为cold
        sheep.setWeather("cold");
        return sheep;
    }

    @Override
    public Class<?> getObjectType() {
        return Sheep.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
