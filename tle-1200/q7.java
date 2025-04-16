import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            long ans=0;
            ArrayList<Long> temp=new ArrayList<>();
            long arr[][]=new long[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            if(n>1){

                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        temp.add(arr[j][i]);
                    }
                    Collections.sort(temp);
                    long cur=0;
                    ans+=cur;
                    for(int k=1;k<temp.size();k++){
                        cur+=((k)*(temp.get(k)-temp.get(k-1)));
                        ans+=cur;
                    }
                    // System.out.println("the op for this is--->"+cur);
                    temp.clear();
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
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