package com.codeclan.example.server.enums;

public enum PropertyType {
    ONE_BED(1, 2),
    TWO_BED(2, 4),
    THREE_BED(3, 6),
    LODGE(4, 8),
    VILLA(6, 12);

    private final int numberOfBeds;
    private final int numberOfGuests;

    PropertyType(int numberOfBeds, int numberOfGuests) {
        this.numberOfBeds = numberOfBeds;
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}
