public class subString {
    public static void main(String[] args) {
        String s = "hello";
        for (int n = s.length(); n >= 1; --n) {
            // s.substring(start,end)
            for (int i = 0, j = n; j <= s.length(); ++i, ++j) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
