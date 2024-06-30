abstract class Vehicle {
    String make, model;
    int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract double calculateFuelEfficiency();

}
