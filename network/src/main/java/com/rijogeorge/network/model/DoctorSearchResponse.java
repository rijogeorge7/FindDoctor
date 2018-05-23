package com.rijogeorge.network.model;

public class DoctorSearchResponse {
    private Data[] data;

    private Meta meta;

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public Meta getMeta ()
    {
        return meta;
    }

    public void setMeta (Meta meta)
    {
        this.meta = meta;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", meta = "+meta+"]";
    }
}
