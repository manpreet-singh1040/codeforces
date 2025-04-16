import java.util.*;
public class codeTona {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                min=Math.min(min,arr[i]);
            }
            String ans="YES";
            if(arr[0]!=min) ans="NO";
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
