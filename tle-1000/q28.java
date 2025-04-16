import java.util.*;

public class q28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int n=sc.nextInt();
           String str=sc.next();
           int ans=0;
           int cur=0;
           for(int i=0;i<n;i++){
            if(str.charAt(i)=='(') cur++;
            else{
                if(cur==0) ans++;
                else cur--;
            }
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}