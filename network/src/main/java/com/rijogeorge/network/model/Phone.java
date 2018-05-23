package com.rijogeorge.network.model;

public class Phone {
    private String number;

    private String type;

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [number = "+number+", type = "+type+"]";
    }
}
