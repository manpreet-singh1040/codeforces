import java.util.*;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            String ans="YES";
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]!=1){
                ans="NO";
            }
            else{

                long cur=1;
                for(int i=1;i<n;i++){
                    if(arr[i]<=cur){
                        cur+=arr[i];
                    }
                    else{
                        ans="NO";
                        break;
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
    }

    static int gcd(int a, int b) {
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