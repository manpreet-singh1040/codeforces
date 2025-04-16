import java.util.*;
 public class q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            long ans=b;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]+1<=a)ans+=(long)((arr[i]));
                else ans+=(long)(a-1);
            }
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