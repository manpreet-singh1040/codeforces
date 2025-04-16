import java.util.*;
 public class q11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1) arr[i]++;
            }
            if(n>1){
                for(int i=1;i<n;i++){
                   
                        if(arr[i]%arr[i-1]==0){
                            arr[i]++;
                        }
                }
            }
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
 }