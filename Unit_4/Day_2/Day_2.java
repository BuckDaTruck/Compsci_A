package Unit_4.Day_2;

public class Day_2 {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        System.out.println("Average: " + average(numbers));
        System.out.println("Centered Average: " + centeredAverage(numbers));
        
    }
    
    public static void printArray(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
    public static double average(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;

        return average;
    }
    
    public static int centeredAverage(double[] numbers) {
        int sum = 0;
        int min = (int) numbers[0];
        int max = (int) numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = (int) Math.min(min, numbers[i]);
            max = (int) Math.max(max, numbers[i]);
        }
        sum -= (min + max);
        return sum / (numbers.length - 2);
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { 
            sum += numbers[i];
        }
        return sum;
    }
    public static double mean (double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) { 
            sum += numbers[i];
        }
        double mean = sum / numbers.length;
        return mean;
    }
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) { 
            max = Math.max(max, numbers[i]);
        }
        return max;
    }
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) { 
            min = Math.min(min, numbers[i]);
        }
        return min;
    }
    public static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

        return average;
    }
    
    public static int centeredAverage(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        sum -= (min + max);
        return sum / (numbers.length - 2);
    }
}
