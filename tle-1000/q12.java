import java.util.*;

public class q12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long b=sc.nextLong();
            long s=sc.nextLong();
            if(b>s/k || ( b< (s-(k-1)*(n-1))/k  )    ){
                System.out.println(-1);
            }
            else{
                long ans[]=new long[(int)n];
                long maxB=s/k;
                ans[0]=b*k;
                long cur=s-ans[0];
                int x= (b!=0 ? 1:0) ;
                while(cur>0 && x<n){
                    // System.out.println(cur);
                    if(cur>=k-1){
                        ans[x]=k-1;
                    }
                    else{
                        ans[x]=cur;
                    }
                    x++;
                    cur=cur-(k-1);
                    // System.out.println("after the change--> "+cur);
                }
                if(cur>0) ans[0]+=cur;
                // if(cur>0) System.out.println(-1);
                // else{

                    for(long i: ans){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                // }
            }
            t--;
        }
        sc.close();
    }
    static void copy(int arr1[],int arr2[]){
        for(int i=0;i<26;i++){
            arr1[i]=arr2[i];
        }
    }
}