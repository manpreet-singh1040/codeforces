import java.util.*;

public class q26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long k=sc.nextLong();
            long ans=k+k*y-1;
            long temp=(ans/(x-1))+ ((ans%(x-1)==0) ? 0 : 1 ) ;
            ans=temp+k;
            System.out.println(ans);

            t--;
        }
        sc.close();
    }
    
}