



import java.util.*;
public class a987 {
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
            int ans=1;
            int cur=1;
            for(int j=1;j<n;j++)
            {
                if(arr[j-1]==arr[j])
                {
                    cur++;
                }
                else{
                    ans=Math.max(ans,cur);
                    cur=1;
                }
            }
            ans=Math.max(ans,cur);
            System.out.println(n-ans);
            t--;
        }
        sc.close();
    }
}
