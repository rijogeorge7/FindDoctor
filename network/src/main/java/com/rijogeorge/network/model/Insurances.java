package com.rijogeorge.network.model;

public class Insurances {
    private Insurance_provider insurance_provider;

    private Insurance_plan insurance_plan;

    public Insurance_provider getInsurance_provider ()
    {
        return insurance_provider;
    }

    public void setInsurance_provider (Insurance_provider insurance_provider)
    {
        this.insurance_provider = insurance_provider;
    }

    public Insurance_plan getInsurance_plan ()
    {
        return insurance_plan;
    }

    public void setInsurance_plan (Insurance_plan insurance_plan)
    {
        this.insurance_plan = insurance_plan;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [insurance_provider = "+insurance_provider+", insurance_plan = "+insurance_plan+"]";
    }
}
