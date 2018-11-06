package com.example.aras1.myapplication;

import android.content.Intent;
import android.widget.Button;

public class ChooseActionController {

    ChooseAction action;
    Button addCollection;
    Button openCollection;
    Button statistics;

    public ChooseActionController(ChooseAction action) {
        this.action = action;
        init();
    }

    void init() {

        addCollection = action.findViewById(R.id.addCollection);
        openCollection = action.findViewById(R.id.openCollection);
        statistics = action.findViewById(R.id.statistics);

        addCollection.setOnClickListener(
                (view) ->
                {

                    Intent newIntent = new Intent(action, AddActivity.class);
                    action.startActivity(newIntent);

                }

        );


        openCollection.setOnClickListener(
                (view) ->
                {

                    Intent newIntent = new Intent(action, OpenActivity.class);
                    action.startActivity(newIntent);

                }

        );

        statistics.setOnClickListener(
                (view) ->
                {

                    Intent newIntent = new Intent(action, StatisticsActivity.class);
                    action.startActivity(newIntent);

                }

        );

    }
}