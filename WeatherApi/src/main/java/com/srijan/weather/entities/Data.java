package com.srijan.weather.entities;

public class Data
{
    private String precipProbability;

    private String precipIntensity;

    private String time;

    public String getPrecipProbability ()
    {
        return precipProbability;
    }

    public void setPrecipProbability (String precipProbability)
    {
        this.precipProbability = precipProbability;
    }

    public String getPrecipIntensity ()
    {
        return precipIntensity;
    }

    public void setPrecipIntensity (String precipIntensity)
    {
        this.precipIntensity = precipIntensity;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [precipProbability = "+precipProbability+", precipIntensity = "+precipIntensity+", time = "+time+"]";
    }
}
			
			
