import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class globalRound28b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int j=n;
            int i=1;
            int x=1;
            while(i<=j)
            {
                if(x%k==0)
                {
                    System.out.print(i+" ");
                    i++;
                }
                else{
                    System.out.print(j+" ");
                    j--;
                }
                x++;
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
