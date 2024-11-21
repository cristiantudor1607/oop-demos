package org.builder.simplebuilder;

public class Car {

    public enum FuelType {
        Diesel, Gasoline, MildHybrid, PlugInHybrid, Electrical, LPG
    }

    private final String brand;
    private final String model;
    private final String engine;
    private final int year;

    private String color;
    private FuelType fuelType;

    private boolean hasSoundSystem;
    private String soundSystem;

    private boolean hasHeatedSeats;
    private boolean hasAdaptiveHeadlights;

    static class CarBuilder {
        private String brand;
        private String model;
        private String engine;
        private int year;

        private String color;
        private FuelType fuelType;
        private boolean hasSoundSystem;
        private String soundSystem;
        private boolean hasHeatedSeats;
        private boolean hasAdaptiveHeadlights;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder fuelType(FuelType fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder soundSystem(String soundSystem) {
            this.hasSoundSystem = true;
            this.soundSystem = soundSystem;
            return this;
        }

        public CarBuilder heatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        public CarBuilder hasAdaptiveHeadlights(boolean hasAdaptiveHeadlights) {
            this.hasAdaptiveHeadlights = hasAdaptiveHeadlights;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.engine = builder.engine;
        this.year = builder.year;

        this.color = builder.color;
        this.fuelType = builder.fuelType;
        this.hasSoundSystem = builder.hasSoundSystem;
        this.soundSystem = builder.soundSystem;
        this.hasHeatedSeats = builder.hasHeatedSeats;
        this.hasAdaptiveHeadlights = builder.hasAdaptiveHeadlights;
    }

    void displayInfo() {
        System.out.println(brand + " " + model + " " + year + " with "
                + engine + " engine");
        System.out.println("Color: " +
                ((color == null) ? "Not specified" : color));
        System.out.println("Fuel type: " +
                ((fuelType == null) ? "Not specified" : fuelType));
        System.out.println("--- Optionals ---");
        System.out.println("Sound system: " +
                (hasSoundSystem ? soundSystem : "No"));
        System.out.println("Heated seats: " +
                (hasHeatedSeats ? "Yes" : "No"));
        System.out.println("Adaptive headlights: " +
                (hasAdaptiveHeadlights ? "Yes" : "No"));
    }
}
