import java.util.*;
 public class q8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            String str=sc.next();
            if(n==1){
                System.out.println(2);
                t--;
                continue;
            }
            int cur=1;
            int ans=1;
            for(int i=1;i<n;i++){
                if(str.charAt(i-1)==str.charAt(i)){
                    cur++;
                }
                else{
                    cur=1;
                }
                ans=Math.max(ans,cur);
            }
            // ans=Math.max(ans,cur);
            System.out.println(ans+1);
            
           
            t--;
        }
        sc.close();
    }
 }