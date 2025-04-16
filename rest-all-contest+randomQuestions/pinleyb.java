import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

public class pinleyb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            {
                 arr[i]=sc.nextLong();
            }
            long ans=1;
            for(int i=0;i<63;i++){
                ans=(ans<<1);
                
                boolean x=solve(arr,ans);
                if(x) break;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static boolean solve(long arr[],long x){
        TreeSet<Long> set=new TreeSet<>();
        int one=0;
        int zero=0;
        for(long i:arr){
            set.add(i%x);
        }
        if(set.size()==1) return false;
        return true;
    }
}

