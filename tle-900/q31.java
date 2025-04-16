import java.util.*;
 public class q31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           long n=sc.nextLong();
           if(n==1){
            System.out.println(0);
            t--;
            continue;
           }
           int two=0;
           int three=0;
           long temp=n;
           while(temp>0 && temp%2==0){
            two++;
            temp=temp/2;
           }
           temp=n;
           while(temp>0 && temp%3==0){
            three++;
            temp=temp/3;
           }
           temp=1;
           temp*=Math.pow(2,two);
           temp*=Math.pow(3,three);
           if((temp)!=n)
             System.out.println((-1));
           else{
            if(two>three) System.out.println(-1);
            else System.out.println((2*three-two));
           }
            t--;
        }
        sc.close();
    }
}
