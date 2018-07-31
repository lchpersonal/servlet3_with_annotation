/**
 * @author chengli
 * @date 2018/7/31 20:31
 *
 * serlvet 3.0引入纯注解驱动编程，可以不用web.xml文件。
 * 新特性：
 * 容器在启动的时候，会扫描META-INF/services/javax.servlet.ServletContainerInitalizer文件
 * 加载其中指定的ServletContainerInitalizer的实现类:
 * @see com.chengli.container.MyServletContainerInitializer
 *
 */
package com.chengli.container;