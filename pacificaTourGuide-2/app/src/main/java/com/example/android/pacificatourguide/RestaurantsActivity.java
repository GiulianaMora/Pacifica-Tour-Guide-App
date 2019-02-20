package com.example.android.pacificatourguide;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of funToTry
        final ArrayList<FunToTry> funToTry = new ArrayList<FunToTry>();
        funToTry.add(new FunToTry(getString(R.string.mazzettis_bakery), getString(R.string.mazzettis_bakery_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.colombos_deli), getString(R.string.colombos_deli_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.nicks_restaurant), getString(R.string.nicks_restaurant_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.high_tide_cafe), getString(R.string.high_tide_cafe_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.camelot_fishnchips), getString(R.string.camelot_fishnchips_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.puerto_27), getString(R.string.puerto_27_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.sushi_koko), getString(R.string.sushi_koko_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.tams), getString(R.string.tams_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.guerreros_taqueria), getString(R.string.guerreros_taqueria_address), R.drawable.restaurants));
        funToTry.add(new FunToTry(getString(R.string.el_grano_de_oro), getString(R.string.el_grano_de_oro_address), R.drawable.restaurants));


        // Create an {@link FunToTryAdapter}, whose data source is a list of {@link FunToTry}s. The
        // adapter knows how to create list items for each item in the list.
        FunToTryAdapter adapter = new FunToTryAdapter(this, funToTry, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FunToTryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FunToTry} in the list.
        listView.setAdapter(adapter);

    }
}
