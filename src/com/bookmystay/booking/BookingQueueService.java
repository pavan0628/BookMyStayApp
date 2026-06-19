package com.bookmystay.booking;

import com.bookmystay.model.Reservation;

import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueService {

    //Queue mainatains FIFO
    private Queue<Reservation> bookingQueue=new LinkedList<>();

    //add booking request
    public void enqueue(Reservation reservation){

        bookingQueue.offer(reservation);

    }

    //remove first booking request
    public Reservation dequeue(){
        return bookingQueue.poll();
    }
}
