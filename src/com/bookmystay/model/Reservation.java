package com.bookmystay.model;

//Represents the booking request
public class Reservation {

    private String customerName;
    private String roomType;


    public Reservation(String customerName, String roomType) {
        this.customerName = customerName;
        this.roomType = roomType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRoomType() {
        return roomType;
    }
}
