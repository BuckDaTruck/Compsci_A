package Unit_7.Day_1;

public class Car extends Vehicle{ 
    private int NumberOfDoors;
    private int EngineSize;
    private int NumberOfSeats;

    public Car(String Make, String Model, int Year, int NumberOfDoors, int EngineSize, int NumberOfSeats) {
        super(Make, Model, Year);
        this.NumberOfDoors = NumberOfDoors;
        this.EngineSize = EngineSize;
        this.NumberOfSeats = NumberOfSeats;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public int getEngineSize() {
        return EngineSize;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }
}
