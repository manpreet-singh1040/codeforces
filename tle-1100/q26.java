import java.util.*;

public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ans=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ArrayList<Long> arr1=new ArrayList<>();
            ArrayList<Long> arr2=new ArrayList<>();
            long sum=0;
            for(int i:arr){
                sum+=i;
                arr1.add(sum);
            }
            sum=0;
            for(int i=n-1;i>=0;i--){
                sum+=arr[i];
                arr2.add(sum);
            }
            for(int i=0;i<n-1;i++){
                long x=arr1.get(i);
                int q=Collections.binarySearch(arr2, x);
                if(q>=0){
                    q=n-1-q;
                    if(q>i){
                        ans=Math.max(ans, (i+1+n-q) );
                    }
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