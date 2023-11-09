package Unit_5.Day_1_HW;

public class Day_1_HW{
    private String name;
    private int grade;
    private int gradeLevel;
    private boolean hasTakenCs;

    public Day_1_HW(String name, int grade, int gradeLevel, boolean hasTakenCs) {

    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public boolean hasTakenCs() {
        return hasTakenCs;
    }

    public String toString() {
        return "Name: " + name + ", Grade: " + grade + ", Grade Level: " + gradeLevel + ", Has taken CS: " + hasTakenCs;
    }
}
