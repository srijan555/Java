package com.srijan.weather.model;

public class Context
{
    private String id;

    private String text;

    public String getId ()
    {
        return id;
    }

    public void setId (String id) 
    {
        this.id = id;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", text = "+text+"]";
    }
}
			
			
