package com.example.android.pacificatourguide;

/**
 * {@link FunToTry} represents the name an activity or event that the user may want to check out in Pacifica California
 * It contains contact info and an image for that activities or events
 */

public class FunToTry {
    /** Name of activities and events to try */
    private String mActivitiesEvents;

    /** Contact information for each of the activities or events */
    private String mContactInfo;


    /** Image resource ID for the activities and events */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new FunToTry object.
     *
     * @param activitiesEvents are the names of activities or events
     * @param contactInfo is the contact information for each of the activities or events
     * @param imageResourceId is the drawable resource ID for the image associated with the word

     */
    public FunToTry(String activitiesEvents, String contactInfo, int imageResourceId) {
        mActivitiesEvents = activitiesEvents;
        mContactInfo = contactInfo;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of activities or events of the funToTry.
     */
    public String getActivitiesEvents() {
        return mActivitiesEvents;
    }

    /**
     * Get the contact info of the funToTry.
     */
    public String getContactInfo() {
        return mContactInfo;
    }

    /**
     * Return the image resource ID of the funToTry.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this funToTry.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}


