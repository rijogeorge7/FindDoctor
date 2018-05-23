package com.rijogeorge.network.model;

public class Profile {
    private Languages[] languages;

    private String first_name;

    private String title;

    private String bio;

    private String image_url;

    private String middle_name;

    private String last_name;

    private String gender;

    private String slug;

    public Languages[] getLanguages ()
    {
        return languages;
    }

    public void setLanguages (Languages[] languages)
    {
        this.languages = languages;
    }

    public String getFirst_name ()
    {
        return first_name;
    }

    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getBio ()
    {
        return bio;
    }

    public void setBio (String bio)
    {
        this.bio = bio;
    }

    public String getImage_url ()
    {
        return image_url;
    }

    public void setImage_url (String image_url)
    {
        this.image_url = image_url;
    }

    public String getMiddle_name ()
    {
        return middle_name;
    }

    public void setMiddle_name (String middle_name)
    {
        this.middle_name = middle_name;
    }

    public String getLast_name ()
    {
        return last_name;
    }

    public void setLast_name (String last_name)
    {
        this.last_name = last_name;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getSlug ()
    {
        return slug;
    }

    public void setSlug (String slug)
    {
        this.slug = slug;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [languages = "+languages+", first_name = "+first_name+", title = "+title+", bio = "+bio+", image_url = "+image_url+", middle_name = "+middle_name+", last_name = "+last_name+", gender = "+gender+", slug = "+slug+"]";
    }
}
