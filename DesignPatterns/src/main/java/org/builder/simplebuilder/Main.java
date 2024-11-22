package org.builder.simplebuilder;

public class Main {
    public static void main(String[] args) {
        /**
         * Let's create a complete car (with all mandatory fields set.
         */
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

        /**
         * For this car, with all fields set, it works fine.
         */
        completeCar.displayInfo();

        /**
         * Now, let's try to create an incomplete car.
         * An incomplete car means that not all mandatory
         * fields where filled
         */
        Car incompleteCar = new Car.CarBuilder()
                .brand("Opel")
                .model("Astra G")
                .year(2007)
                .build();

        /**
         * We'll realize that this builder has a problem.
         * The mandatory fields are just a convention at this point.
         * This builder permits the creation of objects with mandatory
         * fields not yet filled, and we don't want that to happen.
         *
         * Unfortunately, if we want to make a Builder after this pattern,
         * there is no way we can put a constraint on the build method,
         * so it won't work if the mandatory fields weren't set previously.
         *
         * But what if we put parameters on the Builder constructor?
         * For this, check the mandatoryfieldsbuilder package.
         */
        incompleteCar.displayInfo();
    }
}
