import java.util.*;

public class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t > 0) {
            int n = sc.nextInt();
            int k= sc.nextInt();
            int temp[]=new int[51];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(temp[x]==0) temp[x]=i+1;
            }
            int ans[]=new int[k];
            for(int i=0;i<k;i++){
                int x=sc.nextInt();
                ans[i]=temp[x];
                for(int j=1;j<=50;j++){
                    if(temp[j]!=0 && temp[j]<temp[x]){
                        temp[j]++;
                    }
                }
                temp[x]=1;
            }
            for(int i: ans){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
    }

    static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        else {
            if (a >= b)
                return gcd(a % b, b);
            else
                return gcd(b % a, a);
        }
    }
}