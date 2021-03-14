package com.srijan.weather.model;

public class Properties
{
    private String address;

    private String landmark;

    private String category;

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getLandmark ()
    {
        return landmark;
    }

    public void setLandmark (String landmark)
    {
        this.landmark = landmark;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", landmark = "+landmark+", category = "+category+"]";
    }
}
			
			
