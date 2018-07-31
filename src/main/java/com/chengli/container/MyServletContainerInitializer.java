package com.chengli.container;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * Created by chengli on ${date}
 * 此类在META-INF/services/javax.servlet.ServletContainerInitializer中配置【固定写法】
 * 注意该配置文件应该位于class类路径下。也就是classpath下。否则不生效，所以运行的时候要注意，该配置文件是否在classpath下。
 * 【注： idea中，默认不会将该配置文件生成到class下，在Artifacts中手动添加Module sources】
 *
 * 这里@HandlesTypes注解参数中的类，会在onStartup第一个参数Set<Class<?>> c中注入其所有的子类,
 * 实现类，如果是注解类型，所有标注了该注解的类，都会注入进来。
 *
 * spring mvc的纯注解驱动开发，就是使用的这个新功能完成的。
 */
@HandlesTypes({Father.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) {
        for (Class<?> aClass : c) {
            System.out.println(aClass.getName());
        }
        System.out.println("container startup");
    }
}
