import java.util.*;

public class qa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ans=0;
            if(n<3){
                ans=n+1;
            }
            else{
                // n++;
                n++;
                ans=(n/15)*3;
                ans+=Math.min(n%15,3);
            }
            System.out.println(ans);
            t--;
        }
    }
}