package com.newsapp.newsapp.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;


    @Column(name="title")
    @NotNull
    private String title;


    @Column(name="description")
    @NotNull
    private String description;

    @Lob
    @Column
    private byte[] image;



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
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return "User [title=" + title + ", description=" + description;
    }
}