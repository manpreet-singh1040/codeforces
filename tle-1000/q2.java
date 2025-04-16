import java.util.*;

public class q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ans=Integer.MAX_VALUE;
            int arr[]=new int[n];
            int temp[]=new int[10];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                temp[arr[i]-1]++;
            }
            if(n==1) System.out.println( (arr[0]%k)==0 ? 0: (k-arr[0]%k) );
            else if(k==2){
                if(temp[1]+temp[3]+temp[5]+temp[7]+temp[9]>0) System.out.println(0);
                else System.out.println(1);
            }
            else if(k==4){
                if(temp[1]+2*temp[3]+temp[5]+2*temp[7]+temp[9]>=2) System.out.println(0);
                else{
                    if(temp[2]+temp[6]>0 || (temp[1]+2*temp[3]+temp[5]+2*temp[7]+temp[9]==1) ) System.out.println(1);
                    else System.out.println(2);
                }
            }
            else{
                for(int i=0;i<10;i++){
                    if((i+1)%k==0 && temp[i]!=0) ans=0;
                    if(temp[i]>0){
                        ans=Math.min(ans,(k-(i+1)%k));
                    }
                }
                System.out.println(ans);
            }
            t--;
        }
        sc.close();
    }
}