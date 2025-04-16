import java.util.*;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            long ans = 0;
            int arr[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (str.charAt(i - 1) == '0') {
                    for (int j = i; j <= n; j += (i)) {
                        if (str.charAt(j - 1) == '0') {
                            if (arr[j] == 0) {

                                ans += (i);
                                arr[j] = 1;
                            }
                        }
                        if (str.charAt(j - 1) == '1')
                            break;
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }

    static int upperBound(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0;
        int end = n;
        int mid = (end - start) / 2 + start;
        while (start < end) {
            mid = (end - start) / 2 + start;
            if (arr.get(mid) <= x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
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