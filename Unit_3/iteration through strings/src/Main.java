
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("this", "X", 1));
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(catDog("1cat1cadodog"));
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(bobThere("acbob"));
        System.out.println(mixString("abc", "xyz"));
    }
    /**
     * Returns a string that interleaves the characters of two input strings.
     * The resulting string has the first character of the first input string, followed by the first character of the second input string,
     * then the second character of the first input string, followed by the second character of the second input string, and so on.
     * If the input strings are not of equal length, the resulting string will have length equal to the length of the shorter input string.
     *
     * @param a the first input string
     * @param b the second input string
     * @return the interleaved string
     */
    public static String mixString(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        return result;
    }
    /**
     * Returns true if the input string contains a 'b' followed by another 'b' separated by one character.
     * Otherwise, returns false.
     * 
     * @param str the input string to be checked
     * @return true if the input string contains a 'b' followed by another 'b' separated by one character, false otherwise
     */
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    /**
     * Returns true if either string appears at the very end of the other string, ignoring upper/lower case differences.
     * @param a the first string to compare
     * @param b the second string to compare
     * @return true if either string appears at the very end of the other string, ignoring upper/lower case differences.
     */
    public static boolean endOther(String a, String b) {
        String a2 = a.toLowerCase();
        String b2 = b.toLowerCase();
        if (a2.length() > b2.length()) {
            return a2.substring(a2.length() - b2.length()).equals(b2);
        } else {
            return b2.substring(b2.length() - a2.length()).equals(a2);
        }
    }

    /**
     * Returns true if the given string contains the same number of "cat" and "dog" substrings.
     * 
     * @param str the string to check for "cat" and "dog" substrings
     * @return true if the given string contains the same number of "cat" and "dog" substrings, false otherwise
     */
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    /**
     * Checks if a given prefix appears more than once in the rest of a string.
     * @param prefix the prefix to check for
     * @param n the length of the prefix to check
     * @return true if the prefix appears more than once in the rest of the string, false otherwise
     */
    public static boolean prefixAgain(String prefix, int n) {
        String prefix2 = prefix.substring(0, n);
        for (int i = n; i < prefix.length() - n + 1; i++) {
            if (prefix.substring(i, i + n).equals(prefix2)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string that concatenates the given word 'count' times, separated by the given separator.
     * 
     * @param word the string to be repeated
     * @param sep the separator to be used between the repeated strings
     * @param count the number of times the string should be repeated
     * @return the concatenated string
     */
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
            if (i < count - 1) {
                result += sep;
            }
        }
        return result;
    }
}