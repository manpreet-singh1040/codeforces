import java.util.*;

public class q29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           long a=sc.nextLong();
           long b=sc.nextLong();
           long l=Math.min(a,b);
           long h=Math.max(a,b);
           int ans=0;
           int temp=0;
           if(l!=h){
            while(h>l && h%2==0){
                temp++;
                h=h/2;
            }
            if(h!=l) ans=-1;
            else{
                // System.out.println("temp --> "+temp);
                ans+=(temp/3);
                temp=(temp)%3;
                ans+=(temp/2);
                temp=(temp)%2;
                ans+=(temp);
            }
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}