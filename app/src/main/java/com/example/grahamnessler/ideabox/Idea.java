package com.example.grahamnessler.ideabox;

/**
 * Created by grahamnessler on 3/29/17.
 */

public class Idea {
    static int count = 0;
    long id;
    String name;
    String body;
    String quality;

    Idea(String name, String body, String quality) {
        this.id = System.currentTimeMillis();
        setName(name);
        setBody(body);
        setQuality(quality);
        count++;
    }

    void setName (String name) {
        this.name = name;
    }

    void setBody (String body) {
        this.body = body;
    }

    void setQuality (String quality) {
        this.quality = quality;
    }
}
