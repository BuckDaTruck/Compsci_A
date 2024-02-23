package Unit_7.Day_1;

public class Vehicle {
    private String Make;
    private String Model;
    private int Year;

    public Vehicle(String Make, String Model, int Year) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public void start(Vehicle vehicle) {
        System.out.println(this.Make + " " + this.Model + " is starting");
    }

    public void stop(Vehicle vehicle) {
        System.out.println(this.Make + " " + this.Model + " is stopping");
    }

@Override
public String toString() {
    return "Vehicle{" +
            "Make='" + Make + '\'' +
            ", Model='" + Model + '\'' +
            ", Year=" + Year +
            '}';
}
}