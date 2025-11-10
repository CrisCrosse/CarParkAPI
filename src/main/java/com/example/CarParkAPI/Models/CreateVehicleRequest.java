package com.example.CarParkAPI.Models;

public record CreateVehicleRequest(
        String registration_plate,
        VehicleType vehicleType,
        String cardNumber,
        String customerName,
        String customerEmail
) {
    public Vehicle toVehicle() {
        return new Vehicle("1", this.vehicleType, this.registration_plate, this.cardNumber, this.customerName, this.customerEmail);
    }
}
