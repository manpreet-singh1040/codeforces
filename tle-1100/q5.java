import java.util.*;

public class q5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long ans=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    ans=Math.max(ans,check(arr, i));
                }
            }
            System.out.println(ans);
            t--;
        }
    }
    static long check(int arr[],int k){
        long ans=0;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if((i+1)%k==0){
                max=Math.max(max,cur);
                min=Math.min(min,cur);
                cur=0;
            }
        }
        ans=max-min;
        return ans;
    }
}