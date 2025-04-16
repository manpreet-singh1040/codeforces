import java.util.*;

public class codeforces1001c{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int n=sc.nextInt();
           long arr[]=new long[n];
           long sum=0;
           for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
             sum+=arr[i];
           }
           long ans=sum;
           for(int i=0;i<n-1;i++){
            Long curSum=(long)0;
            for(int j=1;j<n-i;j++){
                arr[j-1]=arr[j]-arr[j-1];
                curSum+=arr[j-1];
            }
            ans=Math.max(ans,curSum);
            ans=Math.max(ans,-curSum);
           }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}