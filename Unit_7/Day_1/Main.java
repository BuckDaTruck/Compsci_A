package Unit_7.Day_1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Jeep", "Wrangler", 2020);
        System.out.println(vehicle);
        vehicle.start(vehicle);
        vehicle.stop(vehicle);
        // did not do all of main because I gave you a donut!
    }
}