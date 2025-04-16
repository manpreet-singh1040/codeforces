import java.util.*;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long ans=1;
            int arr[]=new int[n];
            long sum=0;
            long temp[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                temp[i]=sum;
            }
            for(int i=0;i<n-1;i++){
                ans=Math.max(ans, gcd( temp[i] ,temp[n-1]-temp[i]   ) );
            }
            System.out.println(ans);
            t--;
        }
    }
    static long gcd(long a,long b){
        if(a==0) return b;
        if(b==0) return a;
        else{
            if(a>b) return gcd(a%b,b);
            else return gcd(a,b%a);
        }
    }
}