package com.rijogeorge.network.model;

public class Meta {
    private String limit;

    private String total;

    private String[] ignored_query_parameters;

    private String count;

    private String data_type;

    private String skip;

    private String fields_requested;

    private String item_type;

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String[] getIgnored_query_parameters ()
    {
        return ignored_query_parameters;
    }

    public void setIgnored_query_parameters (String[] ignored_query_parameters)
    {
        this.ignored_query_parameters = ignored_query_parameters;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getData_type ()
    {
        return data_type;
    }

    public void setData_type (String data_type)
    {
        this.data_type = data_type;
    }

    public String getSkip ()
    {
        return skip;
    }

    public void setSkip (String skip)
    {
        this.skip = skip;
    }

    public String getFields_requested ()
    {
        return fields_requested;
    }

    public void setFields_requested (String fields_requested)
    {
        this.fields_requested = fields_requested;
    }

    public String getItem_type ()
    {
        return item_type;
    }

    public void setItem_type (String item_type)
    {
        this.item_type = item_type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [limit = "+limit+", total = "+total+", ignored_query_parameters = "+ignored_query_parameters+", count = "+count+", data_type = "+data_type+", skip = "+skip+", fields_requested = "+fields_requested+", item_type = "+item_type+"]";
    }
}
