import java.util.*;
 public class q22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long ans=0;
            int n=sc.nextInt();
            int one=0;
            int zero=0;
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(temp==1) one++;
                if(temp==0) zero++;
            }
            ans=(long)(one)*((long)(Math.pow(2,zero))==0 ? 1: (long)(Math.pow(2,zero)) );
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}