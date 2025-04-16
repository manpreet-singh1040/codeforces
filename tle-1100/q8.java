import java.util.*;

public class q8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long arr[][]=new long[n][2];
            int k=sc.nextInt();
            int a=sc.nextInt();
            a--;
            int b=sc.nextInt();
            b--;
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            long ans=Long.MAX_VALUE;
            ans=Math.min(ans,(Math.abs(arr[a][0]-arr[b][0])+Math.abs(arr[a][1]-arr[b][1])));
            if(a<k && b<k){
                ans=0;
            }
            else{
                int f=0;
                long disa=Long.MAX_VALUE;
                long disb=Long.MAX_VALUE;
                for(int i=0;i<k;i++){
                    f=1;
                    disa=Math.min(disa,Math.abs(arr[i][0]-arr[a][0]) + Math.abs(arr[i][1]-arr[a][1]) );
                    disb=Math.min(disb,Math.abs(arr[i][0]-arr[b][0]) + Math.abs(arr[i][1]-arr[b][1]) );
                }
                if(f==1)ans=Math.min(ans,disa+disb);
            }
            System.out.println(ans);
            t--;
        }
    }
}