package com.codeclan.example.server.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Guest extends User{

    @OneToMany(mappedBy = "guest", fetch = FetchType.LAZY)
    @JsonBackReference
    ArrayList<Booking> bookings;

    public Guest(String firstName, String lastName, String email, String contactNumber, int rating) {
        super(firstName, lastName, email, contactNumber, rating);
        this.bookings = new ArrayList<>();
    }

    public Guest(){

    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
