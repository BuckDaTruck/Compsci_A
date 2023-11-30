package Unit_5.Day_3;

public class Main {
    public static void main(String[] args) {
        cssstudentdata student = new cssstudentdata("John Doe", "Test 1", 85, true, true);

        System.out.println("Name: " + student.getName());
        System.out.println("Test: " + student.getTest());
        System.out.println("Score: " + student.getScore());
        System.out.println("Has taken Principles: " + student.hasTakenPrinciples());
        System.out.println("Is participating: " + student.isParticipating());
        student.Extrapractice();
    }
}