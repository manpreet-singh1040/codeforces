import java.util.*;
public class qb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            if(n==2){
                arr[0]=2;
                arr[1]=1;
            }
            else if(k==1){
                for(int i=0;i<n-1;i++){
                    arr[i]=n;
                }
                arr[n-1]=n-1;
            }
            else {
                arr[n-2]=n;
                arr[n-1]=n-1;
                int temp= (k%2==0) ?  n-1 : n;
                for(int i=0;i<n-2;i++){
                    arr[i]=temp;
                }
            }
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}