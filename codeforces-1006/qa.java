import java.util.*;

public class qa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int ans=-1;
            if(k<= n*p && (-1*n*p)<=k){
                if(k<0) k=-k;
                ans=(k/p);
                if(k%p!=0) ans++;
            }
            System.out.println(ans);
            t--;
        }
    }
}