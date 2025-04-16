import java.util.*;
 public class q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int z=-1;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    z=i;
                }
            }
            if(n%2==0){
                System.out.println(2);
                System.out.println("1 "+n);
                System.out.println("1 "+n);
            }
           else{
            System.out.println(4);
            System.out.println("1 "+(n-1));
                System.out.println("1 "+(n-1));
                System.out.println((n-1)+" "+n);
                System.out.println((n-1)+" "+n);
           }
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