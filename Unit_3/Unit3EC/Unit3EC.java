package Unit_3.Unit3EC;

import java.util.Scanner;

public class Unit3EC {
    public static void main(String[] args) {
        //guessingGame();
        printFives(100);
        System.out.println(sumEvens(4, 67));
        System.out.println(removeVowels("hello"));
        System.out.println(endYZ("day fez hold boy mom sister five hey"));
        rollSnakeEyes();
        longestStreak("CCAAAAATTT!");
        System.out.println(isNot("is test"));
    }

    public static void guessingGame() {
        // Write a program that simulates a guessing game.
        // In the guessing game, the computer picks a random number from 0-100 and you
        // have to guess it (use scanner).
        // After each guess, the computer will give you clues like “Too high” or “Too
        // low”.
        // When you guess the correct answer, the computer should print off "You got
        // it!" and then reports how many guesses it took you.
        int attempts = 0;
        int guess;
        int answer = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            System.out.print("Guess a number between 0 and 100: ");
            guess = scan.nextInt();
            attempts++;
            if (guess == answer) {
                System.out.println("You got it!");
                System.out.println("It took you " + attempts + " attempts.");
                correct = true;
            } else if (guess > answer) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
        scan.close();
    }

    public static void printFives(int input) {
        // Write a void method called printFives that takes an integer parameter and
        // prints every multiple of 5 between it and 0 inclusive, in descending order.
        // If the number is not greater than 0 print "error". Print all numbers on one
        // line with single spaces in between.
        if (input < 0) {
            System.out.println("error");
        } else {
            for (int i = input; i >= 0; i--) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public static double sumEvens(double low, double high) {
        // Write a method called sumEvens which takes in a start point and end point and
        // returns the sum of all even numbers in that range.
        double sum = 0;
        for (double i = low; i <= high; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static String removeVowels(String input) {
        // Write a method called removeVowels which takes a string parameter and returns
        // a string with all vowels (a, e, i, o, u) removed from it.
        // You can assume the string will have at least one letter and that all
        // characters will be lowercase.
        // -> removeVowels("hello") hll
        // -> removeVowels("computer") cmptr
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o'
                    && input.charAt(i) != 'u') {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public static int endYZ(String input) {
        // Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
        // in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
        // sensitive).
        // We'll say that a y or z is at the end of a word if there is not an alphabetic
        // letter immediately following it.
        // -> countYZ("day fez") → 2
        // -> countYZ("day fyyyz") → 2
        int count = 0;
        String[] arr = input.split(" ");
        for (String word : arr) {
            if (word.charAt(word.length() - 1) == 'y' || word.charAt(word.length() - 1) == 'z') {
                count++;
            }
        }
        return count;
    }

    public static void rollSnakeEyes() {
        // How many times do you have to roll a pair of dice before they come up snake
        // eyes (roll a one on each die)?
        // Write a method called rollSnakeEyes() that simulates the experiment.
        // The method has no parameters but should return the number of rolls that it
        // makes before the dice come up snake eyes.
        // Use Math.random() to simulate rolling a random die.
        int rolls = 0;
        boolean snakeEyes = false;
        while (!snakeEyes) {
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            rolls++;
            if (die1 == 1 && die2 == 1) {
                snakeEyes = true;
            }
        }
        System.out.println("It took " + rolls + " rolls to get snake eyes.");
    }

    public static void longestStreak(String input) {
        // The method longestStreak is intended to determine the longest substring of
        // consecutive identical characters in the parameter str and print the result.
        // For example, the call longestStreak("CCAAAAATTT!") should print the result A5
        // because the longest substring of consecutive identical characters is AAAAA.
        // Complete the method below. Your implementation should conform to the example
        // above.
        input = input.toUpperCase();
        String longest = "";
        String current = "";
        for (int i = 0; i < input.length(); i++) {
            if (current.length() == 0) {
                current += input.charAt(i);
            } else if (input.charAt(i) == current.charAt(current.length() - 1)) {
                current += input.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + input.charAt(i);
            }
        }
        System.out.println(
                "the longest string was " + longest.length() + " character and the char was " + longest.charAt(0));
    }

    public static String isNot(String input) {
        // Given a string, return a string where every appearance of the lowercase word
        // "is" has been replaced with "is not".
        // The word "is" should not be immediately preceeded or followed by a letter --
        // so for example the "is" in "this" does not count.
        // (Note: Character.isLetter(char) tests if a char is a letter.)
        // -> notReplace("is test") → "is not test"
        // -> notReplace("is-is") → "is not-is not"
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (i > 0 && Character.isLetter(input.charAt(i - 1)) || (i + 2 < input.length() && Character.isLetter(input.charAt(i + 2)))) {
                output += input.charAt(i);
            } else if (input.substring(i, i + 2).equals("is")) {
                output += "is not";
                i++;
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }
}