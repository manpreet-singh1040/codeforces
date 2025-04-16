import java.util.*;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextInt();
            long mod=(long) (10e9 +7);
            long ans=0;
            long x=(n*(n+1));
            x=(x*((2*n+1)));
            x=x/6;
            // x=(x%(mod-7));
            long y=(n*(n-1))/2;
            // y=y%(mod-7);
            long z=((n-1)*(n));
            z=( (z*((2*n-1)))/6 );
            // z=z%(mod-7);
            System.out.println(x+" "+y+" "+z);
            ans=(x+y+z);
            ans=(ans);
            System.out.println("answer  --- >"+ans);
            ans=(ans*2022);
            ans=(ans%mod);
            System.out.println("answer  --- >"+ans);
            t--;
        }
    }
}