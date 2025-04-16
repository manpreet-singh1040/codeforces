import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            int qrr[]=new int[q];
            long ans[]=new long[q];
            ArrayList<Integer> temp1=new ArrayList<>();
            ArrayList<Long > sum=new ArrayList<>();
            long curSum=0;
            int curMax=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                curSum+=arr[i];
                curMax=Math.max(curMax, arr[i]);
                temp1.add(curMax);
                sum.add(curSum);
            }
            for(int i=0;i<q;i++){
                qrr[i]=sc.nextInt();
            }
            for(int i=0;i<q;i++){
                int x=qrr[i];
                int y=upperBound(temp1, x);
                y--;
                if(y>=0){
                    ans[i]=sum.get(y);
                }
            }
            // System.out.println("answer--->");
            for(Long i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
    static int upperBound(ArrayList<Integer> arr,int x){
        int n=arr.size();
        int start=0;
        int end=n;
        int mid=(end-start)/2+start;
        while(start<end){
            mid=(end-start)/2+start;
            if(arr.get(mid)<=x){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        else {
            if (a >= b)
                return gcd(a % b, b);
            else
                return gcd(b % a, a);
        }
    }
}