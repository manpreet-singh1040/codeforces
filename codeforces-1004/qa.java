import java.util.*;

public class qa {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            String ans="NO";
            if(b-a==1){
                ans="YES";
            }
            else if(a!=b){

                if(a>b){
                    if((a-b+1)%9==0){
                        ans="YES";
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
    }
    
    // static long check(int arr[],int k){
    //     long ans=0;
    //     long max=Long.MIN_VALUE;
    //     long min=Long.MAX_VALUE;
    //     long cur=0;
    //     for(int i=0;i<arr.length;i++){
    //         cur+=arr[i];
    //         if((i+1)%k==0){
    //             max=Math.max(max,cur);
    //             min=Math.min(min,cur);
    //             cur=0;
    //         }
    //     }
    //     ans=max-min;
    //     return ans;
    // }
}