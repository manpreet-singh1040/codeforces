import java.util.*;

public class q28 {
    public static void main(String[] args) {
        StringBuilder finalAns=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ans=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int i=n-2;
            while(i>=0){
                if(arr[i]!=arr[n-1]){
                    ans++;
                    i-=(n-i-1);
                }
                else{
                    i--;
                }
            }
            // finalAns.append(ans);
            // finalAns.append("\n");
            System.out.println(ans);
            t--;
        }
        sc.close();;
        // System.out.println(finalAns);
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