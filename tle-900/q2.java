import java.util.*;
 public class q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            String ans="YES";
            int temp[]=new int[26];
            for(int i=0;i<n;i++){
                temp[str.charAt(i)-'a']++;
            }
            int x=0;
            for(int i:temp){
                if( i%2==1 ){
                    x++;
                }
            }
            if(k==0 && x>1) ans="NO";
            // else if( k!=0 && k>x && (k-x )%2==1) ans="NO";
            else if( k!=0 && k<x-1 ) ans="NO";
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