

public class PerfNo {
    public static void main(String[] args) {
        String s = "85hi 20 ab235cd 94e172"; // output 85 +20+235+94+172 =?

        String[] a = s.split("[^0-9]+");
        int sum = 0;
        for (int i=0;i<a.length;++i) {
            sum += Integer.parseInt(a[i]);
        }
        System.out.println("sum : " + sum);
    }

}
