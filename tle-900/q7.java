import java.util.*;
 public class q7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int ans=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
            Arrays.sort(arr);
            if(arr.length>1){
                int cur=1;
                for(int i=1;i<n;i++){
                    if(Math.abs(arr[i-1]-arr[i])<=k){
                        cur++;
                    }
                    else{
                        ans=Math.max(ans,cur);
                        cur=1;
                    }
                }
                ans=Math.max(ans,cur);
                ans=n-ans;
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