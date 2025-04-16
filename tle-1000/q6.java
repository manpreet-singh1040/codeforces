import java.util.*;

public class q6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();
            int brr[]=new int[n];
            // ArrayList<int []> arr=new ArrayList<>();
            // ArrayList<Integer> arr2=new ArrayList<>();
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
               brr[i]=temp;
            }
            int cur=0;
            long ans=0;
            for(int i=0;i<n;i++){
                if(brr[i]<=q){
                    cur++;
                }
                else{
                    if(cur>=k){
                        long x=cur-k+1;
                        ans+=( (x*(x+1))/2 );
                    }
                    cur=0;
                }
            }
            if(cur>=k){
                long x=cur-k+1;
                ans+=( (x*(x+1))/2 );
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}