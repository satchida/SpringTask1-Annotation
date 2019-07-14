package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    @Autowired
    public Movie() {


    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                ", actor3=" + actor3 +
                '}';
    }
}
