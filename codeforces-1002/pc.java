import java.util.*;
 public class pc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           int n=sc.nextInt();
           int arr[][]=new int[n][n];
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
           }
           PriorityQueue<Integer> pq=new PriorityQueue<>();
           for(int i=0;i<n;i++){
            int cur=0;
            for(int j=n-1;j>=0;j--){
                if(arr[i][j]==1) cur++;
                else break;
            }
            if(cur!=0) pq.add(cur);
           }
           int ans=0;
           
           if(pq.size()==0){
            ans=1;
           }
           else{
            int x=1;
            while(!pq.isEmpty() && x<=n-1){
                if(pq.peek()>=x){

                    x++;
                    ans++;
                }
                pq.poll();
            }
            ans++;
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
