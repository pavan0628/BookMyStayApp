package com.bookmystay.app;

import com.bookmystay.inventory.InventoryService;

public class Main {
    public static void main(String[] args) {

        InventoryService inventory=new InventoryService();

        inventory.addRoomType("single",10,2500);

        inventory.addRoomType("Double",3,5000);

        inventory.addRoomType("Suite",3,8000);

        inventory.displayInventory();

        inventory.searchRooms();

    }
}
