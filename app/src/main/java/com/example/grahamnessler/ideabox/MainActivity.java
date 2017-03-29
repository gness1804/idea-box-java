package com.example.grahamnessler.ideabox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void createIdea() {
        Idea idea = new Idea("Hello", "I am the idea", "Swill");

    }
}
