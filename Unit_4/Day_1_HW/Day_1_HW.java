package Unit_4.Day_1_HW;

public class Day_1_HW {
    public static void main(String[] args) {
        int[] numbers = { 5, 233, 39, -431, 7 };
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}