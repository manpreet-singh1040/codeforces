import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

public class hello2025b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                if(map.containsKey(x))
                {
                    map.put(x,map.get(x)+1);
                }
                else{
                    map.put(x,1);
                }
            }
            Comparator<int []> comp=(a,b)->{
                return a[1]-b[1];
            };
            PriorityQueue<int []> pq=new PriorityQueue<>(comp);
            for(Map.Entry<Integer,Integer> i: map.entrySet())
            {
                // System.out.println(i.getKey()+" "+i.getValue());
                pq.add(new int[]{i.getKey(),i.getValue()});
            }
            // System.out.println("size "+pq.size());
            while( pq.size()>1 && pq.peek()[1]<=k)
            {
                int xpp[]=pq.poll();
                // System.out.print(" "+xpp[0]);
                k-=xpp[1];
            }
            // System.out.println("size "+pq.size());
            System.out.println(pq.size());
            t--;
        }
        sc.close();
    }
}
