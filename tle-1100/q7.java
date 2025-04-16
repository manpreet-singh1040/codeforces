import java.util.*;

public class q7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            long x=sc.nextInt();
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
                else{
                    map.put(arr[i],1);
                }
            }
            long ans=0;
            long cur=0;
            long sum=0;
            long prev=-1;
            for(Map.Entry<Integer,Integer> i: map.entrySet()){
                if(prev!=-1){
                    long dif=i.getKey()-prev;
                    if(x-(cur*dif)>=0){

                        sum+=(cur*dif);
                        x-=(cur*dif);
                        ans=i.getKey();
                    }
                    else{
                        long y=x/cur;
                        ans=y+prev;
                        x=0;
                        break;
                    }

                }
                prev=i.getKey();
                cur+=i.getValue();
            }
            if(x>0){
                long y=x/cur;
                        ans=y+prev;
            }
            System.out.println(ans);
            t--;
        }
    }
    static long check(int arr[],int k){
        long ans=0;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if((i+1)%k==0){
                max=Math.max(max,cur);
                min=Math.min(min,cur);
                cur=0;
            }
        }
        ans=max-min;
        return ans;
    }
}