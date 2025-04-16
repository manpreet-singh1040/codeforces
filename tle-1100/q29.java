import java.util.*;

public class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long ans=0;
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            long x=arr[0];
            long y=arr[1];
            for(int i=2;i<n;i++){
                if(i%2==0) x=gcd(x, arr[i]);
                else y=gcd(y,arr[i]);
            }
            if(x==1 && y==1){
                ans=0;
            }
            else{
                boolean flag=true;
                for(int i=1;i<n;i+=2){
                    if(arr[i]%x==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    ans=x;
                }
                flag=true;
                for(int i=0;i<n;i+=2){
                    if(arr[i]%y==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    ans=y;
                }
            }
            System.out.println(ans);
            t--;
        }
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