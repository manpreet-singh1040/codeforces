import java.util.*;
 public class q27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           int n=sc.nextInt();
           int x=sc.nextInt();
           long sum=0;
           long ans=0;
           for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            ans+=( (temp)/x + ((temp%x!=0) ? 1:0) );
            sum+=temp;
           }
           System.out.println((sum/x + (sum%x!=0 ? 1:0 )) +" "+ans );
            t--;
        }
        sc.close();
    }
}