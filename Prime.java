public class Prime {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int count=0;
        for(int i=2;i<Math.sqrt(n);++i){
            if (n%i==0){
                ++count;
                break;
            }
        }
        if(count==0){
            System.out.println(n +"is prime");
        }else{
            System.out.println(n +"is prime");
        }
    }
    
}
