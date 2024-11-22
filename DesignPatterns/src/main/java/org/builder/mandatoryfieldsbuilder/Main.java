package org.builder.mandatoryfieldsbuilder;

public class Main {
    public static void main(String[] args) {
        // Now, we do not have to worry about the mandatory set, 'cause
        // we'll not be able to call the build method without them

        Car c1 = new Car.CarBuilder("Volkswagen", "Golf 4", "1.9 ALH", 2003)
                .color("Gray")
                .fuelType(Car.FuelType.Diesel)
                .build();

        c1.displayInfo();
    }
}
