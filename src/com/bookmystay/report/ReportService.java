package com.bookmystay.report;

import com.bookmystay.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReportService {

    //Stores confirmed bookings
    private List<Reservation> bookingHistory = new ArrayList<>();

    public void addReservation(Reservation reservation){
        bookingHistory.add(reservation);
    }

    public void generateReport(){
        for (Reservation reservation: bookingHistory){
            System.out.println(reservation.getCustomerName());
            System.out.println(reservation.getRoomType());
            System.out.println();
        }
    }

}
