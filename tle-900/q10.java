import java.util.*;
 public class q10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            int psum[]=new int[n];
            int cur=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arr[i]=arr[i]%2;
                cur+=arr[i];
                psum[i]=cur;
            }
            int sum=cur;
            while(q-- > 0){
                String ans="YES";
                int l=sc.nextInt();
                l--;
                int r=sc.nextInt();
                r--;
                int k=sc.nextInt();
                k=k%2;
                int nsum=psum[r];
                if(l>0) nsum-=psum[l-1];

                if((sum-nsum+((k)*(r-l+1)))%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            t--;
        }
        sc.close();
    }
 }