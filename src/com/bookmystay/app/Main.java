package com.bookmystay.app;

import com.bookmystay.booking.BookingQueueService;
import com.bookmystay.inventory.InventoryService;
import com.bookmystay.model.Reservation;

public class Main {
    public static void main(String[] args) {

        InventoryService inventory=new InventoryService();

        inventory.addRoomType("single",10,2500);

        inventory.addRoomType("Double",3,5000);

        inventory.addRoomType("Suite",3,8000);

        inventory.displayInventory();

        inventory.searchRooms();

        BookingQueueService bookingQueueService=new BookingQueueService();

        Reservation reservation=new Reservation("Pavan","Single");

        bookingQueueService.enqueue(reservation);

    }
}
