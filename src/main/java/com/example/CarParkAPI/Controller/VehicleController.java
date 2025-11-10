package com.example.CarParkAPI.Controller;

import com.example.CarParkAPI.Models.CreateVehicleRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class VehicleController {

    @PostMapping("/Vehicle")
    public String CreateVehicle(CreateVehicleRequest request){
        var vehicle = request.toVehicle();
        var logger = Logger.getLogger("myLogger");
        logger.log(Level.INFO, String.format("Received a request to create a vehicle for %s", vehicle.customerName()));
////        TODO implement parking database
//        var vehicleId = vehicle.save();
        return vehicle.id();
    }
}
