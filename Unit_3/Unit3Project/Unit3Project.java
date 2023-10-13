
/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * Description: Unit 3 project to summarize text difficulty and reading level.
 */
import java.io.File;
import java.util.Scanner;

public class Unit3Project {

    static int kindergartenCount = 0;
    static int elementaryCount = 0;
    static int middleSchoolCount = 0;
    static int highSchoolCount = 0;
    static int advancedCount = 0;
    static double totalCount = 0;
    static double totalWords = 0;
    static String kindergartenWords = "";
    static String elementaryWords = "";
    static String middleSchoolWords = "";
    static String highSchoolWords = "";
    static String advancedWords = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        String text = textToString(fileName);
        mes("-----------------Original Text:-----------------");
        mes(text);
        sort(text);
        finish();
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

    public static void sort(String text) {
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char start = text.charAt(i);
            if (Character.isLetterOrDigit(start)) {
                word += start;

            } else {
                if (word.length() > 0) {
                    totalWords++;
                    totalCount += word.length();
                    if (word.length() <= 4) {
                        kindergartenCount++;
                        kindergartenWords = kindergartenWords + word + " ";
                    } else if (word.length() <= 6) {
                        elementaryCount++;
                        elementaryWords = elementaryWords + word + " ";
                    } else if (word.length() <= 10) {
                        middleSchoolCount++;
                        middleSchoolWords = middleSchoolWords + word + " ";
                    } else if (word.length() <= 14) {
                        highSchoolCount++;
                        highSchoolWords = highSchoolWords + word + " ";
                    } else {
                        advancedCount++;
                        advancedWords = advancedWords + word + " ";
                    }
                }
                word = "";
            }
        }
    }

    public static void finish() {
        mes("-------------------Level Breakdowns-------------------");
        System.out.print("Kindergarten-Level words:");
        System.out.println(kindergartenCount);
        System.out.print("Elementary-Level words:");
        System.out.println(elementaryCount);
        System.out.print("Middle-School-Level words:");
        System.out.println(middleSchoolCount);
        System.out.print("High-School-Level words:");
        System.out.println(highSchoolCount);
        System.out.print("Advanced-Level words:");
        System.out.println(advancedCount);

        mes("-------------------Words In Each Category -------------------");
        mes("-------Kindergarten-Level words:-------");
        mes(kindergartenWords);
        mes("-------Elementary-Level words:-------");
        mes(elementaryWords);
        mes("-------Middle-School-Level words:-------");
        mes(middleSchoolWords);
        mes("-------High-School-Level words:-------");
        mes(highSchoolWords);
        mes("-------Advanced-Level words:-------");
        mes(advancedWords);
        System.out.print("Total Words:");
        System.out.println(totalWords);
        System.out.print("Total Characters:");
        System.out.println(totalCount);

        double averageLength =  totalCount/totalWords;
        String readingLevel = "";
        if (averageLength <= 4) {
            readingLevel = "kindergarten";
        } else if (averageLength <= 6) {
            readingLevel = "elementary";
        } else if (averageLength <= 10) {
            readingLevel = "middle school";
        } else if (averageLength <= 14) {
            readingLevel = "high school";
        } else {
            readingLevel = "advanced";
        }

        mes("-------------------Reading Level-------------------");
        mes(String.format(
                "The average word length in this text is %.2f letters, so it appears to be of %s reading level",
                averageLength, readingLevel));
    }

    public static void mes(String mes) {
        System.out.println(mes);
    }
}
//Code written by Buckley Wiley