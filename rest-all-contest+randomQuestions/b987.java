import java.util.*;

public class b987 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            // HashSet<Integer> set=new HashSet<Integer>();
            String ans="YES";
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            if((arr[0]!=1 && arr[1]!=1) || (arr[n-1]!=n && arr[n-2]!=n))
            {
                ans="NO";
                System.out.println(ans);
            }
            else if(n==1)
            {
                System.out.println("YES");
            }
            else{

                for(int i=1;i<n-1;i++)
                {
                    if(arr[i]!=i+1)
                    {
                        if((arr[i-1]!=i+1) && (arr[i+1]!=i+1))
                        {

                            ans="NO";
                            break;
                        }
                    }
                }
                System.out.println(ans);
            }
            t--;
        }
        sc.close();
    }
}