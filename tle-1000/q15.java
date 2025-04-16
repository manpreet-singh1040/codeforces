import java.util.*;

public class q15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            int ans=n+10;
            int b=0;
            int w=0;
            for(int i=0;i<k;i++){
                if(str.charAt(i)=='B') b++;
                else w++;
            }
            ans=w;
            for(int i=k;i<n;i++){
                if(str.charAt(i-k)=='B') b--;
                else w--;
                if(str.charAt(i)=='B') b++;
                else w++;
                ans=Math.min(ans,w);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}