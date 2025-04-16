import java.util.*;

public class q24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            // int arr[]=new int[n][m];
            long sum=0;
            int min=Integer.MAX_VALUE;
            int cur=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int temp=sc.nextInt();
                    if(temp<0) cur++;
                    sum+=Math.abs(temp);
                    min=Math.min(Math.abs(temp),min);
                }
            }
            if(cur%2==0){
                System.out.println(sum);
            }
            else{
                System.out.println(sum-2*min);
            }
            t--;
        }
        sc.close();
    }
    
}