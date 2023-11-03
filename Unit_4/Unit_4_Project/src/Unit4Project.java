
/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * For help, visit: http://buckleywiley.com/forum/Code/forum.html
 * Description: Unit 4 project to parse weather data.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Unit4Project {
    public static void main(String[] args) {
        int points = 3;
        int days = 365;
        String[] data = readData();
        int[][] hla = new int[days][points];
        int[][] monthStartEnd = new int[12][2];
        int[][] hlaMonth = new int[12][points];
        int[] hlaYear = new int[days];
        startup();
        parseMonth(data, monthStartEnd, days);
        parseHLA(data, hla, days);
        hlaMonthStartEnd(hla, monthStartEnd, days, points, hlaMonth);
        loop(data, hla, monthStartEnd, days, points, hlaMonth, hlaYear);
    }

    public static void loop(String[] data, int[][] hla, int[][] monthStartEnd, int days, int points, int[][] hlaMonth,
            int[] hlaYear) {
        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i + 1) + " starts at position " + monthStartEnd[i][0]
                    + " and ends at position " + monthStartEnd[i][1]);
            wait(20);
        }
        for (int i = 0; i < days; i++) {
            System.out.println(
                    "day " + (i + 1) + " high is " + hla[i][0] + " low is " + hla[i][1] + " average is " + hla[i][2]);
            wait(5);
        }
        boolean end = false;
        while (!end) {
            int choice = choice();
            if (choice == 1) {
                lineFromDate(data, hla, days);
            }
            if (choice == 2) {
                enterMonth(hlaMonth);
            }
            if (choice == 3) {
                largeTempChange(data, hla, days);
            }
            if (choice == 4) {
                for (int i = 0; i < 12; i++) {
                    System.out.println("Month " + (i + 1) + " high is " + hlaMonth[i][0] + " low is " + hlaMonth[i][1]
                            + " average is " + hlaMonth[i][2]);
                    wait(100);
                }
                hlaYear(hla, days, hlaYear);
                wait(1000);
            }
            if (choice == 5) {
                end = true;
            }
            choice = 0;
        }
    }

    public static void startup() {
        System.out.println("Starting Weather Data Analysis");
        wait(100);
        System.out.println("Starting Weather Data Analysis.");
        wait(100);
        System.out.println("Starting Weather Data Analysis..");
        wait(100);
        System.out.println("Starting Weather Data Analysis...");
        wait(500);
        System.out.println("Loading Data");
        wait(100);
        System.out.println("Loading Data.");
        wait(100);
        System.out.println("Loading Data..");
        wait(100);
        System.out.println("Loading Data...");
        wait(100);
        System.out.println(
                "╔╗╔╗╔╗╔╗────────╔══╗────╔╗─────╔╗\n║║║║║║║║────────╚╣╠╝────║║────╔╝╚╗\n║║║║║╠╣║╔══╦╗─╔╗─║║╔═╗╔═╝╠╗╔╦═╩╗╔╬═╦╦══╦══╗\n║╚╝╚╝╠╣║║║═╣║─║║─║║║╔╗╣╔╗║║║║══╣║║╔╬╣║═╣══╣\n╚╗╔╗╔╣║╚╣║═╣╚═╝║╔╣╠╣║║║╚╝║╚╝╠══║╚╣║║║║═╬══║\n─╚╝╚╝╚╩═╩══╩═╗╔╝╚══╩╝╚╩══╩══╩══╩═╩╝╚╩══╩══╝\n───────────╔═║\n───────────╚══╝\n");
        wait(1000);
    }

    public static void largeTempChange(String[] data, int[][] hla, int days) {
        int dayNumber = -1;
        Scanner Datescanner1 = new Scanner(System.in);
        System.out.print("Enter the first date using (mm/dd/yyyy): ");
        String date = Datescanner1.nextLine();

        for (int i = 0; i < days; i++) {
            String[] parts = data[i].split("-");
            if (date.equals(parts[0])) {
                dayNumber = i;
            }
        }
        if (dayNumber == -1) {
            System.out.println(
                    "Invalid Date not found in the dataset. Make sure the date is in the correct format.(mm/dd/yyyy)");
            wait(1000);
            return;
        }
        int dayNumber2 = -1;
        Scanner Datescanner2 = new Scanner(System.in);
        System.out.print("Enter the first date using (mm/dd/yyyy): ");
        String date2 = Datescanner2.nextLine();

        for (int i = 0; i < days; i++) {
            String[] parts = data[i].split("-");
            if (date2.equals(parts[0])) {
                dayNumber2 = i;
            }
        }
        if (dayNumber2 == -1) {
            System.out.println(
                    "Invalid Date not found in the dataset. Make sure the date is in the correct format.(mm/dd/yyyy)");
            wait(1000);
            return;
        }

        int maxTemperatureChange = 0;
        String dateWithMaxChange = "";
        int span = dayNumber2 - dayNumber;
        for (int i = dayNumber; i <= dayNumber2; i++) {
            int temperatureChange = Math.abs(hla[i][0] - hla[i][1]);
            if (temperatureChange > maxTemperatureChange) {
                maxTemperatureChange = temperatureChange;
                dateWithMaxChange = data[i].split("-")[0];
            }
        }
        System.out.println(dateWithMaxChange + " had the largest temperature change of " + maxTemperatureChange
                + " between the dates" + date + " and " + date2 + " spanning " + span + " days.");
        wait(1000);
    }

    public static int choice() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1. Show the highest and lowest temperature for a particular date.");
        System.out.println(
                "2. Provide the overall highest, lowest temperature and average temperature for a particular month.");
        System.out.println("3. Find the date of the most drastic temperature change between a range of 2 dates");
        System.out.println("4. Print out yearly statistics");
        System.out.println("5. Exit the program");
        wait(500);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 6) {
            String input = myObj.next();
            if (input.matches("[1-6]")) {
                choice = Integer.parseInt(input);
            } else {
                System.out.println("Invalid Choice.");
                System.out.println("Please enter an integer 1-6.");
            }
        }
        wait(1000);
        return choice;
    }

    public static void enterMonth(int[][] hlaMonth) {
        Scanner entermnthScanner = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = entermnthScanner.nextInt();
        if (month < 13 && month > 0) {
            System.out.print("High " + hlaMonth[month - 1][0]);
            System.out.print(" Low " + hlaMonth[month - 1][1]);
            System.out.println(" Average " + hlaMonth[month - 1][2]);
        } else {
            System.out.println("Invalid month number.");
        }
        wait(1000);
    }

    public static void lineFromDate(String[] data, int[][] hla, int days) {
        int dayNumber = -1;
        Scanner lineFromDatescanner = new Scanner(System.in);
        System.out.print("Enter the date using slashes (mm/dd/yyyy): ");
        String date = lineFromDatescanner.nextLine();

        for (int i = 0; i < days; i++) {
            String[] parts = data[i].split("-");
            if (date.equals(parts[0])) {
                dayNumber = i;
            }
        }
        if (dayNumber == -1) {
            System.out.println("Date not found in the dataset.");
            wait(1000);
            return;
        }
        System.out.println(
                "day " + (dayNumber + 1) + " high is " + hla[dayNumber][0] + " low is " + hla[dayNumber][1]
                        + " average is " + hla[dayNumber][2]);
        if (dayNumber > 0) {
            System.out.println(
                    "For the day before " + "the high is " + hla[dayNumber - 1][0] + " low is " + hla[dayNumber - 1][1]
                            + " average is " + hla[dayNumber - 1][2]);
        } else {
            System.out.println("No data available for the day before.");
        }
        if (dayNumber < days - 1) {
            System.out.println(
                    "For the day after " + "the high is " + hla[dayNumber + 1][0] + " low is " + hla[dayNumber + 1][1]
                            + " average is " + hla[dayNumber + 1][2]);
        } else {
            System.out.println("No data available for the day after.");
        }
        wait(1000);
    }

    public static void hlaYear(int[][] hla, int days, int[] hlaYear) {
        int high = hla[0][0];
        int low = hla[0][1];
        for (int i = 0; i < days; i++) {
            if (hla[i][0] > high) {
                high = hla[i][0];
            }
            hlaYear[0] = high;
            if (hla[i][1] < low) {
                low = hla[i][1];
            }
            hlaYear[1] = low;
        }
        int temp = 0;
        for (int i = 0; i < days; i++) {
            temp += hla[i][2];
        }
        hlaYear[2] = temp / days;
        System.out.println("This years stats: High " + hlaYear[0] + " Low " + hlaYear[1] + " Average " + hlaYear[2]);
        wait(1000);
    }

    public static void hlaMonthStartEnd(int[][] hla, int[][] monthStartEnd, int days, int points, int[][] hlaMonth) {
        for (int i = 0; i < 12; i++) {
            int high = hla[monthStartEnd[i][0]][0];
            int low = hla[monthStartEnd[i][0]][1];
            int average = 0;
            for (int j = monthStartEnd[i][0]; j <= monthStartEnd[i][1]; j++) {
                if (hla[j][0] > high) {
                    high = hla[j][0];
                }
                if (low > hla[j][1]) {
                    low = hla[j][1];
                }
                average += hla[j][2];
            }
            average /= (monthStartEnd[i][1] - monthStartEnd[i][0] + 1);
            hlaMonth[i][0] = high;
            hlaMonth[i][1] = low;
            hlaMonth[i][2] = average;
        }
    }

    public static void parseHLA(String[] data, int[][] hla, int days) {
        for (int i = 0; i < days; i++) {
            String[] temps = data[i].split("-");
            hla[i][0] = Integer.parseInt(temps[2]);
            hla[i][1] = Integer.parseInt(temps[1]);
            hla[i][2] = (hla[i][0] + hla[i][1]) / 2;
        }
    }

    public static void parseMonth(String[] data, int[][] monthStartEnd, int days) {
        for (int i = 0; i < 12; i++) {
            monthStartEnd[i][0] = -1;
            monthStartEnd[i][1] = -1;
        }
        for (int i = 0; i < days; i++) {
            String[] parts = data[i].split("-");
            String date = parts[0];
            String[] dateParts = date.split("/");
            int month = Integer.parseInt(dateParts[0]);
            if (monthStartEnd[month - 1][0] == -1) {
                monthStartEnd[month - 1][0] = i;
            }
            monthStartEnd[month - 1][1] = i;
        }
    }

    public static String[] readData() {
        String[] data = new String[365];
        try {
            Scanner scan = new Scanner(new File("Unit_4/Unit_4_Project/Data.txt"));
            int i = 0;
            while (scan.hasNextLine() && i < 365) {
                data[i] = scan.nextLine();
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR READING FILE!");
        }
        return data;
    }

    public static void wait(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
        }
    }
}