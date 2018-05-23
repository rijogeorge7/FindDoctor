package com.rijogeorge.network.model;

public class Educations {
    private String degree;

    private String school;

    private String graduation_year;

    public String getDegree ()
    {
        return degree;
    }

    public void setDegree (String degree)
    {
        this.degree = degree;
    }

    public String getSchool ()
    {
        return school;
    }

    public void setSchool (String school)
    {
        this.school = school;
    }

    public String getGraduation_year ()
    {
        return graduation_year;
    }

    public void setGraduation_year (String graduation_year)
    {
        this.graduation_year = graduation_year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [degree = "+degree+", school = "+school+", graduation_year = "+graduation_year+"]";
    }
}
