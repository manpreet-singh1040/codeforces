import java.util.*;
public class qd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int zero=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0) zero++;
            }
            int ans=0;
            if(zero>=k){

                int start=0;
                int end=n/k;
                int mid=(start+end)/2;
                while(start<=end){
                    mid=(start+end)/2;
                    if(check(arr, k, mid)){
                        ans=mid;
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static boolean check(int arr[],int k,int ans){
        int temp[]=new int[ans];
        Arrays.fill(temp,-1);
        int size=0;
        int cur=0;
        for(int i:arr){
            if(i<ans){
                if(temp[i]==cur-1){
                    temp[i]=cur;
                    size++;
                }
            }
            if(size==ans){
                cur++;
                size=0;
            }
        }
        return cur>=k;
    }
}