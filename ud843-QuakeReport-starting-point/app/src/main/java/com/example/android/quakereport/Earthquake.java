package com.example.android.quakereport;

public class Earthquake {

    private double mEarthquakeMagnitude;

    private String mCity;

    private long mTime;

    private String mUrl;

    public Earthquake (double magnitude, String city, long time, String url) {
        mEarthquakeMagnitude = magnitude;
        mCity = city;
        mTime = time;
        mUrl = url;
    }

    /**
     * Get the magnitude of the earthquake
     * @return
     */
    public double getEarthquakeMagnitude() { return mEarthquakeMagnitude;}

    /**
     * Get the city
     * @return
     */
    public String getCity() { return mCity; }

    /**
     * Get the date of the quake
     * @return
     */
    public long getTime() { return mTime; }

    /**
     * Get the URL of each specific earthquake
     */
    public String getUrl() { return mUrl; }
}
