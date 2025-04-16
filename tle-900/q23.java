import java.util.*;
 public class q23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long ans=0xffffffff;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                ans=( ans &temp);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}