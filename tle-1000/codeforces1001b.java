import java.util.*;

public class codeforces1001b{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
           }
           String ans="YES";
           for(int i=0;i<n;i++){
            if(arr[i]<=Math.max((2*(n-1-i)),(2*i))){
                ans="NO";
                break;
            }
           }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}