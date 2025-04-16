import java.util.*;

public class q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            Comparator<int []> comp=(a,b)->{
                return b[0]-a[0];
            };
            PriorityQueue<int []> pq=new PriorityQueue<>(comp);
            long ans=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int k=sc.nextInt();
                int arr[]=new int[k];
                for(int j=0;j<k;j++){
                    arr[j]=sc.nextInt();
                    min=Math.min(min,arr[j]);
                }
                Arrays.sort(arr);
                pq.add(new int[]{arr[1],arr[0]});
            }
            while(pq.size()>1){
                ans+=((long)pq.peek()[0]);
                pq.poll();
            }
            ans+=((long)min);
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}