package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie =context.getBean("MovieA",Movie.class);
        System.out.println(movie);
        Movie movie1 =context.getBean("MovieB",Movie.class);
        System.out.println(movie1);
        System.out.println(movie==movie1);
    }
}
