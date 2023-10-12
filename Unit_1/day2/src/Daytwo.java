import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Daytwo {
    public static void main(String[] args) {
        try {
            File myfile = new File("class.txt");
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of students");
        int students = myObj.nextInt();  // Read user input
        System.out.println("You have : " + students + " students");  // Output user input
        System.out.println("Enter names of students");
        Scanner mynames = new Scanner(System.in);
        String name = mynames.nextLine();
        int countNames = name.split("\\s").length;
        String[] array = new String[students];
        array[5]=name.split("\\s");

        System.out.println(countNames);
        System.out.println(Arrays.toString(array));
        if (countNames < students) {
            int x = students - countNames;
            System.out.println("You were short by " + x + " students.");
            Scanner missed = new Scanner(System.in);
            System.out.println(Arrays.toString(array));
            System.out.println("Enter missed names.");
            int missednames = missed.nextInt();  // Read user input
        }

        try {
            FileWriter myWriter = new FileWriter("class.txt");
            myWriter.write(students + " ");
            for (int i = 0; i < array.length; i++) {
                myWriter.write(array[i] + " ");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
//Code written by Buckley Wiley
