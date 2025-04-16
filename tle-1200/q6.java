import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ans=1;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n!=1){
                // ans=1;
                int i=0;
                for(i=0;i<n-1;i++){
                    if(arr[i]!=arr[i+1]) break;
                }
                if(i<n-1){
                    // System.out.println("the valies "+i);
                    int f=(arr[i]>arr[i+1]) ? 1:0;
                    for(int j=i;j<n-1;j++){
                        if(f==1){
                            if(arr[j]<arr[j+1]){
                                f=0;
                                ans++;
                            }
                        }
                        else{
                            if(arr[j]>arr[j+1]){
                                f=1;
                                ans++;
                            }
                        }
                    }
                    ans++;
                }
            }
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