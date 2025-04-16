import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextInt();
            long ans=0;
            long a=sc.nextInt();
            long b=sc.nextInt();
            long lcm=(a*b)/gcd(a,b);
            long al=n/a-n/lcm;
            long bl=n/b-n/lcm;
            ans=((n*(n+1))/2)-( ((n-al)*(n-al+1))/2 );
            ans-=( (bl*(bl+1))/2 );
            System.out.println(ans);
            t--;
        }
        sc.close();
    }

    static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        else {
            if (a >= b)
                return gcd(a % b, b);
            else
                return gcd(b % a, a);
        }
    }
}