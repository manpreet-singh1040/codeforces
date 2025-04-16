import java.util.*;
 public class q24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           long a=sc.nextLong();
           long b=sc.nextLong();
           if(a==b){
            System.out.println("0 0");
           }
           else{
            long x=Math.max(a,b);
            long y=Math.min(a,b);
            long a1=x-y;
            long a2=Math.min(Math.abs(y%a1),Math.abs(x%a1));
            a2=Math.min(a1-(x%a1),a2);
            a2=Math.min(a1-(y%a1),a2);
            System.out.println(a1+" "+a2);
           }
            t--;
        }
        sc.close();
    }
}