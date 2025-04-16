import java.util.*;
 public class q28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           int n=sc.nextInt();
           int k=sc.nextInt();
           int step=(n)/2+1;
           int arr[]=new int[n*k];
           long ans=0;
           for(int i=0;i<n*k;i++){
            arr[i]=sc.nextInt();
           }
           for(int i=0,j=n*k-step;i<k;j-=step,i++){
            ans+=arr[j];
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
        
    }
}