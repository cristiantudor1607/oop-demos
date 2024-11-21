package org.builder.simplebuilder;

public class Main {
    public static void main(String[] args) {
        // Let's create a complete specified car
        Car completeCar = new Car.CarBuilder().brand("BMW")
                .model("4 Series")
                .year(2022)
                .engine("B48B20M0")
                .color("Blue")
                .fuelType(Car.FuelType.Gasoline)
                .soundSystem("Harman Kardon")
                .heatedSeats(false)
                .hasAdaptiveHeadlights(true)
                .build();

        // Check if everything works fine
        completeCar.displayInfo();

        // Now, let's try to create an incomplete car. An incomplete car
        // means that not all mandatory fields where filled
        Car incompleteCar = new Car.CarBuilder()
                .brand("Opel")
                .model("Astra G")
                .year(2007)
                .build();

        incompleteCar.displayInfo();
    }
}
