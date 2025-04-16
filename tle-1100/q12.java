import java.util.*;

public class q12 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long ans=1;
            long mod=1000000007;
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int x=0;
            int f=0;
            int y=0;
            for(int i:arr1){
                while(x<n){
                    if(arr2[x]>=i) break;
                    x++;
                }
                    if(f==0){
                        f=1;
                        ans=(ans*(long)(x));
                    }
                    else{
                        ans=(ans*(long)(x-y));
                    }
                    if(ans> mod)ans=ans%mod;
                y++;
            }
            System.out.println(ans%mod);
            t--;
        }
    }
}