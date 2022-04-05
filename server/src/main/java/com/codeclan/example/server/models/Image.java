package com.codeclan.example.server.models;

import javax.persistence.*;

@Entity
@Table(name="images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="url")
    private String url;

    @ManyToOne
    @JoinColumn(name="property_id")
    private Property property;

    public Image(String url, Property property){
        this.url = url;
        this.property = property;
    }

    public Image(){}

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url){
        this.url = url;
    }
}
