package com.codeclan.example.server.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guest extends User{

    @OneToMany(mappedBy = "guest", fetch = FetchType.LAZY)
    @JsonBackReference
    List<Booking> bookings;

    public Guest(String firstName, String lastName, String email, String contactNumber, int rating) {
        super(firstName, lastName, email, contactNumber, rating);
        this.bookings = new ArrayList<>();
    }

    public Guest(){

    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
