package com.example.apptest.model;

public class Results {
    private String utc_offset;

    private String country;

    private String visibility;

    private String city;

    private String timezone;

    private String created;

//    private Topics[] topics;

    private String link;

    private String rating;

    private String description;

    private String lon;

    //private Group_photo group_photo;

    private String join_mode;

  //  private Organizer organizer;

    private String members;

    private String name;

    private String id;

    private String state;

    private String urlname;

    //private Category category;

    private String lat;

    private String who;

    public String getUtc_offset ()
    {
        return utc_offset;
    }

    public void setUtc_offset (String utc_offset)
    {
        this.utc_offset = utc_offset;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getVisibility ()
    {
        return visibility;
    }

    public void setVisibility (String visibility)
    {
        this.visibility = visibility;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (String timezone)
    {
        this.timezone = timezone;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    /*public Topics[] getTopics ()
    {
        return topics;
    }

    public void setTopics (Topics[] topics)
    {
        this.topics = topics;
    }*/

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

   /* public Group_photo getGroup_photo ()
    {
        return group_photo;
    }

    public void setGroup_photo (Group_photo group_photo)
    {
        this.group_photo = group_photo;
    }*/

    public String getJoin_mode ()
    {
        return join_mode;
    }

    public void setJoin_mode (String join_mode)
    {
        this.join_mode = join_mode;
    }

    /*public Organizer getOrganizer ()
    {
        return organizer;
    }

    public void setOrganizer (Organizer organizer)
    {
        this.organizer = organizer;
    }*/

    public String getMembers ()
    {
        return members;
    }

    public void setMembers (String members)
    {
        this.members = members;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getUrlname ()
    {
        return urlname;
    }

    public void setUrlname (String urlname)
    {
        this.urlname = urlname;
    }

    /* public Category getCategory ()
     {
         return category;
     }

     public void setCategory (Category category)
     {
         this.category = category;
     }
 */
    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    public String getWho ()
    {
        return who;
    }

    public void setWho (String who)
    {
        this.who = who;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [utc_offset = "+utc_offset+", country = "+country+", visibility = "+visibility+", city = "+city+", timezone = "+timezone+", created = "+created+", topics = "+", link = "+link+", rating = "+rating+", description = "+description+", lon = "+lon+", group_photo = "+ ", join_mode = "+join_mode+", organizer = "+ ", members = "+members+", name = "+name+", id = "+id+", state = "+state+", urlname = "+urlname+", category = "+", lat = "+lat+", who = "+who+"]";
    }
}
