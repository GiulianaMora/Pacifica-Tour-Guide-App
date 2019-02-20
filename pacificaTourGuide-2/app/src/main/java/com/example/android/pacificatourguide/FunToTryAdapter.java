package com.example.android.pacificatourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link FunToTryAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link FunToTry} objects.
 */
public class FunToTryAdapter extends ArrayAdapter<FunToTry> {
    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link FunToTryAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param funToTry is the list of {@link FunToTry}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public FunToTryAdapter(Context context, ArrayList<FunToTry> funToTry, int colorResourceId) {
        super(context, 0, funToTry);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        FunToTry currentFunToTry = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID contact_info_text_view.
        TextView contactInfoTextView = (TextView) listItemView.findViewById(R.id.contact_info_text_view);
        // Get the contact information from the currentFunToTry object and set this text on
        // the ContactInfo TextView.
        contactInfoTextView.setText(currentFunToTry.getContactInfo());

        // Find the TextView in the list_item.xml layout with the ID activities_events_text_view.
        TextView activitiesEventsTextView = (TextView) listItemView.findViewById(R.id.activities_events_text_view);
        // Get the name of the activities or events from the currentFunToTry object and set this text on
        // the ActivitiesEvents TextView.
        activitiesEventsTextView.setText(currentFunToTry.getActivitiesEvents());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentFunToTry.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentFunToTry.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}

