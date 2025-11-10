package com.example.CarParkAPI.Models;

public record Vehicle(
        String id,
        VehicleType type,
        String registration_plate,
        String cardNumber,
        String customerName,
        String customerEmail
){}
