
public class Main {
    public static void main(String[] args) {
       //System.out.println(repeatSeparator("this", "X",1));
         System.out.println(prefixAgain("abXYabc", 1));
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