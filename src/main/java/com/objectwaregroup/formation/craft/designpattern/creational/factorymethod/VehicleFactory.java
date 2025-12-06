package com.objectwaregroup.formation.craft.designpattern.creational.factorymethod;

public class VehicleFactory {

  Vehicle createVehicle(String type) {
    return switch (type) {
      case "Truck" -> new Truck();
      case "Bus" -> new Bus();
      case "Car" -> new Car();
      case "Bike" -> new Bike();
      default -> null;
    };
  }

}
