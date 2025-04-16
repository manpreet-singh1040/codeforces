import java.util.*;
public class qa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextInt();
            long ans=n*2;
            System.out.println( (n%2==0) ? "NO" :"YES" );
            t--;
        }
        sc.close();
    }
}