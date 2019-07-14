package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
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

    @Bean({"MovieA","MovieB"})
    public Movie movieCharacters(){

        Movie movie=new Movie(actor1(),actor2());

        return movie;
    }

}
