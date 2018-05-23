package com.rijogeorge.network.model;

public class Visit_address {
    private String street2;

    private String zip;

    private String lon;

    private String state_long;

    private String street;

    private String state;

    private String slug;

    private String lat;

    private String city;

    public String getStreet2 ()
    {
        return street2;
    }

    public void setStreet2 (String street2)
    {
        this.street2 = street2;
    }

    public String getZip ()
    {
        return zip;
    }

    public void setZip (String zip)
    {
        this.zip = zip;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public String getState_long ()
    {
        return state_long;
    }

    public void setState_long (String state_long)
    {
        this.state_long = state_long;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getSlug ()
    {
        return slug;
    }

    public void setSlug (String slug)
    {
        this.slug = slug;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [street2 = "+street2+", zip = "+zip+", lon = "+lon+", state_long = "+state_long+", street = "+street+", state = "+state+", slug = "+slug+", lat = "+lat+", city = "+city+"]";
    }
}
