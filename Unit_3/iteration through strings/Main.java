public class Main {
    public static void main(String[] args) {
       System.out.println(repeatSeparator("Word", "X", 3));

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