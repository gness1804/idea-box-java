package com.example.grahamnessler.ideabox;

import android.content.Context;
import android.util.Log;
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
        Idea idea = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_idea, parent, false);
        }
        TextView ideaNameLine = (TextView) convertView.findViewById(R.id.ideaNameLine);
        TextView ideaBodyLine = (TextView) convertView.findViewById(R.id.ideaBodyLine);
        TextView ideaQualityLine = (TextView) convertView.findViewById(R.id.ideaQualityLine);
        long id = idea.id;
        String nameString = "Name: " + idea.name;
        String bodyString = "The idea: " + idea.body;
        String qualityString = "Quality: " + idea.quality;
        ideaNameLine.setText(nameString);
        ideaBodyLine.setText(bodyString);
        ideaQualityLine.setText(qualityString);
        return convertView;
    }

}
