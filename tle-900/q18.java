import java.util.*;
 public class q18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String ans="NO";
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            if( (a+c)%2==0 && ((a+c)/2)%b==0 ){
                ans="YES";
            }
            else if(((b*2-c)%a==0 && (b*2-c) >0) || ( ( 2*b- a )%c==0 && ( 2*b- a )>0 )){
                ans="YES";
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
 }