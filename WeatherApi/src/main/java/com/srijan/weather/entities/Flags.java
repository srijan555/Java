package com.srijan.weather.entities;

public class Flags
{
    private String nearestStation;

    private String[] sources;

    private String units;

    

    public String getNearestStation() {
		return nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public String[] getSources ()
    {
        return sources;
    }

    public void setSources (String[] sources)
    {
        this.sources = sources;
    }

    public String getUnits ()
    {
        return units;
    }

    public void setUnits (String units)
    {
        this.units = units;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nearest-station = "+nearestStation+", sources = "+sources+", units = "+units+"]";
    }
}