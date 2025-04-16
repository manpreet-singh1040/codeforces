import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class globalRound28a {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            if(n%33==0) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        sc.close();
    }
}
