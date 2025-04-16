import java.util.*;

public class q4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int x=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0) x++;
            }
            long ans=0;
            long sum=(arr[0]>=0) ? arr[0] : 0;
            int max=Integer.MIN_VALUE;
            max=arr[0];
            ans=Math.max(ans,sum);
            for(int i=1;i<n;i++){
                sum+=arr[i];
                if(((Math.abs(arr[i])%2)^(Math.abs(arr[i-1])%2)) ==0){
                    sum=arr[i];
                }
                if(sum<0){
                    sum=0;
                }
                ans=Math.max(ans,sum);
                max=Math.max(max,arr[i]);
            }
            if(x==n) ans=max;
            System.out.println(ans);
            t--;
        }
    }
}