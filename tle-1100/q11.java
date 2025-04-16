import java.util.*;

public class q11 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long ans=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                ans+=arr[i];
            }
            long sum=ans;
            Arrays.sort(arr);
            long temp1[]=new long[n];
            long temp2[]=new long[n];
            long sum1=0;
            long sum2=0;
            for(int i=0,j=n-1;i<n; i++,j--){
                sum1+=arr[i];
                sum2+=arr[j];
                temp1[i]=sum1;
                temp2[j]=sum2;
            }
            
            // ans=0;
            ans=Math.min(ans,temp2[n-k]);
            ans=Math.min(ans,temp1[(k)*2-1]);
           
                for(int i=0,j=n-1;i<k-1;i++,j--){
                    ans=Math.min(ans ,  (temp2[j]+temp1[(k-i-1)*2-1])  );
                }
            System.out.println((sum-ans));
            t--;
        }
    }
    static boolean check(int x,int y){
        for(int i=0;i<32;i++){
            int p=(x & (1<<i))==0 ? 0:1; 
            int q=(y & (1<<i))==0 ? 0:1; 
            if(p==0 && q==1){
                return false;
            }
        }
        return true;
    }
}