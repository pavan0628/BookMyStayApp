package com.bookmystay.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    /*
     * Stores room type and available count
     */
    private Map<String, Integer> roomCountMap = new HashMap<>();


    /*
     * Stores room type and price
     */
    private Map<String, Double> roomPriceMap = new HashMap<>();


    /*
     * Add a new room type into inventory
     */
    public void addRoomType(String roomType,
                            int count,
                            double price) {

        roomCountMap.put(roomType, count);

        roomPriceMap.put(roomType, price);
    }


    /*
     * Update room count
     */
    public void updateRoomCount(String roomType,
                                int count) {

        roomCountMap.put(roomType, count);

    }


    /*
     * Update room price
     */
    public void updateRoomPrice(String roomType,
                                double price) {

        roomPriceMap.put(roomType, price);

    }


    /*
     * Display current inventory
     */
    public void displayInventory() {

        for (String roomType : roomCountMap.keySet()) {

            System.out.println("Room Type : "
                    + roomType);

            System.out.println("Available Rooms : "
                    + roomCountMap.get(roomType));

            System.out.println("Price Per Night : "
                    + roomPriceMap.get(roomType));

            System.out.println();

        }

    }
//    check room availability
    public boolean isAvailable(String roomType){
        return roomCountMap.getOrDefault(roomType,0)>0;
    }

    //get room price
    public double getRoomPrice(String rooomType){
        return roomPriceMap.get(rooomType);
    }

    //display only available rooms
    public void searchRooms(){
        for(String roomType:roomCountMap.keySet()){
            if(roomCountMap.get(roomType)>0){
                System.out.println("Room Type: "+roomType);
                System.out.println("Price: "+roomPriceMap.get(roomType));
                System.out.println();
            }
        }


    }

}
