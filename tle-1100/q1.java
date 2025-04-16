import java.util.*;

public class q1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            String str=sc.next();
            
            long ans=0;
            int temp[]=new int[26];
            for(int i=0;i<n;i++){
                temp[str.charAt(i)-'a']++;
                ans+=(i+1);
                if(i>0){
                    for(int j:temp){
                        if(j>1){
                            ans-=(j-1);
                        }
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}