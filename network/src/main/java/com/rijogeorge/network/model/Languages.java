package com.rijogeorge.network.model;

public class Languages {
    private String name;

    private String code;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", code = "+code+"]";
    }
}
