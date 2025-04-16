import java.util.*;
public class q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arr[i]+=(i+1);
            }
            Arrays.sort(arr);
            long cur=0;
            int i=0;
            while(i<n && cur<=k){
                cur+=arr[i];
                i++;
            }
            if(cur>k) i--;
            System.out.println(i);
            t--;
        }
    }
}