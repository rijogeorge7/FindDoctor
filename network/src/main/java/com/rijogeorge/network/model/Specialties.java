package com.rijogeorge.network.model;

public class Specialties {
    private String uid;

    private String category;

    private String description;

    private String name;

    private String actors;

    private String actor;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getActors ()
    {
        return actors;
    }

    public void setActors (String actors)
    {
        this.actors = actors;
    }

    public String getActor ()
    {
        return actor;
    }

    public void setActor (String actor)
    {
        this.actor = actor;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", category = "+category+", description = "+description+", name = "+name+", actors = "+actors+", actor = "+actor+"]";
    }
}
