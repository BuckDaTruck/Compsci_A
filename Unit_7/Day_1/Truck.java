package Unit_7.Day_1;

public class Truck extends Vehicle {
    private int TowingCapacity;
    private int EngineSize;
    private int NumberOfDoors;

    public Truck(String Make, String Model, int Year, int TowingCapacity, int EngineSize, int NumberOfDoors) {
        super(Make, Model, Year);
        this.TowingCapacity = TowingCapacity;
        this.EngineSize = EngineSize;
        this.NumberOfDoors = NumberOfDoors;
    }

    public int getTowingCapacity() {
        return TowingCapacity;
    }

    public int getEngineSize() {
        return EngineSize;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }
}
