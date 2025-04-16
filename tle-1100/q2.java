import java.util.*;

public class q2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long ans=0;
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            int max=-1;
            int sum=0;
            for(int i=0;i<n && i<k;i++){
                sum+=arr[i];
                max=Math.max(max,brr[i]);
                ans=Math.max(ans,sum);
                if(k-i-1>0){
                    ans=Math.max(ans, ( sum+(max)*(k-i-1) ));
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}