
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("this", "X", 1));
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(catDog("1cat1cadodog"));
        System.out.println(endOther("Hiabc", "abc"));
    }

    public static boolean endOther(String a, String b) {
        String a2 = a.toLowerCase();
        String b2 = b.toLowerCase();
        if (a2.length() > b2.length()) {
            return a2.substring(a2.length() - b2.length()).equals(b2);
        } else {
            return b2.substring(b2.length() - a2.length()).equals(a2);
        }
    }

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

    public static boolean prefixAgain(String prefix, int n) {
        String prefix2 = prefix.substring(0, n);
        for (int i = n; i < prefix.length() - n + 1; i++) {
            if (prefix.substring(i, i + n).equals(prefix2)) {
                return true;
            }
        }
        return false;
    }

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