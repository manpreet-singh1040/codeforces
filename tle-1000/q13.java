import java.util.*;

public class q13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=0;
            int min=arr[0];
            int max=arr[0];
            for(int i=0;i<n;i++){
                min=Math.min(min,arr[i]);
                max=Math.max(max,arr[i]);
                if(max-min>k*2){
                    ans++;
                    min=arr[i];
                    max=arr[i];
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static void copy(int arr1[],int arr2[]){
        for(int i=0;i<26;i++){
            arr1[i]=arr2[i];
        }
    }
}