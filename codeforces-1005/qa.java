import java.util.*;

public class qa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int n=sc.nextInt();
           String str=sc.next();
           int ans=0;
           if(str.charAt(0)=='1') ans++;
           for(int i=1;i<n;i++){
            if(str.charAt(i)!=str.charAt(i-1)) ans++;
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}