import java.util.*;
public class qc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        qc obj=new qc();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String ans="NO";
            if(n==1){
                if(k==2) ans="YES";
            }
            else if(k==1){
                ans= ( obj.isPrime(n)) ? "YES":"NO";
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    boolean isPrime(int x){
        if (x <= 1) return false;
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0) return false;
        }
         return true;
    }
}