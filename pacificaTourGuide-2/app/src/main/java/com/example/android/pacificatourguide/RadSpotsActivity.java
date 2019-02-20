package com.example.android.pacificatourguide;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RadSpotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of funToTry
        final ArrayList<FunToTry> funToTry = new ArrayList<FunToTry>();
        funToTry.add(new FunToTry(getString(R.string.sanchez_art_center), getString(R.string.sanchez_art_center_address), R.drawable.rad_spots));
        funToTry.add(new FunToTry(getString(R.string.pacifica_spindrift_players), getString(R.string.pacifica_spindrift_players_address), R.drawable.rad_spots));
        funToTry.add(new FunToTry(getString(R.string.floreys_book_co), getString(R.string.floreys_book_co_address), R.drawable.rad_spots));
        funToTry.add(new FunToTry(getString(R.string.mazza_castle), getString(R.string.mazza_castle_address), R.drawable.rad_spots));
        funToTry.add(new FunToTry(getString(R.string.sharp_park_golf_course), getString(R.string.sharp_park_golf_course_address), R.drawable.rad_spots));
        funToTry.add(new FunToTry(getString(R.string.pacifica_coastside_museum), getString(R.string.pacifica_coastside_museum_address), R.drawable.rad_spots));
        funToTry.add(new FunToTry(getString(R.string.pacific_coast_fog_festival), getString(R.string.pacific_coast_fog_festival_address), R.drawable.rad_spots));


        // Create an {@link FunToTryAdapter}, whose data source is a list of {@link FunToTry}s. The
        // adapter knows how to create list items for each item in the list.
        FunToTryAdapter adapter = new FunToTryAdapter(this, funToTry, R.color.category_rad_spots);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FunToTryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FunToTry} in the list.
        listView.setAdapter(adapter);

    }
}
