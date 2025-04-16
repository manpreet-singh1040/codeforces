import java.util.*;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = n - 1;
            int ans = -1;
            // if(ans==0) ans=arr[i];
            while (i < j) {
                if (arr[i] != arr[j]) {
                    if (ans == -1) {
                        ans = Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j]);
                    } else {
                        ans = gcd(ans, Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j]));
                    }
                    // if (ans == 1) {
                    //     ans = -1;
                    //     break;
                    // }
                }
                i++;
                j--;
            }
            i=0;
            j=n-1;
            while(i<j){
                if(arr[i]%ans!=arr[j]%ans){
                    ans=-1;
                    break;
                }
                i++;
                j--;
            }
            if (ans == -1)
                System.out.println(0);
            else
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