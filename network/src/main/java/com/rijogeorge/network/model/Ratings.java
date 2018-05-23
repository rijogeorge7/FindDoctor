package com.rijogeorge.network.model;

public class Ratings {
    private String image_url_small_2x;

    private String review_count;

    private String image_url_large;

    private String provider_uid;

    private String active;

    private String provider;

    private String rating;

    private String provider_url;

    private String image_url_large_2x;

    private String image_url_small;

    public String getImage_url_small_2x ()
    {
        return image_url_small_2x;
    }

    public void setImage_url_small_2x (String image_url_small_2x)
    {
        this.image_url_small_2x = image_url_small_2x;
    }

    public String getReview_count ()
    {
        return review_count;
    }

    public void setReview_count (String review_count)
    {
        this.review_count = review_count;
    }

    public String getImage_url_large ()
    {
        return image_url_large;
    }

    public void setImage_url_large (String image_url_large)
    {
        this.image_url_large = image_url_large;
    }

    public String getProvider_uid ()
    {
        return provider_uid;
    }

    public void setProvider_uid (String provider_uid)
    {
        this.provider_uid = provider_uid;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getProvider ()
    {
        return provider;
    }

    public void setProvider (String provider)
    {
        this.provider = provider;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getProvider_url ()
    {
        return provider_url;
    }

    public void setProvider_url (String provider_url)
    {
        this.provider_url = provider_url;
    }

    public String getImage_url_large_2x ()
    {
        return image_url_large_2x;
    }

    public void setImage_url_large_2x (String image_url_large_2x)
    {
        this.image_url_large_2x = image_url_large_2x;
    }

    public String getImage_url_small ()
    {
        return image_url_small;
    }

    public void setImage_url_small (String image_url_small)
    {
        this.image_url_small = image_url_small;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [image_url_small_2x = "+image_url_small_2x+", review_count = "+review_count+", image_url_large = "+image_url_large+", provider_uid = "+provider_uid+", active = "+active+", provider = "+provider+", rating = "+rating+", provider_url = "+provider_url+", image_url_large_2x = "+image_url_large_2x+", image_url_small = "+image_url_small+"]";
    }
}
