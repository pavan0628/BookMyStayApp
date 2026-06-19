package com.bookmystay.booking;

import com.bookmystay.inventory.InventoryService;
import com.bookmystay.model.Reservation;

public class BookingService {

    private BookingQueueService queue;

    private InventoryService inventory;

    public BookingService(BookingQueueService queue, InventoryService inventory) {
        this.queue = queue;
        this.inventory = inventory;
    }

    public void confirmBooking(){
        Reservation reservation=queue.dequeue();

        inventory.allocateRoom(reservation.getRoomType());
    }

}
