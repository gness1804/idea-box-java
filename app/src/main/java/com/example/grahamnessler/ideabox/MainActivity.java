package com.example.grahamnessler.ideabox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSpinner();
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        switch (pos) {
            case 0:
                Log.d("Message", "First item selected");
                break;
            default:
                Log.d("Message", "Nothing valid selected");
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    void createSpinner () {
        spinner = (Spinner) findViewById(R.id.ideaQualityInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.idea_quality_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    void createIdea() {
        Idea idea = new Idea("Hello", "I am the idea", "Swill");

    }
}
