package com.codeclan.example.server.models;

import com.codeclan.example.server.enums.PropertyType;


import javax.persistence.*;

@Entity
@Table(name="properties")

public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "host_id", nullable = false)
    private Host host;

    @Column(name="address")

    private ArrayList<String> propertyImages;
    private ArrayList<Booking> bookings;

    private String address;
    @Column(name="price_per_night")
    private int pricePerNight;
    @Column(name="description")
    private String description;<<<<<<< feature/host-controller
    @Column(name="type")

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

    public Property(){

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
