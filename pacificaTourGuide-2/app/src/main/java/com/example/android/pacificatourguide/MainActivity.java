package com.example.android.pacificatourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the beaches category
        TextView beaches = (TextView) findViewById(R.id.beaches);

        // Set a click listener on that View
        beaches.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the beaches category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BeachesActivity}
                Intent beachesIntent = new Intent(MainActivity.this, BeachesActivity.class);

                // Start the new activity
                startActivity(beachesIntent);
            }
        });

        // Find the View that shows the parks and trails category
        TextView parksTrails = (TextView) findViewById(R.id.parks_trails);

        // Set a click listener on that View
        parksTrails.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the parks and trails category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksTrailsActivity}
                Intent parksTrailsIntent = new Intent(MainActivity.this, ParksTrailsActivity.class);

                // Start the new activity
                startActivity(parksTrailsIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the rad spots category
        TextView radSpots = (TextView) findViewById(R.id.rad_spots);

        // Set a click listener on that View
        radSpots.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the rad spots category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RadSpotsActivity}
                Intent radSpotsIntent = new Intent(MainActivity.this, RadSpotsActivity.class);

                // Start the new activity
                startActivity(radSpotsIntent);
            }
        });
    }}
