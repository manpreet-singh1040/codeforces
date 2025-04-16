import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<PriorityQueue<Integer>> temp=new ArrayList<>();
            int ans=Integer.MAX_VALUE;
            int last[]=new int[k];
            Arrays.fill(last,-1);
            for(int i=0;i<k;i++){
                temp.add(new PriorityQueue<>(Collections.reverseOrder()));
            }
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                x--;
                temp.get(x).add(i-last[x]-1);
                last[x]=i;
            }
            for(int i=0;i<k;i++){
                temp.get(i).add(n-last[i]-1);
            }
            for(int i=0;i<k;i++){
                int y=temp.get(i).poll();
                int x1=y/2;
                int x2=Integer.MIN_VALUE;
                if(!temp.get(i).isEmpty()) x2=temp.get(i).poll();
                ans=Math.min(ans,Math.max(x2,x1));
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }

    static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        else {
            if (a >= b)
                return gcd(a % b, b);
            else
                return gcd(b % a, a);
        }
    }
}