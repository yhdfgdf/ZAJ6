public class Main {

    public static void main(String[] args) {
        Car c = new Car("Alfa Romeo", "Juilia", 2020, 100, 12);
        c.calculateFuelEfficiency();

        Truck t = new Truck("Volvo", "FH", 2015, 15000, 450, 10000);
        t.calculateFuelEfficiency();
    }

}
