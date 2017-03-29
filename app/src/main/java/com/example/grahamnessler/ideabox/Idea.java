package com.example.grahamnessler.ideabox;

/**
 * Created by grahamnessler on 3/29/17.
 */

public class Idea {
    long id;
    String name;
    String body;
    String quality;

    Idea(String name, String body, String quality) {
        this.id = System.currentTimeMillis();
        this.name = name;
        this.body = body;
        this.quality = quality;
    }
}
