package com.example.android.pacificatourguide;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksTrailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of funToTry
        final ArrayList<FunToTry> funToTry = new ArrayList<FunToTry>();
        funToTry.add(new FunToTry(getString(R.string.san_pedro_valley_park), getString(R.string.san_pedro_valley_park_address), R.drawable.parks_trails));
        funToTry.add(new FunToTry(getString(R.string.frontierland_park), getString(R.string.frontierland_park_address), R.drawable.parks_trails));
        funToTry.add(new FunToTry(getString(R.string.pacifica_skate_park), getString(R.string.pacifica_skate_park_address), R.drawable.parks_trails));
        funToTry.add(new FunToTry(getString(R.string.devils_slide_trail), getString(R.string.devils_slide_trail_address), R.drawable.parks_trails));
        funToTry.add(new FunToTry(getString(R.string.milagra_ridge), getString(R.string.milagra_ridge_address), R.drawable.parks_trails));
        funToTry.add(new FunToTry(getString(R.string.mori_point), getString(R.string.mori_point_address), R.drawable.parks_trails));

        // Create an {@link FunToTryAdapter}, whose data source is a list of {@link FunToTry}s. The
        // adapter knows how to create list items for each item in the list.
        FunToTryAdapter adapter = new FunToTryAdapter(this, funToTry, R.color.category_parks_trails);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FunToTryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FunToTry} in the list.
        listView.setAdapter(adapter);

    }
}
