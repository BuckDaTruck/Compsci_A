package Unit_5.Day_1_HW;

public class Student {
    private String name;
    private int grade;
    private int gradeLevel;
    private boolean hasTakenCs;

    public Student(String name, int grade, int gradeLevel, boolean hasTakenCs) {
        this.name = name;
        this.grade = grade;
        this.gradeLevel = gradeLevel;
        this.hasTakenCs = hasTakenCs;
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
