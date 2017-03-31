package com.example.grahamnessler.ideabox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by grahamnessler on 3/30/17.
 */

public class IdeasAdapter extends ArrayAdapter<Idea> {
    public IdeasAdapter(Context context, ArrayList<Idea> ideas) {
        super(context, 0, ideas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Idea idea = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_idea, parent, false);
        }
        // Lookup view for data population
        TextView ideaNameLine = (TextView) convertView.findViewById(R.id.ideaNameLine);
        TextView ideaBodyLine = (TextView) convertView.findViewById(R.id.ideaBodyLine);
        TextView ideaQualityLine = (TextView) convertView.findViewById(R.id.ideaQualityLine);
        // Populate the data into the template view using the data object
        long id = idea.id;
        String nameString = "Name: " + idea.name;
        String bodyString = "The idea: " + idea.body;
        String qualityString = "Quality: " + idea.quality;
        ideaNameLine.setText(nameString);
        ideaBodyLine.setText(bodyString);
        ideaQualityLine.setText(qualityString);
        // Return the completed view to render on screen
        return convertView;
    }


}
