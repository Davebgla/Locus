package com.codeclan.example.server.enums;

public enum PropertyType {
    ONE_BED(1, 2),
    TWO_BED(2, 4),
    THREE_BED(3, 6),
    COTTAGE(2, 4),
    LODGE(4, 8),
    MANSION(6, 12);

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
