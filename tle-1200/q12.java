import java.util.*;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ans=0;
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            ArrayList<Integer> lib=new ArrayList<>();
            ArrayList<Integer> ass=new ArrayList<>();
            int zeros=0;
            for(int i=0;i<n;i++){
                if(brr[i]-arr[i]==0) zeros++;
                else if(brr[i]-arr[i]>0) ass.add(brr[i]-arr[i]);
                else lib.add(brr[i]-arr[i]);
            }
            Collections.sort(ass);
            Collections.sort(lib,Collections.reverseOrder());
            int i=0;
            int j=0;
            while(j<lib.size() && i<ass.size()){
                long cur=0;
                int k=i;
                for(;k<ass.size();k++){
                    cur+=ass.get(k);
                    if(lib.get(j)+cur>=0){
                        ans++;
                        i=k+1;
                        break;
                    }
                }
                j++;
            }
                ans+=((ass.size()-i+zeros)/2);
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