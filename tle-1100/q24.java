import java.util.*;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ans=(int)Math.pow(2,31);
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(i!=x) ans=(ans & x );
                // System.out.println("ans --->"+ans);
            }
            System.out.println(ans);
            t--;
        }
    }
}