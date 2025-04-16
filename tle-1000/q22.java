import java.util.*;

public class q22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int step=0;
            int ans=0;
            if(b==1){ b++; ans++; step++;}
            ans+=solve(a,b);
            // System.out.println(a+" "+b+" "+ans);
            boolean flag=true;
            while(flag && step<a){
                step++;
                b++;
                int temp1=a;
                int temp2=b;
                int x=solve(temp1, temp2);
                // System.out.println(a+" "+b+" "+x);
                if(x+step>ans){
                    break;
                }
                else{
                    ans=step+x;
                }

            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static int solve(int a,int b){
        int ans=0;
        while(a>0){
            a=(a/b);
            ans++;
        }
        return ans;
    }
}