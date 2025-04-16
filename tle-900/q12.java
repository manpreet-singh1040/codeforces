import java.util.*;
 public class q12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int ans=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(i>0) ans=Math.max(arr[i-1]-arr[i],ans);
                if(i<n-1)min=Math.min(min,arr[i]);
                if(i>0)max=Math.max(max,arr[i]);
            }
            ans=Math.max(ans,arr[n-1]-arr[0]);
            if(n==1) ans=0;
            else{
                int temp=Math.max(arr[n-1]-min,max-arr[0]);
                ans=Math.max(ans,temp);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
 }