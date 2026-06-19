package com.bookmystay.addon;

import com.bookmystay.model.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddOnServiceManager {
    private Map<String, List<Service>> reservationServices=new HashMap<>();

    public void addService(String reservationId,Service service){

        reservationServices.computeIfAbsent(reservationId,k->new ArrayList<>())
                .add(service);
    }

    public double calculateCost(String reservationId){
        double total=0;
        List<Service> services=reservationServices.get(reservationId);

        for(Service service:services){
            total+=service.getPrice();
        }
        return total;
    }


}
