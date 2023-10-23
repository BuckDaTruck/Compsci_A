package Unit_4.Day_1;

import java.util.ArrayList;

public class day1 {
    public static void main(String[] args) {
        int x = 10;
        int[] y = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // Output: [1, 2, 3]
        list.add(6656);
        System.out.println(y);
        System.out.println(list); // Output: [1, 2, 3]
    }
}
