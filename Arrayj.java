import java.util.Arrays;
import java.util.Scanner;

public class Arrayj {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter th esize of the array : ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for (int i=0;i<a.length;++i) {
            System.out.println(i+"th value: ");
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        System.out.println("size: ");
        size=sc.nextInt();
        for (int i=0;i<size;++i){
            System.out.println(i);
            a[i]=sc.nextInt();
        }
    }
    
}
