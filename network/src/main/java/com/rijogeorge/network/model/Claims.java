package com.rijogeorge.network.model;

public class Claims {
    private String service_cnt;

    private String hcpcs;

    private String avg_allowed_amt;

    private String avg_charge_amt;

    private String bene_uniq_cnt;

    private String hcpcs_description;

    private String avg_payment_amt;

    public String getService_cnt ()
    {
        return service_cnt;
    }

    public void setService_cnt (String service_cnt)
    {
        this.service_cnt = service_cnt;
    }

    public String getHcpcs ()
    {
        return hcpcs;
    }

    public void setHcpcs (String hcpcs)
    {
        this.hcpcs = hcpcs;
    }

    public String getAvg_allowed_amt ()
    {
        return avg_allowed_amt;
    }

    public void setAvg_allowed_amt (String avg_allowed_amt)
    {
        this.avg_allowed_amt = avg_allowed_amt;
    }

    public String getAvg_charge_amt ()
    {
        return avg_charge_amt;
    }

    public void setAvg_charge_amt (String avg_charge_amt)
    {
        this.avg_charge_amt = avg_charge_amt;
    }

    public String getBene_uniq_cnt ()
    {
        return bene_uniq_cnt;
    }

    public void setBene_uniq_cnt (String bene_uniq_cnt)
    {
        this.bene_uniq_cnt = bene_uniq_cnt;
    }

    public String getHcpcs_description ()
    {
        return hcpcs_description;
    }

    public void setHcpcs_description (String hcpcs_description)
    {
        this.hcpcs_description = hcpcs_description;
    }

    public String getAvg_payment_amt ()
    {
        return avg_payment_amt;
    }

    public void setAvg_payment_amt (String avg_payment_amt)
    {
        this.avg_payment_amt = avg_payment_amt;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [service_cnt = "+service_cnt+", hcpcs = "+hcpcs+", avg_allowed_amt = "+avg_allowed_amt+", avg_charge_amt = "+avg_charge_amt+", bene_uniq_cnt = "+bene_uniq_cnt+", hcpcs_description = "+hcpcs_description+", avg_payment_amt = "+avg_payment_amt+"]";
    }
}
