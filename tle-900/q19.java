import java.util.*;
 public class q19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long start=sc.nextLong();
            long dis=sc.nextLong();
            long ans=start;
            int rem=(int)(dis%4);
            if(rem!=0){
                long x=0;
                if(rem==1){
                    x=-dis;
                }
                else if(rem==2) x=1;
                else if(rem==3) x=dis+1;
                // System.out.println(x);
                if(Math.abs(start)%2==1) x=x*-1;
                // System.out.println(x);
                ans+=x;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
 }