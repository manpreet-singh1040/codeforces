import java.util.*;

public class q6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int q=sc.nextInt();
            int qrr[]=new int[q];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<q;i++){
                qrr[i]=sc.nextInt();
            }
            int max=322;
            for(int i: qrr){
                if(i < max){
                    for(int j=0;j<n;j++){
                        if(arr[j]%(int)Math.pow(2,i)==0){
                            arr[j]+=((int)Math.pow(2,i-1));
                        }
                    }
                    max=i;
                }
            }
            // System.out.println(t+" ---> ");
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
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