import java.util.Scanner;

public class goodba {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            String ans="YES";
            int x=0;
            for(int i=1;i<n;i++)
            {
                if(Math.max(arr[i],arr[i-1])-Math.min(arr[i],arr[i-1])>=Math.min(arr[i],arr[i-1]))
                {
                    x++;
                }
            }
            if(x==n-1) ans="NO";
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
