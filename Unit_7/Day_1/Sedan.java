package Unit_7.Day_1;

public class Sedan extends Vehicle{
    private String color;
    private int numberOfSeats;
    private boolean isLuxury;

    public Sedan(String Make, String Model, int Year, String color, int numberOfSeats, boolean isLuxury) {
        super(Make, Model, Year);
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.isLuxury = isLuxury;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isLuxury() {
        return isLuxury;
    }

    
}
