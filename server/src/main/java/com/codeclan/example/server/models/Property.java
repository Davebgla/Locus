package com.codeclan.example.server.models;

public class Property {

    private long id;
    private Host host;
    private String address;
    private int pricePerNight;

    public Property(Host host, String address, int pricePerNight) {
        this.host = host;
        this.address = address;
        this.pricePerNight = pricePerNight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getPrice() {
        return pricePerNight;
    }

    public void setPrice(int price) {
        this.pricePerNight = price;
    }
}
