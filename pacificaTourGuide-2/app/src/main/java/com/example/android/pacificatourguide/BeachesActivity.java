package com.example.android.pacificatourguide;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of funToTry
        final ArrayList<FunToTry> funToTry = new ArrayList<FunToTry>();
        funToTry.add(new FunToTry(getString(R.string.rockaway_beach), getString(R.string.rockaway_beach_address), R.drawable.rockaway));
        funToTry.add(new FunToTry(getString(R.string.linda_mar_beach), getString(R.string.linda_mar_beach_address), R.drawable.linda_mar));
        funToTry.add(new FunToTry(getString(R.string.sharp_park_beach), getString(R.string.sharp_park_beach_address), R.drawable.sharp_park));
        funToTry.add(new FunToTry(getString(R.string.esplanade_dog_beach), getString(R.string.esplanade_dog_beach_address), R.drawable.esplanade));

        // Create an {@link FunToTryAdapter}, whose data source is a list of {@link FunToTry}s. The
        // adapter knows how to create list items for each item in the list.
        FunToTryAdapter adapter = new FunToTryAdapter(this, funToTry, R.color.category_beaches);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FunToTryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FunToTry} in the list.
        listView.setAdapter(adapter);

    }
}
