import java.util.*;
public class qb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String str=sc.next();
            int n=str.length();
            int ans=str.length()+2;
            int cur=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)!='0'){
                    // System.out.println("cur "+cur);
                    ans=Math.min(ans,cur+n-i);
                    cur++;
                }
            }
            ans--;
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}