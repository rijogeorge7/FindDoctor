package com.rijogeorge.network.model;

public class Versions {
    private String hero;

    private String thumbnail;

    private String small;

    private String large;

    private String medium;

    private String thumbnail2x;

    public String getHero ()
    {
        return hero;
    }

    public void setHero (String hero)
    {
        this.hero = hero;
    }

    public String getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getSmall ()
    {
        return small;
    }

    public void setSmall (String small)
    {
        this.small = small;
    }

    public String getLarge ()
    {
        return large;
    }

    public void setLarge (String large)
    {
        this.large = large;
    }

    public String getMedium ()
    {
        return medium;
    }

    public void setMedium (String medium)
    {
        this.medium = medium;
    }

    public String getThumbnail2x ()
    {
        return thumbnail2x;
    }

    public void setThumbnail2x (String thumbnail2x)
    {
        this.thumbnail2x = thumbnail2x;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [hero = "+hero+", thumbnail = "+thumbnail+", small = "+small+", large = "+large+", medium = "+medium+", thumbnail2x = "+thumbnail2x+"]";
    }
}
