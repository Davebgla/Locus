package com.codeclan.example.server.models;

import com.codeclan.example.server.enums.PropertyType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;


@Entity
@Table(name="properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "host_id", nullable = false)
    private Host host;

    @JsonIgnoreProperties({"property"})
    @OneToMany(mappedBy="property", fetch = FetchType.LAZY)
    private List<Image> images;


    @JsonIgnoreProperties({"property"})
    @OneToMany(mappedBy = "property", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    @Column(name="location")
    private String location;
    @Column(name="postcode")
    private String postcode;
    @Column(name="price_per_night")
    private int pricePerNight;
    @Column(name="description")
    private String description;
    @Column(name="type")
    private PropertyType type;

    public Property(Host host, String location, String postcode, int pricePerNight, String description, PropertyType type) {
        this.host = host;
        this.location = location;
        this.postcode = postcode;
        this.pricePerNight = pricePerNight;
        this.description = description;
        this.type = type;
        this.images = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public Property(){

    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public String getCity() {
        return location;
    }

    public void setCity(String address) {
        this.location = location;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int price) {
        this.pricePerNight = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setPropertyImages(List<Image> images) {
        this.images = images;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
