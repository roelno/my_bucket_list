package com.zelda.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);

        RecyclerView thingsList = findViewById(R.id.recycler_view_things);

        Bucket[] things = {
                new Bucket("Climb Mt Kilimanjaro", "Do it the difficult way!", R.drawable.kilimanjaro),
                new Bucket("Experience the Northern Lights", "Somewhere in the arctic circle, probably Norway.", R.drawable.northern_lights),
                new Bucket("Road Trip Cross USA", "Hire a car from the west coast, and travel to the east coast.", R.drawable.road_trip),
                new Bucket("Scuba Dive", "In Koh Tao, Thailand.", R.drawable.scubadive),
                new Bucket("Sky Dive", "Perfectly over somewhere with an amazing view.", R.drawable.skydive)
        };

        BucketAdapter adapter = new BucketAdapter(things);
        thingsList.setAdapter(adapter);
    }
}