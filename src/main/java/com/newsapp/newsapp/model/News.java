package com.newsapp.newsapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class News {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String title;
    private String description;
    private String imageLocation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }


    @Override
    public String toString() {
        return "User [title=" + title + ", description=" + description + ", imageLocation=" + imageLocation + "]";
    }
}