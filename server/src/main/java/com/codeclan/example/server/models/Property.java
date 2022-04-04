package com.codeclan.example.server.models;

import com.codeclan.example.server.enums.PropertyType;

import java.util.ArrayList;

public class Property {

    private Long id;
    private Host host;
    private ArrayList<String> propertyImages;
    private ArrayList<Booking> bookings;
    private String address;
    private int pricePerNight;
    private String description;
    private PropertyType type;

    public Property(Host host, String address, int pricePerNight, String description, PropertyType type) {
        this.host = host;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.description = description;
        this.type = type;
        this.propertyImages = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public Property(){}

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public ArrayList<String> getPropertyImages() {
        return propertyImages;
    }

    public void setPropertyImages(ArrayList<String> propertyImages) {
        this.propertyImages = propertyImages;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
