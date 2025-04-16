import java.util.*;
 public class q15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n==1){
                System.out.println(0);
                t--;
                continue;
            }
            int ans=0;
            for(int i=n-2;i>=0;i--){
                if(arr[i]>=arr[i+1]){
                    ans+=sol(i,i+1,arr);
                    if(arr[i]>=arr[i+1]){
                        ans=-1;
                        break;
                    }
                }
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