import java.util.*;
 public class q30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           String str=sc.next();
           int one=0;
           int zero=0;
           for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') zero++;
            else one++;
           }
           if(Math.min(one,zero)%2==0) System.out.println("NET");
           else System.out.println("DA");
           
            t--;
        }
        sc.close();
    }
}
