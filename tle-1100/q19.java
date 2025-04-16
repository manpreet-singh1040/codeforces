import java.util.*;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            long ans=0;
            long min=Integer.MAX_VALUE;
            int cur=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0) cur++;
                ans+=Math.abs(arr[i]);
                min=Math.min(min,Math.abs(arr[i]));
            }
            if(cur%2==1) ans-=(2*min);
            System.out.println(ans);
            t--;
        }
    }
}