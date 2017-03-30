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
    private Idea idea;
    private String[] choices = {"Swill", "Plausible", "Genius"};
    private String chosenName;
    private String chosenBody;
    private String chosenQuality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSpinner();
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        String choice = choices[pos];
        chosenQuality = choice;
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    public void selectIdea (View view) {
        Log.d("test", "button was clicked");
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
        idea = new Idea(chosenName, chosenBody, chosenQuality);

    }
}
