import java.util.*;
 public class q26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           long n=sc.nextLong();
           if(Long.bitCount(n)==1) System.out.println("NO");
           else System.out.println("YES");
            t--;
        }
        sc.close();
    }
}