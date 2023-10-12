import java.io.File;
import java.util.Scanner;

public class Main {
    private static final String fileName = "1.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        String text = textToString(fileName);
        mes("-----------------Original Text:-----------------");
        mes(text);
        int kindergartenCount = 0;
        int elementaryCount = 0;
        int middleSchoolCount = 0;
        int highSchoolCount = 0;
        int advancedCount = 0;

  
        String kindergartenWords ="";
        String elementaryWords = "";
        String middleSchoolWords = "";
        String highSchoolWords = "";
        String advancedWords = "";

        int kIndex = 0;
        int eIndex = 0;
        int msIndex = 0;
        int hsIndex = 0;
        int aIndex = 0;
    }

    private static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }

        return temp.trim();
    }

    public static void mes(String mes) {
        System.out.println(mes);

    }
}