package com.example.grahamnessler.ideabox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private List<Idea> ideas = new ArrayList<Idea>();
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

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void selectIdea (View view) {
        EditText name = (EditText) findViewById(R.id.ideaNameInput);
        chosenName = name.getText().toString();
        EditText body = (EditText) findViewById(R.id.ideaBodyInput);
        chosenBody = body.getText().toString();
        if (!chosenName.isEmpty() && !chosenBody.isEmpty()) {
            createIdea();
        } else {
            throwEmptyFieldError();
        }
    }

    void throwEmptyFieldError () {
        Context context = getApplicationContext();
        CharSequence text = "Oops! You must fill in all fields!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
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
        ideas.add(idea);
        //iterate through ideas...
    }
}
