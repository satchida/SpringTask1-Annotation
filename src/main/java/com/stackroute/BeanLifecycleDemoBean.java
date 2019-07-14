package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set");
    }

    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean() {
        BeanLifecycleDemoBean beanLifecycleDemoBean = new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }
}
