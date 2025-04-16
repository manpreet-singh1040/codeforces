import java.util.*;

public class qa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           String ans="NO";
           int k=sc.nextInt();
           if(k%3==1) ans="YES";
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}