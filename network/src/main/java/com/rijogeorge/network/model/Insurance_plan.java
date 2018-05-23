package com.rijogeorge.network.model;

public class Insurance_plan {
    private String uid;

    private String[] category;

    private String name;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String[] getCategory ()
    {
        return category;
    }

    public void setCategory (String[] category)
    {
        this.category = category;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", category = "+category+", name = "+name+"]";
    }
}
