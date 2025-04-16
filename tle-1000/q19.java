import java.util.*;

public class q19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            long ans=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Comparator<int []> comp=(a,b)->{
                return b[0]-a[0];
            };
            PriorityQueue<int []> pq=new PriorityQueue<>(comp);
            for(int i=0;i<n;i++){
                pq.add(new int[]{arr[i],i+1});
            }
            int brr[]=new int[n+1];
            int x=1;
            while(!pq.isEmpty()){
                int temp[]=pq.poll();
                brr[temp[1]]=x;
                if(x<0){
                    x=(-x)+1;
                }
                else{
                    x=-x;
                }
            }
            for(int i=1;i<=n;i++){
                ans+=Math.abs((long)arr[i-1]*(long)brr[i]*2);
            }
            System.out.println(ans);
            for(int i: brr){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
    
}