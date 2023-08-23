package com.zelda.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        RecyclerView placesList = findViewById(R.id.recycler_view_places);

        Bucket[] places = {
                new Bucket("Vietnam", "Con Dao Islands, Hanoi, Halong Bay, Hoi An, Lang Co.", R.drawable.vietnam),
                new Bucket("Kerala, India", "Try varied tea flavours, stay in houseboat, the fabulous food!", R.drawable.kerala),
                new Bucket("Japan", "Hot springs, sushi, bamboo forest, bullet train through mountains", R.drawable.japan),
                new Bucket("Iceland", "Dynjandi Waterfall, nature reserves, maybe the Northern Lights too!", R.drawable.iceland),
                new Bucket("The Amazon, Brazil", "Try to survive being scared by the creepy crawlies!", R.drawable.amazon)
        };

        BucketAdapter adapter = new BucketAdapter(places);
        placesList.setAdapter(adapter);
    }
}