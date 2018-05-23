package com.rijogeorge.network.model;

public class Hospital_affiliations {
    private String uid;

    private Phone phone;

    private Address address;

    private String name;

    private String type;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public Phone getPhone ()
    {
        return phone;
    }

    public void setPhone (Phone phone)
    {
        this.phone = phone;
    }

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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
        return "ClassPojo [uid = "+uid+", phone = "+phone+", address = "+address+", name = "+name+", type = "+type+"]";
    }
}
