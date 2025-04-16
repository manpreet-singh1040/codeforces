import java.util.*;
 public class q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();
            String ans="YES";
            long maxSum=(n*(n+1))/2-(((n-k)*(n-k+1))/2) ;
            long minSum=(((k)*((k)+1))/2);
            // System.out.println(minSum);
            if(minSum>x || maxSum < x) ans="NO";

            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static int sol(int i,int j,int [] arr){
        int ans=0;
        int x=arr[j];
        int y=arr[i];
        while(y>=x && y!=0){
            y=(y>>1);
            ans++;
        }
        arr[j]=x;
        arr[i]=y;
        return ans;
    }
 }