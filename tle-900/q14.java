import java.util.*;
 public class q14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            if(n%4==0 || n%4==2 && n>=4){
                long max=(n/4);
                long min=n/6;
                if(n%6!=0) min++;
                System.out.println(min+" "+max);

            }
            else{
                System.out.println(-1);
            }
            t--;
        }
        sc.close();
    }
 }