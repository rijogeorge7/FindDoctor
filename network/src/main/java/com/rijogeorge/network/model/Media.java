package com.rijogeorge.network.model;

public class Media {
    private String[] tags;

    private String uid;

    private Versions versions;

    private String status;

    private String url;

    public String[] getTags ()
    {
        return tags;
    }

    public void setTags (String[] tags)
    {
        this.tags = tags;
    }

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public Versions getVersions ()
    {
        return versions;
    }

    public void setVersions (Versions versions)
    {
        this.versions = versions;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tags = "+tags+", uid = "+uid+", versions = "+versions+", status = "+status+", url = "+url+"]";
    }
}
