import java.util.Scanner;

public class a979 {
    public static void main(String[] args) {
     Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        // int[] ans=new int[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                int x=m.nextInt();
                max=Math.max(max,x);
                min=Math.min(min,x);
            }
            System.out.println((n-1)*(max-min));
            i++;
        }
        // for(int j:ans)
        // {
        //     System.out.println(j);
        // }
        m.close();
    }
}
