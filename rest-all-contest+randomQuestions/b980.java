import java.util.PriorityQueue;

public class b980 {
    public static void main(String[] args) {
        java.util.Scanner m=new java.util.Scanner(System.in);
        int t=m.nextInt();
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int k=m.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                int temp=m.nextInt();
                pq.add(temp);
                max=Math.max(max,temp);
            }
            if(max>=k) System.out.println(k);
            else{
                int ans=0;
                int cur=0;
                int min=pq.peek();
                if(min*pq.size()>=k)
                {
                    ans=k;
                }
                else{
                    
                }
            }
            i++;
        }
        // for(int j:ans)
        // {
        //     System.out.println(j);
        // }
        m.close();
    }
}
