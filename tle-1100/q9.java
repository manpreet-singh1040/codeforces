import java.util.*;

public class q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long c=sc.nextLong();
            long arr[]=new long[n];
            long sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                sum+=arr[i];
            }
            long start=0;
            long end=(long)Math.sqrt(c)+2;
            long ans=start+(end-start)/2;
            while(start<=end){
                ans=start+(end-start)/2;
               long temp=check(ans,arr,c);
            //    System.out.println(ans+"  "+temp);
               if(temp==c){
                break;
               }
               else if(temp>c){
                   end=ans-1;
                }
                else{
                    start=ans+1;
               }
            }
            
            System.out.println(ans);

            t--;
        }
    }
    static long check(long w, long arr[],long c){
        long sum=0;
        for(long i:arr){
            sum+=((2*w+i)*(2*w+i) );
            if(sum>c){
                break;
            }
        }
        return sum;
    }
}