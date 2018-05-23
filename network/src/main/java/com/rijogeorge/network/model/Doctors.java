package com.rijogeorge.network.model;

public class Doctors {
    private String uid;

    private Claims[] claims;

    private Insurances[] insurances;

    private Specialties[] specialties;

    private String npi;

    private Licenses[] licenses;

    private Group_affiliations[] group_affiliations;

    private Educations[] educations;

    private Hospital_affiliations[] hospital_affiliations;

    private Ratings[] ratings;

    private Profile profile;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public Claims[] getClaims ()
    {
        return claims;
    }

    public void setClaims (Claims[] claims)
    {
        this.claims = claims;
    }

    public Insurances[] getInsurances ()
    {
        return insurances;
    }

    public void setInsurances (Insurances[] insurances)
    {
        this.insurances = insurances;
    }

    public Specialties[] getSpecialties ()
    {
        return specialties;
    }

    public void setSpecialties (Specialties[] specialties)
    {
        this.specialties = specialties;
    }

    public String getNpi ()
    {
        return npi;
    }

    public void setNpi (String npi)
    {
        this.npi = npi;
    }

    public Licenses[] getLicenses ()
    {
        return licenses;
    }

    public void setLicenses (Licenses[] licenses)
    {
        this.licenses = licenses;
    }

    public Group_affiliations[] getGroup_affiliations ()
    {
        return group_affiliations;
    }

    public void setGroup_affiliations (Group_affiliations[] group_affiliations)
    {
        this.group_affiliations = group_affiliations;
    }

    public Educations[] getEducations ()
    {
        return educations;
    }

    public void setEducations (Educations[] educations)
    {
        this.educations = educations;
    }

    public Hospital_affiliations[] getHospital_affiliations ()
    {
        return hospital_affiliations;
    }

    public void setHospital_affiliations (Hospital_affiliations[] hospital_affiliations)
    {
        this.hospital_affiliations = hospital_affiliations;
    }

    public Ratings[] getRatings ()
    {
        return ratings;
    }

    public void setRatings (Ratings[] ratings)
    {
        this.ratings = ratings;
    }

    public Profile getProfile ()
    {
        return profile;
    }

    public void setProfile (Profile profile)
    {
        this.profile = profile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", claims = "+claims+", insurances = "+insurances+", specialties = "+specialties+", npi = "+npi+", licenses = "+licenses+", group_affiliations = "+group_affiliations+", educations = "+educations+", hospital_affiliations = "+hospital_affiliations+", ratings = "+ratings+", profile = "+profile+"]";
    }
}
