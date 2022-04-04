package com.codeclan.example.server.models;

import java.util.ArrayList;

public class Guest extends User{

    ArrayList<Booking> bookings;

    public Guest(String firstName, String lastName, String email, String contactNumber, int rating) {
        super(firstName, lastName, email, contactNumber, rating);
        this.bookings = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
