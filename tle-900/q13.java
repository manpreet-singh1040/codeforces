import java.util.*;
 public class q13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int ans=0;
            int n=sc.nextInt();
            int z=0;
            int x=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0) z++;
            }
            for(int i=1;i<n;i++){
                if(arr[i-1]==0 && arr[i]!=0){
                    x++;
                }
            }
            if(arr[n-1]==0) x++;
            if(z==0) ans=1;
            else if(z==n) ans=0;
            else if((x==1 && (arr[0]==0 || arr[n-1]==0)) || ( x==2 && arr[0]==0 && arr[n-1]==0  )) ans=1;
            else ans=2;
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
 }