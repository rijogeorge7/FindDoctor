package com.rijogeorge.network.model;

public class Practices {
    private String uid;

    private String lon;

    private String[] office_hours;

    private String website;

    private String location_slug;

    private String within_search_area;

    private String npi;

    private String doctors_pagination_url;

    private String[] image_urls;

    private String tin;

    private String total_doctors;

    private Phones[] phones;

    private Visit_address visit_address;

    private Languages[] languages;

    private String distance;

    private String email;

    private String description;

    private String name;

    private String[] insurance_uids;

    private Doctors[] doctors;

    private String slug;

    private String accepts_new_patients;

    private Media[] media;

    private String lat;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public String[] getOffice_hours ()
    {
        return office_hours;
    }

    public void setOffice_hours (String[] office_hours)
    {
        this.office_hours = office_hours;
    }

    public String getWebsite ()
    {
        return website;
    }

    public void setWebsite (String website)
    {
        this.website = website;
    }

    public String getLocation_slug ()
    {
        return location_slug;
    }

    public void setLocation_slug (String location_slug)
    {
        this.location_slug = location_slug;
    }

    public String getWithin_search_area ()
    {
        return within_search_area;
    }

    public void setWithin_search_area (String within_search_area)
    {
        this.within_search_area = within_search_area;
    }

    public String getNpi ()
    {
        return npi;
    }

    public void setNpi (String npi)
    {
        this.npi = npi;
    }

    public String getDoctors_pagination_url ()
    {
        return doctors_pagination_url;
    }

    public void setDoctors_pagination_url (String doctors_pagination_url)
    {
        this.doctors_pagination_url = doctors_pagination_url;
    }

    public String[] getImage_urls ()
    {
        return image_urls;
    }

    public void setImage_urls (String[] image_urls)
    {
        this.image_urls = image_urls;
    }

    public String getTin ()
    {
        return tin;
    }

    public void setTin (String tin)
    {
        this.tin = tin;
    }

    public String getTotal_doctors ()
    {
        return total_doctors;
    }

    public void setTotal_doctors (String total_doctors)
    {
        this.total_doctors = total_doctors;
    }

    public Phones[] getPhones ()
    {
        return phones;
    }

    public void setPhones (Phones[] phones)
    {
        this.phones = phones;
    }

    public Visit_address getVisit_address ()
    {
        return visit_address;
    }

    public void setVisit_address (Visit_address visit_address)
    {
        this.visit_address = visit_address;
    }

    public Languages[] getLanguages ()
    {
        return languages;
    }

    public void setLanguages (Languages[] languages)
    {
        this.languages = languages;
    }

    public String getDistance ()
    {
        return distance;
    }

    public void setDistance (String distance)
    {
        this.distance = distance;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getInsurance_uids ()
    {
        return insurance_uids;
    }

    public void setInsurance_uids (String[] insurance_uids)
    {
        this.insurance_uids = insurance_uids;
    }

    public Doctors[] getDoctors ()
    {
        return doctors;
    }

    public void setDoctors (Doctors[] doctors)
    {
        this.doctors = doctors;
    }

    public String getSlug ()
    {
        return slug;
    }

    public void setSlug (String slug)
    {
        this.slug = slug;
    }

    public String getAccepts_new_patients ()
    {
        return accepts_new_patients;
    }

    public void setAccepts_new_patients (String accepts_new_patients)
    {
        this.accepts_new_patients = accepts_new_patients;
    }

    public Media[] getMedia ()
    {
        return media;
    }

    public void setMedia (Media[] media)
    {
        this.media = media;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", lon = "+lon+", office_hours = "+office_hours+", website = "+website+", location_slug = "+location_slug+", within_search_area = "+within_search_area+", npi = "+npi+", doctors_pagination_url = "+doctors_pagination_url+", image_urls = "+image_urls+", tin = "+tin+", total_doctors = "+total_doctors+", phones = "+phones+", visit_address = "+visit_address+", languages = "+languages+", distance = "+distance+", email = "+email+", description = "+description+", name = "+name+", insurance_uids = "+insurance_uids+", doctors = "+doctors+", slug = "+slug+", accepts_new_patients = "+accepts_new_patients+", media = "+media+", lat = "+lat+"]";
    }
}
