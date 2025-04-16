import java.util.*;

public class a981 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            int ans=0;
            for(int j=0;j<n;j++)
            {
                int min=0;
                for(int i=0;i<n-j;i++)
                {
                    min=Math.min(min,arr[i][j+i]);
                }
                ans+=(min*-1);
            }
            for(int i=1;i<n;i++)
            {
                int min=0;
                for(int j=0;j<n-i;j++)
                {
                    min=Math.min(min,arr[i+j][j]);
                }
                ans+=(min*-1);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
