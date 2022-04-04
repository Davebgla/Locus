package com.codeclan.example.server.models;

public class Booking {

    private Long id;
    private Guest guest;
    private Host host;
    private Property property;
    private int numberOfNights;
    private int numberOfGuests;

    public Booking(Guest guest, Host host, Property property, int numberOfNights, int numberOfGuests){
        this.guest = guest;
        this.host = host;
        this.property = property;
        this.numberOfNights = numberOfNights;
        this.numberOfGuests = numberOfGuests;
    }

    public Booking(){}

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Guest getGuest(){
        return this.guest;
    }

    public void setGuest(Guest guest){
        this.guest = guest;
    }

    public Host getHost(){
        return this.host;
    }

    public void setHost(Host host){
        this.host = host;
    }

    public Property getProperty(){
        return this.property;
    }

    public void setProperty(Property property){
        this.property = property;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfGuests(){
        return this.numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
    }

}
