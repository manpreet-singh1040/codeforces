
import java.util.*;
public class a172 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            long sum=0;
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                sum+=x;
                pq.add(x);
            }
            if(sum<=k)
            {
                System.out.println(k-sum);
            }
            else{
                long curSum=0;
                int prev=-1;
                while(curSum<k)
                {
                    int x=pq.poll();
                    prev=x;
                    curSum+=x;
                }
                System.out.println(k-(curSum-prev));
            }
            t--;
        }
        sc.close();
    }
}
