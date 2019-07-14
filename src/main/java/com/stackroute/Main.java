package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        ((AnnotationConfigApplicationContext)context).registerShutdownHook();
        BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean(BeanLifecycleDemoBean.class);

    }
}
