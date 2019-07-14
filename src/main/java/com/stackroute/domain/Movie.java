package com.stackroute.domain;


public class Movie {

    private Actor actor1;
    private Actor actor2;

    public Movie(Actor actor1, Actor actor2) {
        this.actor1 = actor1;
        this.actor2 = actor2;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                '}';
    }
}
