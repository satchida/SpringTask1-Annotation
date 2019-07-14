package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor1(){

        Actor actor1=new Actor("Rahul","Male",54);
        return actor1;
    }

    @Bean
    public Actor actor2(){

        Actor actor2=new Actor("Rakesh","Male",44);
        return actor2;
    }

    @Bean
    public Actor actor3(){

        Actor actor3=new Actor("Ranjit","Male",34);
        return actor3;
    }

    @Bean
    public Movie movie(){
       return new Movie(actor1(),actor2(),actor3());
  }
  @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
  {
      return new BeanLifecycleDemoBean();
  }
    @Bean
    public com.stackroute.demo.BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        com.stackroute.demo.BeanPostProcessorDemoBean beanPostProcessorDemoBean=new com.stackroute.demo.BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }


}
