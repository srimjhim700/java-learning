import java.lang.Thread;
public class Stopwatch {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        int minutes = Integer.parseInt(args[0]);
        int seconds =minutes * 60;
        while (seconds >= 0) {
            int m= seconds / 60;
            int s= seconds % 60;
            System.out.printf("%d :%02d\n",m,s);
            seconds -=1;
            Thread.sleep(1000); 
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        }
    }
    
}
